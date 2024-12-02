package api;


import static io.restassured.RestAssured.*;



public class getApi {

    public static void main(String[] args) {

        baseURI="https://petstore.swagger.io/v2";

        given()
                .header("Content-Type","application/json")
                .when()
                .get("/pet/222")
                .then()
                .statusCode(200)
                .log().all();

    }
}
