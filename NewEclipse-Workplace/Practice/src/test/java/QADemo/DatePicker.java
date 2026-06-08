package QADemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Widgets']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(1000);

		WebElement datePick = driver.findElement(By.xpath("//span[text()='Date Picker']"));
		js.executeScript("arguments[0].click();", datePick);

		WebElement dateField = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
		dateField.click();
		Thread.sleep(1000);
		dateField.clear();

		Thread.sleep(2000);
		String targetMonth = "January 2026";
		String targetDate = "15";

		while (true) {
			String currentMonthYear = driver.findElement(By.xpath(
					"//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"))
					.getText();
			if (currentMonthYear.equals(targetMonth)) {
				break;
			} else {
				driver.findElement(By.xpath("//button[text()='Next Month']")).click();
				Thread.sleep(2000);
			}
		}
		driver.findElement(By.xpath("//div[text()='" + targetDate + "']")).click();

		// date and time field

		WebElement dateTime = driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']"));
		js.executeScript("arguments[0].scrollIntoView(true);", dateTime);
		dateTime.click();

		String targetDateMonth = "May 2026";
		String targetTime = "14:45";
		String targetDate1 = "25";

		while (true) {
			String currentMonth = driver.findElement(By.xpath(
					"//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"))
					.getText();
			if (currentMonth.equals(targetDateMonth)) {
				break;
			} else {
				driver.findElement(By.xpath("//button[text()='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//div[text()='" + targetDate1 + "']")).click();
		driver.findElement(By.xpath("//li[text()='" + targetTime + "']")).click();

		driver.close();
	}

}
