package QADemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framehandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000); 
		
		WebElement frameBtn = driver.findElement(By.xpath("//span[text()='Frames']"));
		js.executeScript("arguments[0].click();", frameBtn);

		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		
		WebElement message = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("Message is :"+ message.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		
		driver.switchTo().frame(frame2);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		// nested frames
		WebElement nestedFrameBtn = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
		js.executeScript("arguments[0].click();", nestedFrameBtn);
		
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(parentFrame);
		
		
		
		Thread.sleep(2000);
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		WebElement framename = driver.findElement(By.tagName("p"));
		System.out.println("frame name :"+framename.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		
	}

}
