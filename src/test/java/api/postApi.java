package api;

import com.sun.jna.WString;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.*;

public class postApi {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/api/postPet.json");

        baseURI="https://petstore.swagger.io/v2";


        Response response=given()
                .header("Content-Type","application/json")
                .accept("application/json")
                .body(f)
                .when()
                .post("/pet");


        int status = response.getStatusCode();
        Object id = response.jsonPath().get("id");
        System.out.println(status);
        System.out.println(id);
    }
}
