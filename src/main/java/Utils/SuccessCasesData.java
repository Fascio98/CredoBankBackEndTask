package Utils;

import java.util.Map;

public class SuccessCasesData {
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
            getStubWithoutParams(200, "SuccessFiles/IfUsersReturn200Response.json"),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectAgeAndGenderResponse.json",
                    Map.of("age", "25", "gender", "Female")
            ),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectAgeNameAndGenderResponse.json",
                    Map.of("name", "Anna", "age", "25", "gender", "Female")
            ),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectAgeResponse.json",
                    Map.of("age", "30")
            ),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectNameResponse.json",
                    Map.of("gender", "Female")
            ),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectNameAndAgeResponse.json",
                    Map.of("name", "John", "age", "30")
            ),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectNameAndGenderResponse.json",
                    Map.of("name", "John", "gender", "Male")
            ),
            getStubWithQueryParams(
                    200,
                    "SuccessFiles/IfUsersReturn200WithCorrectNameResponse.json",
                    Map.of("name", "Anna")
            )
    };
}
