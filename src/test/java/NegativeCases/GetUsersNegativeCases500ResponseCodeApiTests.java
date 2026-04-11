package NegativeCases;

import Constants.Constants;
import Steps.UsersSteps;
import Utils.Stubs;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetUsersNegativeCases500ResponseCodeApiTests {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    Response response;

    @BeforeClass
    public void beforeClass() {
        stubs.resetWiremock();
        stubs.createStub(stubs.getStubWithoutParams(
                constants.STATUS_CODE_500,
                constants.INTERNAL_SERVER_ERROR_RESPONSE_BODY
        ));
    }

    @Test
    public void testIfUsersReturn500() {
        response = usersSteps.sendRequestAndGetResponseWithoutQueryParams();
        usersSteps.assertNegativeUsersResponse(response, constants.INTERNAL_SERVER_ERROR_RESPONSE_BODY, constants.STATUS_CODE_500);
    }
}
