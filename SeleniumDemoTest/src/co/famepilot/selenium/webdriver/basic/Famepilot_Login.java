package co.famepilot.selenium.webdriver.basic;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Famepilot_Login {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://dev-app.famepilot.com/");	
		
	}
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
		
		String title  = driver.getTitle();
		System.out.println("The page title is: "+ title);
		Assert.assertEquals(title, "famepilot | Admin Panel");	
	} 
	
	@Test(priority=2)
	public void verifyFamepilotLogoTest() {
		
		boolean flag = driver.findElement(By.xpath("//div[@class='text-center']//img")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	@Parameters({"loginbutton","emailid","password"})
	public void verifyValidlogindetailsTest(String loginbutton, String emailid, String password) throws InterruptedException {
		
		driver.findElement(By.xpath(loginbutton)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(11000);
		
		Assert.assertEquals("Review Summary", driver.findElement(By.xpath("//div[normalize-space()='Review Summary']")).getText());
		
	}
	
	@Test(priority=4)
	public void verifyInvalidEmailTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rajatgoel6661@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Sorry, we do not recognize that email or password. Please try again.", driver.findElement(By.xpath("//div[@class='login-error-box']")).getText());
		
	}
	
	
	@Test(priority=5)
	public void verifyInvalidPasswordTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rajatgoel666@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Sorry, we do not recognize that email or password. Please try again.", driver.findElement(By.xpath("//div[@class='login-error-box']")).getText());
		
	}
	
	@Test(priority=6)
	public void verifyInvalidCredentialsTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rajatgoel6664@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Sorry, we do not recognize that email or password. Please try again.", driver.findElement(By.xpath("//div[@class='login-error-box']")).getText());
		
	}
	
	
	@Test(priority=7)
	public void verifyEmplyfieldsTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Enter Email", driver.findElement(By.xpath("//div[contains(text(),'Enter Email')]")).getText());
		Assert.assertEquals("Enter Password", driver.findElement(By.xpath("//div[contains(text(),'Enter Password')]")).getText());
		
	}
	
	@Test(priority=8)
	public void verifyEmptyUsernameFieldTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Enter Email", driver.findElement(By.xpath("//div[contains(text(),'Enter Email')]")).getText());
		
	}
	
	@Test(priority=9)
	public void verifyEmptyPasswordFieldTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rajatgoel6664@gmail.com");
		driver.findElement(By.xpath("//button[@class='ui teal fluid button']")).click();
		Thread.sleep(5000);
		
		Assert.assertEquals("Enter Password", driver.findElement(By.xpath("//div[contains(text(),'Enter Password')]")).getText());
		
	}
	
	@Test(priority=10)
	public void verifyTermsconditionsTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rajatgoel666@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//input[@class='hidden']")).click();
		Thread.sleep(5000);
		
		boolean flag = driver.findElement(By.xpath("//div[@class='disabled field']")).isEnabled();
		Assert.assertTrue(flag);
		
	}
	
	
	@Test(priority=11)
	public void verifycrossbuttonTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rajatgoel666@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("(//button[@role='button'])[1]")).click();
		Assert.assertEquals("Enter Email", driver.findElement(By.xpath("//div[contains(text(),'Enter Email')]")).getText());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@role='button'])[3]")).click();
		Assert.assertEquals("Enter Password", driver.findElement(By.xpath("//div[contains(text(),'Enter Password')]")).getText());
		Thread.sleep(5000);
	}
	
	
	@Test(priority=12)
	public void verifytermsconditionlinkTest() throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//a[@class='ui teal animated button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://famepilot.com/famepilot-privacy-policy/']")).click();
		
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	Thread.sleep(5000);
    	
    	Assert.assertEquals("PRIVACY POLICY", driver.findElement(By.xpath("//h1[normalize-space()='PRIVACY POLICY']")).getText());
		
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
}
