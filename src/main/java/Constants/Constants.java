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

    //Status Codes
    public int STATUS_CODE_200 = 200;
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
}
