package Constants;

public class Constants {
    //APIs And Service Constants
    public static final String WIREMOCK_BASE_URL = "http://localhost:8080";
    public static final String SERVICE_ENDPOINT = "/api/users";

    //Query Params Names
    public static final String QUERY_AGE_PARAM_NAME = "age";
    public static final String QUERY_GENDER_PARAM_NAME = "gender";
    public static final String QUERY_NAME_PARAM_NAME = "name";

    //Query Params Correct Values
    public static final String QUERY_AGE_PARAM = "25";
    public static final String SECOND_QUERY_AGE_PARAM = "30";
    public static final String QUERY_GENDER_PARAM = "Female";
    public static final String SECOND_QUERY_GENDER_PARAM = "Male";
    public static final String QUERY_NAME_PARAM = "John";
    public static final String SECOND_QUERY_NAME_PARAM = "Anna";

    //Query Params Incorrect Values
    public static final String INCORRECT_QUERY_AGE_PARAM = "35";
    public static final String INCORRECT_QUERY_GENDER_PARAM = "Hobbit";
    public static final String INCORRECT_QUERY_NAME_PARAM = "abcDEafea";

    //Query Params Invalid Values
    public static final String INVALID_QUERY_AGE_PARAM = "-1";
    public static final String INVALID_QUERY_GENDER_PARAM = "412";
    public static final String INVALID_QUERY_NAME_PARAM = "421";

    //Query Params With Special Characters
    public static final String INVALID_QUERY_NAME_PARAM_SPECIAL_CHARACTERS = "John!@";
    public static final String INVALID_QUERY_GENDER_PARAM_SPECIAL_CHARACTERS = "Male!@";
    public static final String INVALID_QUERY_AGE_PARAM_SPECIAL_CHARACTERS = "30!@";

    //Status Codes
    public static final int STATUS_CODE_200 = 200;
    public static final int STATUS_CODE_400 = 400;
    public static final int STATUS_CODE_422 = 422;
    public static final int STATUS_CODE_500 = 500;

    //Response Bodies For Negative Cases
    public static final String EMPTY_LIST_RESPONSE_BODY = "[]";
    public static final String INTERNAL_SERVER_ERROR_RESPONSE_BODY = """
            {
              "status": 500,
              "error": "Internal Server Error",
              "message": "Database connection failed",
              "path": "/api/users"
            }
            """;
    public static final String BAD_REQUEST_RESPONSE_BODY = """
            {
              "status": 400,
              "error": "Bad Request",
              "message": "Invalid query parameters",
              "path": "/api/users"
            }
            """;
    public static final String UNPROCESSABLE_ENTITY_RESPONSE_BODY = """
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
