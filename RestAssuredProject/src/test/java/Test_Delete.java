import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.http.ContentType;

public class Test_Delete {
	
	
	@Test
	public void delete() {
	
		
		
	

//		Map<Integer, Object> request = new HashMap<Integer, Object>();
		

		
		List<Integer> request = new ArrayList<Integer>();
		request.add(134587);
		String jsonStr = JSONArray.toJSONString(request);
		
		
		Gson gson = new Gson();
		String json = new Gson().toJson(request);
		
	
		
//		JSONObject json = new JSONObject();
		
//		request.put("contacts", 134587);
	
		
		System.out.println(json);
//		System.out.println(request.);
		
		
		given().header("authorization","Token 554d4d0eb29458b09f7fed5ae9390abb8ba6dd5f").
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		body(request).
		when().
		post("https://dev-api.famepilot.com/accounts/22/contact-list/contact_delete/").
		then().log().all().
		statusCode(200);
		
		
	}
		

}
