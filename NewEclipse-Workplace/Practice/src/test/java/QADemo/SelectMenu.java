package QADemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Widgets']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(1000);

		WebElement selectMenuBtn = driver.findElement(By.xpath("//span[text()='Select Menu']"));
		js.executeScript("arguments[0].click();", selectMenuBtn);
		
		List<WebElement> menu1 = driver.findElements(By.xpath("//div[@class=' css-1hwfws3']"));
		menu1.get(0).click();
		
		//Select sel = new Select(menu1);
		
	}

}
