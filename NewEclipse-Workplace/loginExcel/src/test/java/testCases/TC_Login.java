package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.PracticeLogin;
import utilities.DataProviders;

public class TC_Login extends BaseClass{

	@Test(dataProvider = "excelData", dataProviderClass = DataProviders.class)
	public void loginTest(String username, String password)
	{
		PracticeLogin login= new PracticeLogin(driver);
		login.usernameField(username);
		login.passwordField(password);
		login.submitButton();
		login.loginSuccessMessage();
		login.logout();
		login.logoutSuccessMessage();
	}
}
