package com.user_module;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Billing_Shipping_Addresses_And_Procced_To_Chechout_Page;
import com.online_shhopping_object_repository.Choose_Payment_Method;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Sign_In_Page;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Order_product_Test {

	public static void main(String[] args) throws IOException {
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
		//driver.get(URL);
		wlib.get(URL, driver);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wlib.waiForPageLoad(driver);
//		driver.findElement(By.xpath("//a[@href='login.php']")).click();
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(USERNAME);
//        driver.findElement(By.xpath("//input[@name='email']//../following-sibling::div/descendant::input[@name='password']")).sendKeys(PASSWORD);
//        driver.findElement(By.xpath("//button[text()='Login']")).click();
		Home_Page home=new Home_Page(driver);
		home.clickOnLoginLink();
		Sign_In_Page signin=new Sign_In_Page(driver);
		signin.sign_In_To_Application(USERNAME, PASSWORD);
        //driver.findElement(By.xpath("//a[text()='Home']")).click();
		home.clickOnHomeLink();
        driver.findElement(By.xpath("//a[@href='category.php?cid=4']")).click();
        driver.findElement(By.xpath("//a[@href='sub-category.php?scid=3']")).click();
        home.clickOnElectronicsLink(driver);
        home.clickOnMobilesLink(driver);
        //driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        home.clickOnAddProductButton(driver);
      // String text= driver.switchTo().alert().getText();
//       
       home.verify_order(driver, wlib);
       //driver.findElement(By.xpath("//button[text()='PROCCED TO CHEKOUT']")).click();
       
       Billing_Shipping_Addresses_And_Procced_To_Chechout_Page checkout=new Billing_Shipping_Addresses_And_Procced_To_Chechout_Page(driver);
       checkout.procced_To_Checkout(wlib, driver);
       Choose_Payment_Method CPD=new Choose_Payment_Method(driver);
       CPD.cod_Payment_Method();
////       driver.findElement(By.xpath("//input[@value='COD']")).click();
////       driver.findElement(By.xpath("//input[@name='submit']")).click();
       System.out.println("payment is done");
       System.out.println("TC PASSED");

	}

}
