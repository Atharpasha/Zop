package com.online_shopping_generic_library;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Sign_In_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public DatabaseUtility dLib=new DatabaseUtility();
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public ExcelUtility ELib=new ExcelUtility();
	public JavaUtility JLib=new JavaUtility();
	public WebDriver driver;
	public WebDriver sdriver;
	//@BeforeSuite
//	public void congfi_BS() throws SQLException
//	{
//		dLib.connectToDataase();
//		System.out.println("connect to DB");
//
//	}
//	@AfterSuite
//	public void congfi_AS() throws SQLException
//	{
//		dLib.closeDb();
//		System.out.println("disconnect to DB");
//
//	}
	//@Parameters("Browser")
	
	@BeforeClass(alwaysRun=true)//to perform group execution
	public void congfi_BC() throws IOException
	{
		String BROWSER = fLib.readDtaFromPropertyFile("browser");

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{  WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();

		}
		if(BROWSER.equalsIgnoreCase("edge"))
		{   WebDriverManager.chromedriver().setup();
			driver=new InternetExplorerDriver();

		}
		
		sdriver=driver;//re-initialize for passing driver control to particular window
		
		wLib.maximizeWindow(driver);
		String URL = fLib.readDtaFromPropertyFile("url");
		wLib.get(URL, driver);
		wLib.waiForPageLoad(driver);
        System.out.println("BOWSER LAUNCH ");
	}
	@AfterClass(alwaysRun=true)
	public void congfi_AC() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		System.out.println("BOWSER CLOSE");
	}
	@BeforeMethod(alwaysRun=true)
	public void congfi_BM() throws IOException
	{
		Sign_In_Page signin=new Sign_In_Page(driver);
		Home_Page home=new Home_Page(driver);
		home.clickOnLoginLink();
		String USERNAME = fLib.readDtaFromPropertyFile("username");
		String PASSWORD = fLib.readDtaFromPropertyFile("password");
		signin.sign_In_To_Application(USERNAME,PASSWORD);
		System.out.println("Login to app ");

	}
	@AfterMethod(alwaysRun=true)
	public void congfi_AM()
	{
		Home_Page home=new Home_Page(driver);
		home.clickOnLogoutLink();
		System.out.println("Logout to app ");

	}

}
