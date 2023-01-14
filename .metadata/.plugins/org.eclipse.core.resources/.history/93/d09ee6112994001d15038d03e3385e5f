package co.famepilot.selenium.webdriver.basic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUp {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException 

	{	
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Trapti\\Downloads\\geco driver\\geckodriver.exe");
	driver = new FirefoxDriver();	
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
    driver.navigate().to("https://dev-app.famepilot.com");
	driver.manage().window().maximize();
	
	
	WebElement Register = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/p/a"));
	Register.click();
	Thread.sleep(2000);
	
	
	WebElement first=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[1]/div[1]/div/div[1]/input"));
	first.sendKeys("Rajat");
	
	WebElement last=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div[1]/input"));
	last.sendKeys("Goel");
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[2]/div[1]/div/div[1]/input"));
	email.sendKeys("goel.rajat121@gmail.com");
	
	WebElement Mobile = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[2]/div[2]/div/div/div/input"));
	Mobile.sendKeys("9569854859");
	
	WebElement Password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[3]/div[1]/div/div[1]/input"));
	Password.sendKeys("test@123");
	
	WebElement Confirm = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[3]/div[2]/div/div/input"));
	Confirm.sendKeys("test@123");
	
	WebElement BusinessName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[4]/div[1]/div/div[1]/input"));
	BusinessName.sendKeys("Testing pvt. ltd");
	
	WebElement drop = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[4]/div[2]/div/div/i"));
	drop.click();
	
	WebElement BusinessType = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[4]/div[2]/div/div/div[2]/div[2]/span"));
	BusinessType.click();
	
	WebElement drop1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[5]/div[1]/div/div/div/i"));
	drop1.click();
	
	WebElement category = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[5]/div[1]/div/div/div/div[2]/div[3]/span"));
	category.click();
	
	WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[7]/div/div/button"));
	submit.click();
	Thread.sleep(5000);
	
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	WebElement mail = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	mail.sendKeys("goel.rajat121@gmail.com");
	
	WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
	next.click();
	
	WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
	pass.sendKeys("test@12345");
	
	WebElement next1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span"));
	next1.click();
	
	
	List<WebElement> a = driver.findElements(By.xpath("//*[@id=\":3c\"]"));
    System.out.println(a.size());
    for (int i = 0; i < a.size(); i++) {
        System.out.println(a.get(i).getText());
        if (a.get(i).getText().equals("Support")) //to click on a specific mail.
            {                                           
            a.get(i).click();
            }
    }
            
            
	
	}
}