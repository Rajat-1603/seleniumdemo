package co.famepilot.selenium.webdriver.basic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
    driver.navigate().to("https://dev-app.famepilot.com");
	driver.manage().window().maximize();
	
	WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/a"));
	login.click();
	Thread.sleep(2000);
	
	
	   WebElement forgetpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[4]/a"));
       forgetpassword.click();
       Thread.sleep(2000);
        	
       WebElement ResetPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[1]/div[1]/input"));
       ResetPassword.sendKeys("rajatgoel666@gmail.com");
       Thread.sleep(2000);
       
       WebElement Resetbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[2]/button"));
       Resetbutton.click();
    	Thread.sleep(2000);
    
    	
    	((JavascriptExecutor)driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    	
    	WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
    	email.sendKeys("rajatgoel666@gmail.com");
    	
    	WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
    	next.click();
    	
    	WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
    	pass.sendKeys("");
    	
    	WebElement next1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span"));
    	next1.click();
    	
    	List<WebElement> mail = driver.findElements(By.xpath("//*[@id=\":2l\"]"));
           
    	for(WebElement emailsub : mail){
    	    if(emailsub.getText().equals("Reset Your Password") == true){

    	           emailsub.click();
    	           break;
    	        }
    	    }
    	               
    	WebElement reset = driver.findElement(By.xpath("//*[@id=\":o0\"]/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[6]/td/table/tbody/tr/td/a"));
    	reset.click();
    	
    	WebElement new1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[1]/div[1]/input"));
    	new1.sendKeys("test@123");
    	
    	WebElement ConfirmNew1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[2]/div[1]/input"));
    	ConfirmNew1.sendKeys("test@123");
    	
    	WebElement Sub = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/form/div/div[3]/button"));
    	Sub.click();
    	
    	
    	

	}

}
