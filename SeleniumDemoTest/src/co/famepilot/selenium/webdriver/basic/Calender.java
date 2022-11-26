package co.famepilot.selenium.webdriver.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calender {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.booking.com/");	
		
	}
	
	@Test
	public void date() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("jaipur");
		driver.findElement(By.xpath("//li[@data-label='Jaipur, Rajasthan, India']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']//*[name()='svg']")).click();
		
		driver.findElement(By.cssSelector("span[aria-label='19 September 2022'] span[aria-hidden='true']")).click();
		
		driver.findElement(By.cssSelector("span[aria-label='17 October 2022'] span[aria-hidden='true']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'sb-searchbox__button')]")).click();
		Thread.sleep(4000);
			
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
}
