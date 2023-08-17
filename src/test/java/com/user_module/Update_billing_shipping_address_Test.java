package com.user_module;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Billing_Shipping_Addresses_And_Procced_To_Chechout_Page;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Ship_And_Bill_Using_Map_Page;
import com.online_shhopping_object_repository.Sign_In_Page;
import com.online_shopping_generic_library.ExcelUtility;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.JavaUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Update_billing_shipping_address_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		//		ChromeOptions option=new ChromeOptions();
		//		option.addArguments("--disable-notifications");
		//		
		//		Random random=new Random();
		//		random.ints(500);//if we want to create duplicate name of mandatory field

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
		//		FileInputStream fis1=new FileInputStream(".\\src\\test\\resources\\Demo1\\Excel_data_for_project.xlsx");
		//		Workbook wb=WorkbookFactory.create(fis1);
		//		String billing_address=wb.getSheet("Billing").getRow(1).getCell(0).getStringCellValue();
		//		String billing_state=wb.getSheet("Billing").getRow(1).getCell(1).getStringCellValue();
		//		String billing_city=wb.getSheet("Billing").getRow(1).getCell(2).getStringCellValue();
		//		String billing_pincode=wb.getSheet("Billing").getRow(1).getCell(3).getStringCellValue();
		//		
		//		String shipping_address=wb.getSheet("Shipping").getRow(1).getCell(0).getStringCellValue();
		//		String shipping_state=wb.getSheet("Shipping").getRow(1).getCell(1).getStringCellValue();
		//		String shipping_city=wb.getSheet("Shipping").getRow(1).getCell(2).getStringCellValue();
		//		String shipping_pincode=wb.getSheet("Shipping").getRow(1).getCell(3).getStringCellValue();
		//		
		ExcelUtility Elib=new ExcelUtility();
//		String billing_address=Elib.readDataFromExcel("Billing", 1, 0);
//		String billing_state=Elib.readDataFromExcel("Billing", 1, 1);
//		String billing_city=Elib.readDataFromExcel("Billing", 1, 2);
//		String billing_pincode=Elib.readDataFromExcel("Billing", 1, 3);
//		//
//		String shipping_address=Elib.readDataFromExcel("Shipping", 1, 0);
//		String shipping_state=Elib.readDataFromExcel("Shipping", 1, 1);
//		String shipping_city=Elib.readDataFromExcel("Shipping", 1, 2);
//		String shipping_pincode=Elib.readDataFromExcel("Shipping", 1, 3);

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
		//driver.findElement(By.xpath("//a[@href='login.php']")).click();
		Home_Page home=new Home_Page(driver);
		home.clickOnLoginLink();
		//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(USERNAME);
		//        driver.findElement(By.xpath("//input[@name='email']//../following-sibling::div/descendant::input[@name='password']")).sendKeys(PASSWORD);
		//        driver.findElement(By.xpath("//button[text()='Login']")).click();

		Sign_In_Page signin=new Sign_In_Page(driver);
		signin.sign_In_To_Application(USERNAME, PASSWORD);
		//driver.findElement(By.xpath("//a[@href='my-account.php']")).click();
		home.clickOnMy_AccountLink();
		//driver.findElement(By.xpath("//a[text()='Shipping / Billing Address']")).click();
		Billing_Shipping_Addresses_And_Procced_To_Chechout_Page BAS=new Billing_Shipping_Addresses_And_Procced_To_Chechout_Page(driver);
		BAS.click_On_Billing_And_Shipping_Address_Link();
		//       WebElement a=driver.findElement(By.xpath("//textarea[@name='billingaddress']"));
		//       a.clear();
		//       a.sendKeys(billing_address);
		//       WebElement b=driver.findElement(By.xpath("//input[@name='bilingstate']"));
		//       b.clear();
		//       b.sendKeys(billing_state);
		//       WebElement c=driver.findElement(By.xpath("//input[@id='billingcity']"));
		//       c.clear();
		//       c.sendKeys(billing_city);
		//        WebElement d=driver.findElement(By.xpath("//input[@name='billingpincode']"));
		//        d.clear();
		//        d.sendKeys(billing_pincode);
		//        driver.findElement(By.xpath("//button[@name='update']")).click();
		//        //driver.switchTo().alert().accept();
		//        wlib.alertAccept(driver);
		//        
		//        driver.findElement(By.xpath("//a[@href='#collapseOne']")).click();
		//        Thread.sleep(500);
		//JavaUtility jlib=new JavaUtility();

		//BAS.billing_Address(driver, wlib, billing_address, billing_state, billing_city, billing_pincode);
		Ship_And_Bill_Using_Map_Page map=new Ship_And_Bill_Using_Map_Page(driver);
		map.billing_Address(Elib.getMultipleDataFromExcel(driver,"billing_address", 0, 1), driver,wlib);
		map.shipping_Address(Elib.getMultipleDataFromExcel(driver,"shipping_address", 0, 1), driver, wlib);

		//BAS.shipping_Address(driver, wlib, shipping_address, shipping_state, shipping_city, shipping_pincode);
		//		driver.findElement(By.xpath("//a[@href='#collapseTwo']")).click();
		//        WebElement e=driver.findElement(By.xpath("//textarea[@name='shippingaddress']"));
		//        e.clear();
		//        e.sendKeys(shipping_address);
		//       WebElement f= driver.findElement(By.xpath("//input[@name='shippingstate']"));
		//       f.clear();
		//       f.sendKeys(shipping_state);
		//       WebElement g= driver.findElement(By.xpath("//input[@name='shippingcity']"));
		//       g.clear();
		//       g.sendKeys(shipping_city);
		//        WebElement h=driver.findElement(By.xpath("//input[@name='shippingpincode']"));
		//       h.clear();
		//       h.sendKeys(shipping_pincode);
		//        driver.findElement(By.xpath("//button[@name='shipupdate']")).click();
		//       // driver.switchTo().alert().accept();
		//        wlib.alertAccept(driver);
		System.out.println("TC PASEED");



	}

}
