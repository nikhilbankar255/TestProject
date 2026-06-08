import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementFlow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Elements']"));

		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
		textBox.click();

		WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		WebElement emailField = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement currentField = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		WebElement perField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));

		js.executeScript("arguments[0].value='Nikhil';", nameField);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='niks1@gamil.com'", emailField);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Ashdvhjadvhieaojoeajve';", currentField);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='mvnvnbbvwhfhurhiwrho';", perField);
		Thread.sleep(2000);

		js.executeScript("arguments[0].click()", submitButton);

		WebElement resName = driver.findElement(By.xpath("//p[text()='Name:']"));
		WebElement resEmail = driver.findElement(By.xpath("//p[text()='Email:']"));
		WebElement resCuA = driver.findElement(By.xpath("//p[text()='Current Address :']"));
		WebElement perAdd = driver.findElement(By.xpath("//p[text()='Permananet Address :']"));

//		Assert.assertEquals(resName.getText().split(":")[1].strip(), "Nikhil");
//		Assert.assertEquals(resEmail.getText().split(":")[1].strip(), "niks1@gamil.com");
//		Assert.assertEquals(resCuA.getText().split(":")[1].strip(), "Ashdvhjadvhieaojoeajve");
//		Assert.assertEquals(perAdd.getText().split(":")[1].strip(), "mvnvnbbvwhfhurhiwrho");

//		if (resName.getText().split(":")[1].strip().equals("Nikhil") 
//				&& resEmail.getText().split(":")[1].strip().equals("niks1@gamil.com'")) {
//			System.out.println("Name matched");
//			System.out.println("Email matched");
//		} else if (resCuA.getText().split(":")[1].strip().equals("Ashdvhjadvhieaojoeajve")) {
//			System.out.println("Current Address matched");
//		} else if (perAdd.getText().split(":")[1].strip().equals("mvnvnbbvwhfhurhiwrho")) {
//			System.out.println("Permanent Address matched");
//		}else {
//			System.out.println("Results are not matched with input");
//		}
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
