package Projects.seleniumTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sap.java.sampletestng.Helper;
import com.sap.java.sampletestng.LoginPage;

public class TestLogin extends Helper {
	LoginPage loginPage;

	@Test(priority = 1)
	public void setup() {
		launchBrowser();
		loginPage = new LoginPage();

	}

	@Test(priority = 2)
	public void enterUserNameTest() {
		loginPage.enterUserName("pthorat883@gmail.com");
	}

	@Test(priority = 3)
	public void enterUserPwdTest() {
		loginPage.enterpassword("Cheshma@22791");
	}
	@Test(priority = 4)
	public void clickLoginbtnTest() {
		loginPage.clickLogin();
	
	}
	@Test(priority = 5)
	public void verifyLoginTitleTest() {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String title =  loginPage.getLoginTitle(); 
		System.out.println("title ==> "+title);
		Assert.assertEquals(title, "prashant subhash thorat");
	}
	
}
