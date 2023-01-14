import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Review_Tag_Delete extends TestData {
	
	
	@Test(dataProvider = "DataDelete")
	public void delete(int tagId) {
		
		baseURI = "https://dev-api.famepilot.com/reviews/2/review";
	
		when().
			delete("/tags/"+tagId+"/").
		then().log().all().
			statusCode(204);
	}
}
