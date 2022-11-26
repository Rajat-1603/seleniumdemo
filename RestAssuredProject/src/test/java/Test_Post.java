import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Test_Post extends TestData {
	
	@Test(dataProvider = "DataForPost")
	public void test01(String name, String email, int branch)
	{
		
		JSONObject request = new JSONObject();
		
		request.put("name", name);
		request.put("email", email);
		request.put("branch", branch);
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()). 
		when().
		post("https://dev-api.famepilot.com/accounts/22/contact-list/?page_size=10"). 
		then().
		statusCode(201);	
				
	}
	
	
	

		
}
	
	

