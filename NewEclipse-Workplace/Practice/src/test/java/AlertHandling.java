import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000); 
		
		WebElement alertBtn = driver.findElement(By.xpath("//span[text()='Alerts']"));
		js.executeScript("arguments[0].click();", alertBtn);

		Thread.sleep(2000);
		
		WebElement firstBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		firstBtn.click();
		Thread.sleep(2000);

		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		
		WebElement secondBtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		secondBtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		 alert.accept();
		 Thread.sleep(2000);
		 
		 WebElement thirdBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		 thirdBtn.click();
		 alert.dismiss();
		 Thread.sleep(2000);
		 
		 WebElement fourthBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		 fourthBtn.click();
		 alert.sendKeys("Testing this text box");
		 alert.accept();
		 
		Thread.sleep(2000);
//		WebElement result = driver.findElement(By.xpath("//span[@id='promptResult']"));
//		String[] expectedMessage = result.getText().split(" ");
//		
//		String[] str= {"testing this text box"};
//		for(int i=0; i<expectedMessage.length; i++)
//		{
//			System.out.println(expectedMessage[i]);
//			for(int j=1; j<=str.length; j++)
//			{
//				assertEquals(str[i], expectedMessage[i]);
//				
//			}
//		}
		
		driver.quit();
	}

}
