package TestNg_Practice_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.online_shopping_generic_library.ExcelUtility;

public class Get_Data_From_Excel_Test {

	@Test(dataProvider = "getDataFromExcel")
	public void getData(String client,String location)
	{
		System.out.println(client+"//////////"+   location);
	}

	@DataProvider
	public Object[][] getDataFromExcel() throws EncryptedDocumentException, IOException 
	{
		ExcelUtility elib=new ExcelUtility();
		Object[][] value = elib.getMultipleDataByDP("DP");
		return value;

	}
}
