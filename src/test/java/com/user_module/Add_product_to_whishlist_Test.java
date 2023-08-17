package com.user_module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Sign_In_Page;
import com.online_shopping_generic_library.ExcelUtility;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_product_to_whishlist_Test {

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
//		
//		ExcelUtility Elib=new ExcelUtility();
//		String category=Elib.readDataFromExcel("Categoryandproduct", 1, 0);
//		String product=Elib.readDataFromExcel("Categoryandproduct", 1, 1);
//		
//		String category=flib.readDtaFromPropertyFile("password");
//		String product=flib.readDtaFromPropertyFile("password");
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
		//driver.findElement(By.xpath("//a[@href='login.php']")).click();
		Home_Page home=new Home_Page(driver);
		home.clickOnLoginLink();
		Sign_In_Page sign_in=new Sign_In_Page(driver);
		sign_in.sign_In_To_Application(USERNAME, PASSWORD);
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(USERNAME);
//        driver.findElement(By.xpath("//input[@name='email']//../following-sibling::div/descendant::input[@name='password']")).sendKeys(PASSWORD);
//        driver.findElement(By.xpath("//button[text()='Login']")).click();
        home.clickOnHomeLink();
        home.clickOnElectronicsLink(driver);
        home.clickOnMobilesLink(driver);
 //       driver.findElement(By.xpath("//a[text()='Home']")).click();
//        driver.findElement(By.xpath("//a[@href='category.php?cid=4']")).click();
//        driver.findElement(By.xpath("//a[@href='sub-category.php?scid=3']")).click();
     //   driver.findElement(By.xpath("//a[@title='Wishlist']")).click();
        
        home.clickOnWishListButton(driver);
        System.out.println("add_to_wishlist_is_passed");
	}

}
