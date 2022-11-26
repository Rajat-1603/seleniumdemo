import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Test_GET {
    
	@Test
	void Test() {
		
		Response response = RestAssured.get("https://dev-api.famepilot.com/accounts/2/contact-ids/?page_size=10");
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);		
		
		}

}
