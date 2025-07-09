package Assignment_Questions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PostRequestWithPOJO {
    public static void main(String[] args) {
        // Set base URI
        RestAssured.baseURI = "https://api.restful-api.dev";

        // Create data object
        Data data = new Data();
        data.setYear(2019);
        data.setPrice(1849.99);
        data.setCPUmodel("Intel Core i9");
        data.setHarddisksize("1 TB");

        // Create main request body
        RequestBody requestBody = new RequestBody();
        requestBody.setName("Apple MacBook Pro 16");
        requestBody.setData(data);

        // Send POST request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/objects")
                .then()
                .statusCode(200)
                .extract().response();

        // Print response
        System.out.println("Response: " + response.asPrettyString());
    }
}
