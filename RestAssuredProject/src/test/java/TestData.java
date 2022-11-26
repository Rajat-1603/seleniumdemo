import org.testng.annotations.DataProvider;

public class TestData {
	
	//@DataProvider(name = "DataForPost")
	public Object [][] dataForPost() {
		
		
		return new Object[][] {
			
			{"Test", "Test20@gmail.com", 30},
			{"Test", "Test13@gmail.com", 30},
			{"Test", "Test14@gmail.com", 30},
			{"Test", "Test15@gmail.com", 30}
			
		};
		
	}

	
	@DataProvider(name = "DataDelete")
	public Object[] dataForDelete() {
		
		return new Object[] {
				

3843,
3844,
3853,
3861,
3892,
3897,
3955
		};	
	}				
}
