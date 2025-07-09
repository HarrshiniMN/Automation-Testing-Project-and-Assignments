package Assignment_Questions;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

public class OAuth2 {
  @Test
  public void auth2() 
  {
	  given()
	  .auth().oauth2("12345")
	  .when()
	  .get("https://postman-echo.com")
	  .then()
	  .statusCode(200)
	  .log().all();
	  
  }
}
