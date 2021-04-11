package Projects.seleniumTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		System.out.println("addressbook sign in");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test(priority = 1)
	public void launchURL() {
		driver.get("http://a.testaddressbook.com/sign_in/");  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	}
	@Test(priority = 2 )
	public void enterLoginDetails() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver.findElement(By.id("session_email")).sendKeys("surabhi@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("surabhi@123");
	}
	
	@Test(priority = 3)
	public void clickOnSubmitButton() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.name("commit")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/span"));
		String email = element.getText();
		System.out.println("check element is displayed or not? "+element.getText());
		Assert.assertEquals( email,"surhi@gmail.com"," assertion fail------> user name mismatch");
	}
	@Test(dependsOnMethods ="clickOnSubmitButton")
	public void closeBrowser() {
		driver.close();
	}
}
	
    	
