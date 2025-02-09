package api;



import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import  io.restassured.*;

public class postApiSchemaValidator {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/api/postPet.json");

        baseURI="https://petstore.swagger.io/v2";
        given()
                .header("Content-Type","application/json")
                .accept("application/json")
                .body(f)
                .when()
                .post("/pet")
                .then();
//                .assertThat().body(matches)
//                .body(matchesJsonSchemaInClasspath("postPetSchema.json"));

    }


}
