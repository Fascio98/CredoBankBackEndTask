package Utils;

import java.util.Map;

public class SuccessCasesData {
    Constants constants = new Constants();

    public String getStubWithoutParams(int status, String bodyFileName) {
        return """
                {
                "request": {
                    "method": "GET",
                    "url": "/api/users"
                  },
                  "response": {
                    "status": %d,
                    "bodyFileName": "%s"
                  }
                  }
        """.formatted(status, bodyFileName);
    }

    /**
     * Generate stub with multiple query parameters using Map
     */
    public String getStubWithQueryParams(int status, String bodyFileName, Map<String, String> queryParams) {
        StringBuilder queryParamsJson = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            if (count > 0) {
                queryParamsJson.append(",\n      ");
            }
            queryParamsJson.append("""
                      "%s": {
                        "equalTo": "%s"
                      }""".formatted(entry.getKey(), entry.getValue()));
            count++;
        }

        return """
                {
                  "request": {
                    "method": "GET",
                    "urlPath": "/api/users",
                    "queryParameters": {
                      %s
                    }
                  },
                  "response": {
                    "status": %d,
                    "bodyFileName": "%s"
                  }
                }
        """.formatted(queryParamsJson.toString(), status, bodyFileName);
    }

    public String [] stubs = {
            getStubWithoutParams(constants.STATUS_CODE_200, constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200Response.json"),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectAgeAndGenderResponse.json",
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectAgeNameAndGenderResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectAgeResponse.json",
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
            ),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameResponse.json",
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameAndAgeResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
            ),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameAndGenderResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM_NAME, constants.QUERY_GENDER_PARAM_NAME, constants.SECOND_QUERY_GENDER_PARAM)
            ),
            getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    constants.SUCCESS_RESPONSE_BASE_PATH + "IfUsersReturn200WithCorrectNameResponse.json",
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM)
            )
    };
}
