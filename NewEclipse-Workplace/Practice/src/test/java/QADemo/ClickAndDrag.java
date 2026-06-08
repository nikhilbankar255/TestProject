package QADemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndDrag {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Widgets']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);

		WebElement sliderBtn = driver.findElement(By.xpath("//span[text()='Slider']"));
		js.executeScript("arguments[0].click();", sliderBtn);

		Actions action = new Actions(driver);

		WebElement slidBar = driver.findElement(By.xpath("//input[@type='range']"));
		action.dragAndDropBy(slidBar, 150, 0).perform();

		Thread.sleep(1000);

		action.dragAndDropBy(slidBar, 200, 0).perform();
		Thread.sleep(1000);

	}

}
