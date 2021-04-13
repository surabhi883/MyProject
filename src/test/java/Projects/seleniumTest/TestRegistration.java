package Projects.seleniumTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sap.java.sampletestng.Helper;
import com.sap.java.sampletestng.RegistrationPage;
import com.sap.java.utis.ConfigFileReader;
import com.sap.java.utis.ExcelUtils;

public class TestRegistration extends Helper {
	RegistrationPage registerPage;
	public String path = ConfigFileReader.getTestDataFilePath();
	@DataProvider (name= "test1")
	public Object[][] getexceldata() throws IOException { 
		System.out.println("path ===> "+path+"regestration2.xlsx");
		Object data[][]=ExcelUtils.getexceldata(path+"regestration2.xlsx","Sheet1");
		return data;
		
	}

	@BeforeMethod()
	public void setup() {
		launchway2automation();
		registerPage = new RegistrationPage();
		
	}

	@Test(priority = 1,dataProvider="test1")
	public void userDetails(String FName,String LName, String Mstatus,String Hobby,String country, String dob, String phoneNo, String userName, String email) throws InterruptedException {
		System.out.println("path ===> "+path+"testData.xlsx");
		System.out.println(FName);
		registerPage.enter_FName(FName);
		registerPage.enter_LName(LName);
		if(Mstatus.equals("Married")) {
			registerPage.clickRadioButtonmarried(Mstatus);
		}else if(Mstatus.equals("Single")) {
			registerPage.clickRadioButtonsingle(Mstatus);
		}
		if(Hobby.equals("Cricket")) {
			registerPage.clickCheckBoxHobbyCricket();
		}else if(Hobby.equals("Dance")) {
			registerPage.clickCheckBoxHobbyDance();
		}
		registerPage.selectCountry(country);
		
	}
	
	
	@AfterMethod()
	public void closebrowser() {
		//closeBrowser();
	}

}
