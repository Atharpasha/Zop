package TestNg_Practice_Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1_Test {


	@Test(dataProvider ="data1")
	public void data(String name,String role)
	{
		System.out.println("name   ="+name+"     "+"role  ="+role);
	}
	@DataProvider
	public Object[][] data1(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="qspider";
		obj[0][1]="tester";

		obj[1][0]="jspider";
		obj[1][1]="dev";
		return obj;
	}
	@DataProvider
	public Object[][] data2(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="Pyspider";
		obj[0][1]="pyDev";

		obj[1][0]="Rubyspider";
		obj[1][1]="Rubydev";
		return obj;
	}

}
