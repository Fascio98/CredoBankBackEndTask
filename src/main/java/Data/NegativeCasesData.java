package Data;

import Constants.Constants;
import Utils.Stubs;

import java.util.Map;

public class NegativeCasesData {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();

    public String [] negativeStubs = {
            stubs.getStubWithoutParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INCORRECT_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INCORRECT_QUERY_NAME_PARAM)
            )
    };
}
