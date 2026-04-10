package Utils;

import java.util.Map;

public class SuccessCasesData {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();

    public String [] positiveStubs = {
            stubs.getStubWithoutParams(constants.STATUS_CODE_200, constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200Response.json"),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectAgeAndGenderResponse.json",
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectAgeNameAndGenderResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectAgeResponse.json",
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameResponse.json",
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameAndAgeResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameAndGenderResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_GENDER_PARAM_NAME, constants.SECOND_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM)
            )
    };
}
