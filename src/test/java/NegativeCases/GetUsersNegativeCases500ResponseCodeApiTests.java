package NegativeCases;

import Constants.Constants;
import Data.TestDataProviders;
import Steps.UsersSteps;
import Utils.DatabaseHelper;
import Utils.Stubs;
import Utils.TestResultProcessor;
import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class GetUsersNegativeCases500ResponseCodeApiTests {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    DatabaseHelper databaseHelper = new DatabaseHelper();
    TestResultProcessor testResultProcessor = new TestResultProcessor();

    @BeforeClass
    public void beforeClass() {
        stubs.resetWiremock();
        stubs.createStub(stubs.getStubWithoutParams(
                constants.STATUS_CODE_500,
                constants.INTERNAL_SERVER_ERROR_RESPONSE_BODY
        ));
    }

    @Test(dataProvider = "negative500CasesData", dataProviderClass = TestDataProviders.class)
    public void testNegative500Cases(String testName, Map<String, String> queryParams, String expectedResponse, int expectedStatusCode) {
        Response response;
        
        if (queryParams == null) {
            response = usersSteps.sendRequestAndGetResponseWithoutQueryParams();
        } else {
            response = usersSteps.sendRequestAndGetResponseWithQueryParams(queryParams);
        }
        
        usersSteps.assertNegativeUsersResponse(response, expectedResponse, expectedStatusCode);
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        testResultProcessor.processAndSaveTestResult(result, databaseHelper);
    }
}
