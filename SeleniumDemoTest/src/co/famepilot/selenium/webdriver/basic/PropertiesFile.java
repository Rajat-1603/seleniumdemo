package co.famepilot.selenium.webdriver.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile {
	
	static WebDriver driver;
	static Properties prop;
	

	public static void main(String[] args) throws IOException {
		
		
		Properties prop =new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Trapti\\eclipse-workspace\\SeleniumDemoTest\\src\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (BrowserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Trapti\\Downloads\\geco driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else {
				System.out.println("Browser not found");
				
		}
	}
		
}	
