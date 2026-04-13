package Data;

import Constants.Constants;
import Factory.UserFactory;
import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.Map;

public class TestDataProviders {
    UserFactory userFactory = new UserFactory();

    @DataProvider(name = "successCasesData")
    public Object[][] getSuccessCasesData() {
        return new Object[][] {
                // testName, queryParams, expectedUsers
                {"No query params", null, List.of(userFactory.john(), userFactory.anna())},
                {"Correct age=30", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.SECOND_QUERY_AGE_PARAM), List.of(userFactory.john())},
                {"Correct name=Anna", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.SECOND_QUERY_NAME_PARAM), List.of(userFactory.anna())},
                {"Correct gender=Female", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), List.of(userFactory.anna())},
                {"Correct age=25 and gender=Female", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), List.of(userFactory.anna())},
                {"Correct name=John and age=30", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.SECOND_QUERY_AGE_PARAM), List.of(userFactory.john())},
                {"Correct name=John and gender=Male", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.SECOND_QUERY_GENDER_PARAM), List.of(userFactory.john())},
                {"Correct name=John, age=30 and gender=Male", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.SECOND_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.SECOND_QUERY_GENDER_PARAM), List.of(userFactory.john())}
        };
    }

    @DataProvider(name = "negative200CasesData")
    public Object[][] getNegative200CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Empty list without params", null, Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect age", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect name", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect gender", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect age and gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect name and age", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect name and gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200},
                {"Incorrect age, name and gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM), Constants.EMPTY_LIST_RESPONSE_BODY, Constants.STATUS_CODE_200}
        };
    }

    @DataProvider(name = "negative500CasesData")
    public Object[][] getNegative500CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Internal Server Error", null, Constants.INTERNAL_SERVER_ERROR_RESPONSE_BODY, Constants.STATUS_CODE_500}
        };
    }

    @DataProvider(name = "negative400CasesData")
    public Object[][] getNegative400CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Invalid age", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid name", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid gender", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age and valid name", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Valid age and invalid name", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age and invalid name", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Valid age and invalid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age and invalid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid name and valid gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Valid name and invalid gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid name and invalid gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age, valid name and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Valid age, invalid name and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Valid age, valid name and invalid gender", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age, invalid name and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Valid age, invalid name and invalid gender", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age, valid name and invalid gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400},
                {"Invalid age, invalid name and invalid gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM), Constants.BAD_REQUEST_RESPONSE_BODY, Constants.STATUS_CODE_400}
        };
    }

    @DataProvider(name = "negative422CasesData")
    public Object[][] getNegative422CasesData() {
        return new Object[][] {
                // testName, queryParams, expectedResponse, expectedStatusCode
                {"Age with special characters", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Name with special characters", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Gender with special characters", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age with special characters and valid name", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Valid age and name with special characters", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age and name with special characters", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age with special characters and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Valid age and gender with special characters", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age and gender with special characters", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Name with special characters and valid gender", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Valid name and gender with special characters", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Name and gender with special characters", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age with special characters, valid name and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Valid age, name with special characters and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Valid age, valid name and gender with special characters", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age and with special characters and valid gender", Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Valid age, name and gender with special characters", Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age and gender with special characters and valid name", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422},
                {"Age, name and gender with special characters", Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS), Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY, Constants.STATUS_CODE_422}
        };
    }
}

