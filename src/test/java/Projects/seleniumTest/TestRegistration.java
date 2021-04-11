package Projects.seleniumTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sap.java.sampletestng.ExcelUtils;
import com.sap.java.sampletestng.Helper;
import com.sap.java.sampletestng.LoginPage;
import com.sap.java.sampletestng.RegistrationPage;

public class TestRegistration extends Helper {
	RegistrationPage registerPage;
	
	@DataProvider (name= "test1")
	public Object[][] getexceldata() throws IOException {
		String currentWorkingPath =System.getProperty("user.dir");
		Object data[][]=ExcelUtils.getexceldata(currentWorkingPath+"//testData//testData.xlsx","Sheet1");
		return data;
		
	}

	@BeforeMethod()
	public void setup() {
		launchway2automation();
		registerPage = new RegistrationPage();
		
	}

	@Test(priority = 1,dataProvider="test1")
	public void userDetails(String FName,String LName, String Mstatus,String Hobby,String country, String dob, String phoneNo, String userName, String email) throws InterruptedException {
		System.out.println(FName);
		registerPage.enter_FName(FName);
		Thread.sleep(5000);
	}
	@AfterMethod()
	public void closebrowser() {
		closeBrowser();
	}

}
