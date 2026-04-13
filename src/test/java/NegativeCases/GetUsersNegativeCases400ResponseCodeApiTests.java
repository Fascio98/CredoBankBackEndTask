package NegativeCases;

import Data.NegativeCasesData;
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

public class GetUsersNegativeCases400ResponseCodeApiTests {
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    NegativeCasesData negativeCasesData = new NegativeCasesData();
    DatabaseHelper databaseHelper = new DatabaseHelper();
    TestResultProcessor testResultProcessor = new TestResultProcessor();

    @BeforeClass
    public void beforeClass() {
        // Initialize database
        databaseHelper.initializeDatabase();
        
        // Setup WireMock stubs
        stubs.resetWiremock();
        for(int i = 0; i < negativeCasesData.negativeStubs400ResponseCode.length; i++) {
            stubs.createStub(negativeCasesData.negativeStubs400ResponseCode[i]);
        }
    }

    @Test(dataProvider = "negative400CasesData", dataProviderClass = TestDataProviders.class)
    public void testNegative400Cases(String testName, Map<String, String> queryParams, String expectedResponse, int expectedStatusCode) {
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

