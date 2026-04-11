package Constants;

public class Constants {
    //APIs And Service Constants
    public String WIREMOCK_BASE_URL = "http://localhost:8080";
    public String SERVICE_ENDPOINT = "/api/users";

    //Query Params Names
    public String QUERY_AGE_PARAM_NAME = "age";
    public String QUERY_GENDER_PARAM_NAME = "gender";
    public String QUERY_NAME_PARAM_NAME = "name";

    //Query Params Correct Values
    public String QUERY_AGE_PARAM = "25";
    public String SECOND_QUERY_AGE_PARAM = "30";
    public String QUERY_GENDER_PARAM = "Female";
    public String SECOND_QUERY_GENDER_PARAM = "Male";
    public String QUERY_NAME_PARAM = "John";
    public String SECOND_QUERY_NAME_PARAM = "Anna";

    //Query Params Incorrect Values
    public String INCORRECT_QUERY_AGE_PARAM = "35";
    public String INCORRECT_QUERY_GENDER_PARAM = "Hobbit";
    public String INCORRECT_QUERY_NAME_PARAM = "abcDEafea";

    //Query Params Invalid Values
    public String INVALID_QUERY_AGE_PARAM = "-1";
    public String INVALID_QUERY_GENDER_PARAM = "412";
    public String INVALID_QUERY_NAME_PARAM = "421";

    //Query Params With Special Characters
    public String INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS = "John!@";
    public String INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS = "Male!@";
    public String INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS = "30!@";

    //Status Codes
    public int STATUS_CODE_200 = 200;
    public int STATUS_CODE_400 = 400;
    public int STATUS_CODE_422 = 422;
    public int STATUS_CODE_500 = 500;

    //Response Bodies For Negative Cases
    public String EMPTY_LIST_RESPONSE_BODY = "[]";
    public String INTERNAL_SERVER_ERROR_RESPONSE_BODY = """
            {
              "status": 500,
              "error": "Internal Server Error",
              "message": "Database connection failed",
              "path": "/api/users"
            }
            """;
    public String BAD_REQUEST_RESPONSE_BODY = """
            {
              "status": 400,
              "error": "Bad Request",
              "message": "Invalid query parameters",
              "path": "/api/users"
            }
            """;
    public String UNPROCESSABLE_ENTITY_RESPONSE_BODY = """
            {
              "status": 422,
              "error": "Unprocessable Entity",
              "message": "Validation failed",
              "errors": [
                {
                  "field": "name",
                  "message": "must not contain special characters"
                }
              ]
            }
            """;
}
