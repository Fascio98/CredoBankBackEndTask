package NegativeCases;

import Data.NegativeCasesData;
import Data.TestDataProviders;
import Steps.UsersSteps;
import Utils.Stubs;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class GetUsersNegativeCases400ResponseCodeApiTests {
    Stubs stubs = new Stubs();
    UsersSteps usersSteps = new UsersSteps();
    NegativeCasesData negativeCasesData = new NegativeCasesData();

    @BeforeClass
    public void beforeClass() {
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
}

