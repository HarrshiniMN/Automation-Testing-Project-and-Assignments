package Assignment_Questions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PetStoreTestQ1 {
	@Test(priority = 1)
    public void testAddNewPet() throws InterruptedException {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        String body = """
        {
            "id": 111,
            "category": { "id": 0, "name": "string" },
            "name": "doggie",
            "photoUrls": [ "string" ],
            "tags": [ { "id": 0, "name": "string" } ],
            "status": "available"
        }
        """;

        given()
            .header("Content-Type", "application/json")
            .body(body)
        .when()
            .post("/pet")
        .then()
            .statusCode(200)
            .body("id", equalTo(111))
            .body("name", equalTo("doggie"));
        
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void testGetPetById() throws InterruptedException {
        given()
            .pathParam("petId", 111)
        .when()
            .get("https://petstore.swagger.io/v2/pet/{petId}")
        .then()
            .statusCode(200)
            .body("id", equalTo(111));
        
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void testUpdatePet() throws InterruptedException {
        String updatedBody = """
        {
            "id": 111,
            "category": { "id": 0, "name": "string" },
            "name": "doggie_updated",
            "photoUrls": [ "string" ],
            "tags": [ { "id": 0, "name": "string" } ],
            "status": "available"
        }
        """;

        given()
            .header("Content-Type", "application/json")
            .body(updatedBody)
        .when()
            .put("https://petstore.swagger.io/v2/pet")
        .then()
            .statusCode(200)
            .body("name", equalTo("doggie_updated"));
        
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void testFindByStatus() throws InterruptedException {
        given()
            .queryParam("status", "available")
        .when()
            .get("https://petstore.swagger.io/v2/pet/findByStatus")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0));
        
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void testDeletePet() {
        given()
            .pathParam("petId", 111)
        .when()
            .delete("https://petstore.swagger.io/v2/pet/{petId}")
        .then()
            .statusCode(200)
            .body("message", equalTo("111"));
    }
}

