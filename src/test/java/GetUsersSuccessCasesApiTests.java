import Constants.Constants;
import Factory.UserFactory;
import Models.ResponseModels.Users;
import Steps.UsersSteps;
import Utils.Stubs;
import Data.SuccessCasesData;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class GetUsersSuccessCasesApiTests {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    UserFactory userFactory = new UserFactory();
    Users actualUsers = new Users();
    Response response;
    SuccessCasesData successCasesData = new SuccessCasesData();
    @BeforeClass
    public void beforeClass() {
        stubs.resetWiremock();
        for(int i = 0; i < successCasesData.positiveStubs.length; i++) {
            stubs.createStub(successCasesData.positiveStubs[i]);
        }
    }

    @Test
    public void testIfUsersReturn200() {
        response = usersSteps.sendRequestAndGetResponseWithoutQueryParams();
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.john(), userFactory.anna())));
    }

    @Test
    public void testIfUserReturns200WithCorrectAge() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.SECOND_QUERY_AGE_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.john())));
    }

    @Test
    public void testIfUserReturns200WithCorrectName() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.SECOND_QUERY_NAME_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.anna())));
    }

    @Test
    public void testIfUserReturns200WithCorrectGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.QUERY_GENDER_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.anna())));
    }

    @Test
    public void testIfUserReturns200WithCorrectAgeAndGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.QUERY_AGE_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.QUERY_GENDER_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.anna())));
    }

    @Test
    public void testIfUserReturns200WithCorrectNameAndAge() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.QUERY_NAME_PARAM,
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.SECOND_QUERY_AGE_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.john())));
    }

    @Test
    public void testIfUserReturns200WithCorrectNameAndGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.QUERY_NAME_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.SECOND_QUERY_GENDER_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.john())));
    }

    @Test
    public void testIfUserReturns200WithCorrectAgeNameAndGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.QUERY_NAME_PARAM,
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.QUERY_AGE_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.SECOND_QUERY_GENDER_PARAM
                ));
        actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        usersSteps.assertUsersResponse(actualUsers, usersSteps.buildUserList(List.of(userFactory.anna())));
    }
}
