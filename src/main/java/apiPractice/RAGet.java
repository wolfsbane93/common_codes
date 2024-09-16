package apiPractice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RAGet {
    public static void main(String[] args) {
        RestAssured.baseURI= "http://localhost:5000/status";
        Response response = given().contentType(ContentType.JSON)
                .when().get().then().statusCode(200).extract().response();
        System.out.println(response.getBody().prettyPrint());

    }

}
