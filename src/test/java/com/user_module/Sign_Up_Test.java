package com.user_module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Create_A_New_Account_Page;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shopping_generic_library.ExcelUtility;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.JavaUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_Up_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileUtility flib=new FileUtility();
     	WebDriverUtility wlib=new WebDriverUtility();
     	ExcelUtility Elib=new ExcelUtility();
     	JavaUtility jlib=new JavaUtility();
     	
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\commondata.properties");
//		Properties pr=new Properties();
//		pr.load(fis);
//		String BROWSER=pr.getProperty("browser");
//		String URL=pr.getProperty("url");
     	String BROWSER=flib.readDtaFromPropertyFile("browser");
     	String URL=flib.readDtaFromPropertyFile("url");
//		FileInputStream fis1=new FileInputStream(".\\src\\test\\resources\\Demo1\\Excel_data_for_project.xlsx");
//		Workbook wb=WorkbookFactory.create(fis1);
//		String full_name=wb.getSheet("signup").getRow(1).getCell(0).getStringCellValue();
//		String email=wb.getSheet("signup").getRow(1).getCell(1).getStringCellValue();
//		String contact=wb.getSheet("signup").getRow(1).getCell(2).getStringCellValue();
//		String password=wb.getSheet("signup").getRow(1).getCell(3).getStringCellValue();
//		String confpassword=wb.getSheet("signup").getRow(1).getCell(4).getStringCellValue();
//		
     	String full_name=Elib.readDataFromExcel("signup", 1, 0);
     	String email_first=Elib.readDataFromExcel("signup", 1, 1);
     	String email_extension=Elib.readDataFromExcel("signup", 2, 1);
     	String email=email_first+jlib.getRandom()+email_extension;
     	String contact=Elib.readDataFromExcel("signup", 1, 2);
     	String password=Elib.readDataFromExcel("signup", 1, 3);
     	String confpassword=Elib.readDataFromExcel("signup", 1, 4);
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
		Create_A_New_Account_Page create_ac=new Create_A_New_Account_Page(driver);
		Home_Page home=new Home_Page(driver);
		home.clickOnLoginLink();
		create_ac.create_A_New_Account(full_name ,email ,contact,password,confpassword);
//		driver.findElement(By.xpath("//a[@href='login.php']")).click();
//		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys(full_name);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@id='contactno']")).sendKeys(contact);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys(confpassword);
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//String text=driver.switchTo().alert().getText();
//		String text=wlib.alertGetText(driver);
//		if(text.equalsIgnoreCase("you are successfully register"))
//		{
//			//driver.switchTo().alert().accept();
//			wlib.alertAccept(driver);
//		}
		create_ac.verify_Create_Account(driver, wlib);
		System.out.println("TC PASSED");
	}

}
