package Steps;

import Constants.Constants;
import Models.ResponseModels.User;
import Models.ResponseModels.Users;
import io.restassured.response.Response;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UsersSteps {
    ObjectMapper objectMapper = new ObjectMapper();
    Constants constants = new Constants();

    public Users buildUserList(List<User> usersList) {
        return Users.builder()
                .users(usersList)
                .build();
    }

    public Response sendRequestAndGetResponseWithoutQueryParams() {
        return given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
    }

    public Response sendRequestAndGetResponseWithQueryParams(Map<String, String> queryParams) {
        return given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParams(queryParams)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
    }

    public Users deserializeResponseToUsersModel(Response response) {
        List<User> usersList = objectMapper.readValue(
                response.body().asString(),
                new TypeReference<List<User>>() {}
        );

        Users users = new Users();
        users.setUsers(usersList);
        return users;
    }

    public void assertUsersResponse(Users actualUsers, Users expectedUsers) {
        try {
            Assert.assertEquals(actualUsers.users.size(), expectedUsers.users.size());
            for (int i = 0; i < actualUsers.users.size(); i++) {
                Assert.assertEquals(actualUsers.users.get(i).getId(), expectedUsers.users.get(i).getId());
                Assert.assertEquals(actualUsers.users.get(i).getName(), expectedUsers.users.get(i).getName());
                Assert.assertEquals(actualUsers.users.get(i).getAge(), expectedUsers.users.get(i).getAge());
                Assert.assertEquals(actualUsers.users.get(i).getGender(), expectedUsers.users.get(i).getGender());
            }
        } catch (AssertionError error) {
            System.out.println("Assertion failed: " + error.getMessage());
            throw error; // Rethrow the error to ensure the test fails
        }
    }
}
