import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000); 
		
		//New Tab
		
		WebElement browserWindow = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
		js.executeScript("arguments[0].click();", browserWindow);

		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		
		WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		newTab.click();
		Thread.sleep(2000);

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		for(String handle : windows)
		{
			if(!handle.equals(parentWindow))
			{
				driver.switchTo().window(handle);
				System.out.println("Chold Window Title :"+driver.getTitle());
			
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title :"+driver.getTitle());
		
		Thread.sleep(2000);
		//New Window
		String parentWindow1 = driver.getWindowHandle();
		System.out.println("Parent Window :"+parentWindow1);
		
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		js.executeScript("arguments[0].click();", newWindow);
		
		Thread.sleep(2000);
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String handle : allWindows)
		{
			if(!handle.equals(parentWindow1))
			{
				driver.switchTo().window(handle);
				System.out.println("Pop up window :"+driver.getTitle());
				
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow1);
		System.out.println("Back to parent window :"+driver.getTitle());
		Thread.sleep(2000);
		
		//New Window message
		String parentWindow2 = driver.getWindowHandle();
		
		WebElement newWinMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		js.executeScript("arguments[0].click();", newWinMessage);
		
		Thread.sleep(2000);
		Set<String> allWindows1 = driver.getWindowHandles();
		
		
		for(String handle1 : allWindows1)
		{
			if(!handle1.equals(parentWindow2))
			{
				driver.switchTo().window(handle1);
				System.out.println("New Window with message content : "+driver.getTitle());
				
				Thread.sleep(2000);
				
				String windowMessage = driver.findElement(By.tagName("body")).getText();
				System.out.println("Message of the window :"+windowMessage);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow2);
		
	System.out.println("Main window :"+driver.getTitle());

		Thread.sleep(2000);
		
		driver.quit();
	}

}
