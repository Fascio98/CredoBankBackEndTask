package Utils;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Stubs {
    public void createStub(String json) {
        given()
                .header("Content-Type", "application/json")
                .body(json)
                .when()
                .post("/__admin/mappings")
                .then()
                .statusCode(201);
    }

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
}
