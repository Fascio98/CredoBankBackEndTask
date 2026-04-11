package NegativeCases;

import Constants.Constants;
import Data.NegativeCasesData;
import Steps.UsersSteps;
import Utils.Stubs;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class GetUsersNegativeCases200ResponseCodeApiTests {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    Response response;
    NegativeCasesData negativeCasesData = new NegativeCasesData();
    @BeforeClass
    public void beforeClass() {
        stubs.resetWiremock();
        for(int i = 0; i < negativeCasesData.negativeStubs200ResponseCode.length; i++) {
            stubs.createStub(negativeCasesData.negativeStubs200ResponseCode[i]);
        }
    }

    @Test
    public void testIfUsersReturn200ButEmptyList() {
        response = usersSteps.sendRequestAndGetResponseWithoutQueryParams();
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectAge() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INCORRECT_QUERY_AGE_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectName() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INCORRECT_QUERY_NAME_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.INCORRECT_QUERY_GENDER_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectAgeAndGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INCORRECT_QUERY_AGE_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.INCORRECT_QUERY_NAME_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectNameAndAge() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INCORRECT_QUERY_NAME_PARAM,
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INCORRECT_QUERY_AGE_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectNameAndGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INCORRECT_QUERY_NAME_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.INCORRECT_QUERY_GENDER_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }

    @Test
    public void testIfUserReturns200WithIncorrectAgeNameAndGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INCORRECT_QUERY_NAME_PARAM,
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INCORRECT_QUERY_AGE_PARAM,
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.INCORRECT_QUERY_GENDER_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200);
    }
}
