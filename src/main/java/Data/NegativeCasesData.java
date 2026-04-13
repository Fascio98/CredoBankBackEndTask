package Data;

import Constants.Constants;
import Utils.Stubs;

import java.util.Map;

public class NegativeCasesData {
    Stubs stubs = new Stubs();

    public String [] negativeStubs200ResponseCode = {
            stubs.getStubWithoutParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INCORRECT_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INCORRECT_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    Constants.EMPTY_LIST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INCORRECT_QUERY_NAME_PARAM)
            )
    };

    public String [] negativeStubs400ResponseCode = {
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_400,
                    Constants.BAD_REQUEST_RESPONSE_BODY,
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM)
            )
    };

        public String [] negativeStubs422ResponseCode = {
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM)
                ),
                stubs.getStubWithQueryParams(
                        Constants.STATUS_CODE_422,
                        Constants.UNPROCESSABLE_ENTITY_RESPONSE_BODY,
                        Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_GENDER_PARAM_NAME, Constants.INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS, Constants.QUERY_AGE_PARAM_NAME, Constants.INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS)
                )
        };
}
