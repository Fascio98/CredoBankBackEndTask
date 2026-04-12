import Data.TestDataProviders;
import Models.ResponseModels.User;
import Models.ResponseModels.Users;
import Steps.UsersSteps;
import Utils.DatabaseHelper;
import Utils.Stubs;
import Utils.TestResultProcessor;
import Data.SuccessCasesData;
import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class GetUsersSuccessCasesApiTests {
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    SuccessCasesData successCasesData = new SuccessCasesData();
    DatabaseHelper databaseHelper = new DatabaseHelper();
    TestResultProcessor testResultProcessor = new TestResultProcessor();

    @BeforeClass
    public void beforeClass() {
        // Initialize database
        databaseHelper.initializeDatabase();
        
        // Setup WireMock stubs
        stubs.resetWiremock();
        for(int i = 0; i < successCasesData.positiveStubs.length; i++) {
            stubs.createStub(successCasesData.positiveStubs[i]);
        }
    }

    @Test(dataProvider = "successCasesData", dataProviderClass = TestDataProviders.class)
    public void testSuccessCases(String testName, Map<String, String> queryParams, List<User> expectedUsers) {
        Response response;
        
        if (queryParams == null) {
            response = usersSteps.sendRequestAndGetResponseWithoutQueryParams();
        } else {
            response = usersSteps.sendRequestAndGetResponseWithQueryParams(queryParams);
        }
        
        Users actualUsers = usersSteps.deserializeResponseToUsersModel(response);
        Users expectedUsersModel = usersSteps.buildUserList(expectedUsers);
        usersSteps.assertUsersResponse(actualUsers, expectedUsersModel);
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        testResultProcessor.processAndSaveTestResult(result, databaseHelper);
    }
}
