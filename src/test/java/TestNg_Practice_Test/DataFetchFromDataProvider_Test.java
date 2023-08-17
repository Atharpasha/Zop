package TestNg_Practice_Test;

import org.testng.annotations.Test;

import com.online_shopping_generic_library.ExcelUtility;

public class DataFetchFromDataProvider_Test {

	@Test(dataProviderClass = DataProvider1_Test.class,dataProvider = "data1")
	public void fetch(String name,String role)
	{
		System.out.println("name   ="+name+"     "+"role  ="+role);
		
	}
	@Test(dataProviderClass = DataProvider1_Test.class,dataProvider = "data2")
	public void fetch1(String name,String role)
	{
		System.out.println("name   ="+name+"     "+"role  ="+role);
		
	}
	@Test(dataProviderClass =Get_Data_From_Excel_Test.class,dataProvider = "getDataFromExcel")
	public void fetchMultipleData(String client,String location)
	{
		System.out.println("name   ="+client+"     "+"role  ="+location);
		
	}
}
