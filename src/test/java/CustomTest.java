import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CustomTest {

    @Test
    public void testIfUsersReturn200() {
        Response response = given()
                .baseUri("http://localhost:8080")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200ButBackReturnsEmptyContainer() {
        Response response = given()
                .baseUri("http://localhost:8080")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void testIfUserReturns200WithCorrectAge() {
        Response response = given()
                .baseUri("http://localhost:8080")
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
                .baseUri("http://localhost:8080")
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
                .baseUri("http://localhost:8080")
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
                .baseUri("http://localhost:8080")
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
                .baseUri("http://localhost:8080")
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
                .baseUri("http://localhost:8080")
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
                .baseUri("http://localhost:8080")
                .queryParam("name", "Jane")
                .queryParam("age", "25")
                .queryParam("gender", "Female")
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        System.out.println(response.asString());
    }
}
