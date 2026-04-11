import Constants.Constants;
import Factory.UserFactory;
import Models.ResponseModels.Users;
import Steps.UsersSteps;
import Utils.Stubs;
import Data.SuccessCasesData;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetUsersSuccessCasesApiTests {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    UserFactory userFactory = new UserFactory();
    Users actualUsers = new Users();
    @BeforeClass
    public void beforeClass() {
        SuccessCasesData successCasesData = new SuccessCasesData();
        for(int i = 0; i < successCasesData.positiveStubs.length; i++) {
            stubs.createStub(successCasesData.positiveStubs[i]);
        }
    }

    @Test
    public void testIfUsersReturn200() {
        Response response = usersSteps.sendRequestAndGetResponseWithoutQueryParams();
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, userFactory.users());
    }

//    @Test
//    public void testIfUserReturns200ButBackReturnsEmptyContainer() {
//        Response response = given()
//                .baseUri(WIREMOCK_URL)
//                .when()
//                .get("/api/users")
//                .then()
//                .extract().response();
//        System.out.println(response.asString());
//    }

    @Test
    public void testIfUserReturns200WithCorrectAge() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParam(constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectName() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParam(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectGender() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParam(constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectAgeAndGender() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParam(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM)
                .queryParam(constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectNameAndAge() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParam(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM)
                .queryParam(constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectNameAndGender() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParam(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM)
                .queryParam(constants.QUERY_GENDER_PARAM_NAME, constants.SECOND_QUERY_GENDER_PARAM)
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectAgeNameAndGender() {
        Response response = given()
                .baseUri(constants.WIREMOCK_BASE_URL)
                .queryParams(Map.of(
                        constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM,
                        constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM))
                .when()
                .get(constants.SERVICE_ENDPOINT)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }
}
