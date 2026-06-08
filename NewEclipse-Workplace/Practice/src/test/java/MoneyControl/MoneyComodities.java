package MoneyControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneyComodities {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 Alert alert = driver.switchTo().alert();
		 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());
		
		alert.accept();
		
		WebElement commodity = driver.findElement(By.xpath("//a[text()='Commodities']"));
//		JavascriptExecutor js = new JavascriptExecutor(driver);
//		js.executeScript("arguments[0].scrollIntoView(true)", commodity);
		System.out.println(commodity.getText());
		
			
		}
		
		

}
