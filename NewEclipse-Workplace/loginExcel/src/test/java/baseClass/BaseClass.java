package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports extent;
	
	@BeforeSuite
	public void setupReport()
	{
		ExtentSparkReporter reporter =  new ExtentSparkReporter("Reports/AutomationReport.html");
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Selenium Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Nikhil Bankar");
	}
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		//ChromeOptions options = new ChromeOptions();
		//Running script in Incognito Tab
//		options.addArguments("--incognito");
//		options.addArguments("--user-data-dir=/tmp/selenium-profile"); 
//		options.addArguments("--profile-directory=Default");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-popup-blocking");
//		driver= new ChromeDriver(options);
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
		//driver.close();
	}
}
