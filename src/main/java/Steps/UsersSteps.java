package Steps;

import Constants.Constants;
import Models.ResponseModels.User;
import Models.ResponseModels.Users;
import io.restassured.response.Response;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UsersSteps {
    ObjectMapper objectMapper = new ObjectMapper();

    public Users buildUserList(List<User> usersList) {
        return Users.builder()
                .users(usersList)
                .build();
    }

    public Response sendRequestAndGetResponseWithoutQueryParams() {
        return given()
                .baseUri(Constants.WIREMOCK_BASE_URL)
                .when()
                .get(Constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
    }

    public Response sendRequestAndGetResponseWithQueryParams(Map<String, String> queryParams) {
        return given()
                .baseUri(Constants.WIREMOCK_BASE_URL)
                .queryParams(queryParams)
                .when()
                .get(Constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
    }

    public Users deserializeResponseToUsersModel(Response response) {
        String responseBody = response.body().asString();
        
        // Log response for debugging
        System.out.println("Response Status: " + response.getStatusCode());
        System.out.println("Response Body: " + responseBody);
        
        try {
            List<User> usersList = objectMapper.readValue(
                    responseBody,
                    new TypeReference<>() {}
            );

            Users users = new Users();
            users.setUsers(usersList);
            return users;
        } catch (Exception e) {
            System.err.println("Failed to deserialize response. Body was: " + responseBody);
            throw new RuntimeException("Deserialization failed", e);
        }
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

    public void assertNegativeUsersResponse(Response actualResponse, String expectedResponseBody, int expectedStatusCode) {
        try {
            Assert.assertEquals(actualResponse.getStatusCode(), expectedStatusCode);
            
            // Compare JSON semantically, not as strings (to ignore whitespace/formatting differences)
            var expectedJson = objectMapper.readTree(expectedResponseBody);
            var actualJson = objectMapper.readTree(actualResponse.body().asString());
            Assert.assertEquals(actualJson, expectedJson);
        } catch (JsonProcessingException e) {
            System.err.println("Failed to parse JSON response: " + e.getMessage());
            throw new AssertionError("JSON parsing failed", e);
        } catch (AssertionError error) {
            System.out.println("Assertion failed: " + error.getMessage());
            throw error; // Rethrow the error to ensure the test fails
        }
    }
}
