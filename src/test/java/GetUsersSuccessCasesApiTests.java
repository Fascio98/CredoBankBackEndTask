import Data.TestDataProviders;
import Models.ResponseModels.User;
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
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    SuccessCasesData successCasesData = new SuccessCasesData();

    @BeforeClass
    public void beforeClass() {
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
}
