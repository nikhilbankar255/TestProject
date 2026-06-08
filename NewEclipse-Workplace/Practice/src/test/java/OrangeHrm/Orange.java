package OrangeHrm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(dataProvider = "login")
	public void getdata(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Buzz']")).click();
		
		driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']")).sendKeys("Testing purpose");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//WebElement sucessMessage = driver.findElement(By.xpath("//div[@id='oxd-toaster_1']"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='oxd-toaster_1']")));
//		if(sucessMessage.isDisplayed())
//		{
//			System.out.println(sucessMessage.getText());
//		}
//		else
//		{
//			System.out.println("No success message");
//		}
	}

	@DataProvider(name = "login")
	public String[][] setdata() 
	{
		String[][] data = new String[1][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";
		return data;

	}

}
