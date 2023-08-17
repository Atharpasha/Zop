package com.user_module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Sign_In_Page;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_cart_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\commondata.properties");
//		Properties pr=new Properties();
//		pr.load(fis);
//		String BROWSER=pr.getProperty("browser");
//		String URL=pr.getProperty("url");
//		String USERNAME=pr.getProperty("username");
//		String PASSWORD=pr.getProperty("password");
		FileUtility flib=new FileUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		String BROWSER=flib.readDtaFromPropertyFile("browser");
		String URL=flib.readDtaFromPropertyFile("url");
		String USERNAME=flib.readDtaFromPropertyFile("username");
		String PASSWORD=flib.readDtaFromPropertyFile("password");
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
			
		}
		else{
			WebDriverManager.firefoxdriver().setup();
		     driver=new FirefoxDriver();
				
		}
		//driver.manage().window().maximize();
		wlib.maximizeWindow(driver);
		wlib.get(URL, driver);
		//driver.get(URL);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wlib.waiForPageLoad(driver);
		Home_Page home=new Home_Page(driver);
		home.clickOnLoginLink();
		//driver.findElement(By.xpath("//a[@href='login.php']")).click();
		Sign_In_Page sign_in=new Sign_In_Page(driver);
		sign_in.sign_In_To_Application(USERNAME, PASSWORD);
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(USERNAME);
//        driver.findElement(By.xpath("//input[@name='email']//../following-sibling::div/descendant::input[@name='password']")).sendKeys(PASSWORD);
//        driver.findElement(By.xpath("//button[text()='Login']")).click();
		home.clickOnMy_CartLink();
        //driver.findElement(By.xpath("//a[@href='my-cart.php']")).click();
        System.out.println("TC PASSED");
        
	}

}
