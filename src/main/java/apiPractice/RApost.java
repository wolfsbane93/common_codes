package apiPractice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RApost {
    public static void main(String[] args) {
        RestAssured.baseURI="https://api.restful-api.dev/objects";
        String st =RestAssured.given().contentType(ContentType.JSON)
                .body("{\n" +
                        "   \"name\": \"Apple MacBook Pro 16\",\n" +
                        "   \"data\": {\n" +
                        "      \"year\": 2019,\n" +
                        "      \"price\": 1849.99,\n" +
                        "      \"CPU model\": \"Intel Core i9\",\n" +
                        "      \"Hard disk size\": \"1 TB\"\n" +
                        "   }\n" +
                        "}")
                .when().post()
                .then().extract().response().jsonPath().getString("id");
        System.out.println(st);
         Response rs =RestAssured.given().contentType(ContentType.JSON)
                .body("{\n" +
                        "   \"name\": \"Apple MacBook Pro 16\",\n" +
                        "   \"data\": {\n" +
                        "      \"year\": 2019,\n" +
                        "      \"price\": 1849.99,\n" +
                        "      \"CPU model\": \"Intel Core i9\",\n" +
                        "      \"Hard disk size\": \"1 TB\"\n" +
                        "   }\n" +
                        "}")
                .when().post()
                .then().extract().response();
        JsonPath jpath = rs.jsonPath();
        System.out.println(jpath.getFloat("data.price"));

    }
}
