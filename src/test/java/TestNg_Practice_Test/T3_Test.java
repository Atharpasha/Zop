package TestNg_Practice_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class T3_Test {

	
	@BeforeSuite
	public void bS()
	{
		System.out.println("--connect to db--");
	}
	@AfterSuite
	public void aS()
	{
		System.out.println("--disconnect to db--");
	}
	@BeforeClass
	public void bC()
	{
		System.out.println("--launch browser--");
	}
	@AfterClass
	public void aC()
	{
		System.out.println("--close browser--");
	}
	@BeforeMethod
	public void bM()
	{
		System.out.println("login");
	}
	@AfterMethod
	public void aM()
	{
		System.out.println("logout");
	}
}
