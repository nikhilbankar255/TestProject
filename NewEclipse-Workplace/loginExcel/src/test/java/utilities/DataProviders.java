package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "excelData")
	public Object[][] excelDataProvider() throws IOException
	{
		return ExcelUtility.getData("src/test/resources/loginData.xlsx", "login");
		
	}
}
