package Data;

import Constants.Constants;
import Utils.Stubs;

import java.util.Map;

public class NegativeCasesData {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();

    public String [] negativeStubs200ResponseCode = {
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

    public String [] negativeStubs500ResponseCode = {
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_400,
                    constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.INVALID_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.INVALID_QUERY_AGE_PARAM)
            )
    };
}
