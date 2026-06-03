package pageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptUtility;
import utilities.WaitUtility;

public class PracticeLogin {

	WebDriver driver;
	JavaScriptUtility jsUtil;
	WaitUtility waitUtil;
	public PracticeLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		jsUtil = new JavaScriptUtility(driver);  
		waitUtil= new WaitUtility();
	}
	
	@FindBy(xpath= "//input[@id='username']")
	WebElement uname;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath= "//button[@id='submit-login']")
	WebElement submit;
	
	@FindBy(xpath= "//b[text()='You logged into a secure area!']")
	WebElement loginMessage;
	
	@FindBy(xpath= "//i[text()=' Logout']")
	WebElement logoutButton;
	
	@FindBy(xpath= "//b[text()='You logged out of the secure area!']")
	WebElement logoutMessage;
	
	public void usernameField(String username)
	{
		jsUtil.scrollIntoView(uname);
		uname.sendKeys(username);
	}
	
	public void passwordField(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void submitButton()
	{
		submit.click();
	}
	
	public void loginSuccessMessage()
	{
		assertEquals(loginMessage.getText(), "You logged into a secure area!");
		System.out.println(loginMessage.getText());
	}
	
	public void logout()
	{
		jsUtil.scrollIntoView(logoutButton);
		waitUtil.waitForElement(logoutButton);
		logoutButton.click();
	}
	
	public void logoutSuccessMessage()
	{
		assertEquals(logoutMessage.getText(), "You logged out of the secure area!");
		System.out.println(logoutMessage.getText());
	}
	
}
