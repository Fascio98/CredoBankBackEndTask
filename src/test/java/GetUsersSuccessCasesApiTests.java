import Utils.SuccessCasesData;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsersSuccessCasesApiTests {
    private static final String WIREMOCK_URL = "http://localhost:8080";

    @BeforeClass
    public void beforeClass() {
        // 3. add stub - Unknown (empty result)
        SuccessCasesData successCasesData = new SuccessCasesData();
        for(int i = 0; i < successCasesData.stubs.length; i++) {
            createStub(successCasesData.stubs[i]);
        }
    }

    private void createStub(String json) {
        given()
                .header("Content-Type", "application/json")
                .body(json)
                .when()
                .post("/__admin/mappings")
                .then()
                .statusCode(201);
    }

    @Test
    public void testIfUsersReturn200() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

//    @Test
//    public void testIfUserReturns200ButBackReturnsEmptyContainer() {
//        Response response = given()
//                .baseUri(WIREMOCK_URL)
//                .when()
//                .get("/api/users")
//                .then()
//                .extract().response();
//        System.out.println(response.asString());
//    }

    @Test
    public void testIfUserReturns200WithCorrectAge() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("age", "30")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectName() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("name", "Anna")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectGender() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("gender", "Female")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectAgeAndGender() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("age", "25")
                .queryParam("gender", "Female")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectNameAndAge() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("name", "John")
                .queryParam("age", "30")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectNameAndGender() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("name", "John")
                .queryParam("gender", "Male")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectAgeNameAndGender() {
        Response response = given()
                .baseUri(WIREMOCK_URL)
                .queryParam("name", "Anna")
                .queryParam("age", "25")
                .queryParam("gender", "Female")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }
}
