package Data;

import Constants.Constants;
import Factory.UserFactory;
import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.Map;

public class TestDataProviders {
    Constants constants = new Constants();
    UserFactory userFactory = new UserFactory();

    @DataProvider(name = "successCasesData")
    public Object[][] getSuccessCasesData() {
        return new Object[][] {
                // testName, queryParams, expectedUsers
                {"No query params", null, List.of(userFactory.john(), userFactory.anna())},
                {"Correct age=30", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM), List.of(userFactory.john())},
                {"Correct name=Anna", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM), List.of(userFactory.anna())},
                {"Correct gender=Female", Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), List.of(userFactory.anna())},
                {"Correct age=25 and gender=Female", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), List.of(userFactory.anna())},
                {"Correct name=John and age=30", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM), List.of(userFactory.john())},
                {"Correct name=John and gender=Male", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.SECOND_QUERY_GENDER_PARAM), List.of(userFactory.john())},
                {"Correct name=John, age=30 and gender=Male", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.SECOND_QUERY_GENDER_PARAM), List.of(userFactory.john())}
        };
    }

    @DataProvider(name = "negative200CasesData")
    public Object[][] getNegative200CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Empty list without params", null, constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect age", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect name", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect gender", Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect age and gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect name and age", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect name and gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200},
                {"Incorrect age, name and gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM), constants.EMPTY_LIST_RESPONSE_BODY, constants.STATUS_CODE_200}
        };
    }

    @DataProvider(name = "negative500CasesData")
    public Object[][] getNegative500CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Internal Server Error", null, constants.INTERNAL_SERVER_ERROR_RESPONSE_BODY, constants.STATUS_CODE_500}
        };
    }

    @DataProvider(name = "negative400CasesData")
    public Object[][] getNegative400CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Invalid age", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid name", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid gender", Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age and valid name", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Valid age and invalid name", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age and invalid name", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age and valid gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Valid age and invalid gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age and invalid gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid name and valid gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Valid name and invalid gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid name and invalid gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age, valid name and valid gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Valid age, invalid name and valid gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Valid age, valid name and invalid gender", Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age, invalid name and valid gender", Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Valid age, invalid name and invalid gender", Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age, valid name and invalid gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400},
                {"Invalid age, invalid name and invalid gender", Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM), constants.BAD_REQUEST_RESPONSE_BODY, constants.STATUS_CODE_400}
        };
    }
}

