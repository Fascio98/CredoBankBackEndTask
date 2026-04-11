package NegativeCases;

import Constants.Constants;
import Data.NegativeCasesData;
import Steps.UsersSteps;
import Utils.Stubs;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class GetUsersNegativeCases400ResponseCodeApiTests {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    Response response;
    NegativeCasesData negativeCasesData = new NegativeCasesData();

    @BeforeClass
    public void beforeClass() {
        stubs.resetWiremock();
        for(int i = 0; i < negativeCasesData.negativeStubs500ResponseCode.length; i++) {
            stubs.createStub(negativeCasesData.negativeStubs500ResponseCode[i]);
        }
    }

    @Test
    public void testIfUserReturns500WithInvalidAge() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INVALID_QUERY_AGE_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400);
    }

    @Test
    public void testIfUserReturns500WithInvalidName() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INVALID_QUERY_NAME_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400);
    }

    @Test
    public void testIfUserReturns500WithInvalidGender() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_GENDER_PARAM_NAME,
                        constants.INVALID_QUERY_GENDER_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400);
    }

    @Test
    public void testIfUserReturns500WithInvalidAgeAndValidName() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INVALID_QUERY_AGE_PARAM,
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.QUERY_NAME_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400);
    }

    @Test
    public void testIfUserReturns500WithValidAgeAndInvalidName() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.QUERY_AGE_PARAM,
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INVALID_QUERY_NAME_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400);
    }

    @Test
    public void testIfUserReturns500WithInvalidAgeAndInvalidName() {
        response = usersSteps.sendRequestAndGetResponseWithQueryParams(
                Map.of(
                        constants.QUERY_AGE_PARAM_NAME,
                        constants.INVALID_QUERY_AGE_PARAM,
                        constants.QUERY_NAME_PARAM_NAME,
                        constants.INVALID_QUERY_NAME_PARAM
                ));
        usersSteps.assertNegativeUsersResponse(response, constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400);
    }
}
