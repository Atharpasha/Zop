package com.user_module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Create_Category_Page;
import com.online_shhopping_object_repository.Login_Admin_Page;
import com.online_shopping_generic_library.ExcelUtility;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Category_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\commondata.properties");
//		Properties pr=new Properties();
//		pr.load(fis);
//		String BROWSER=pr.getProperty("browser");
//		String URL2=pr.getProperty("url2");
//		String USERNAME2=pr.getProperty("username2");
//		String PASSWORD2=pr.getProperty("password2");
		FileUtility flib=new FileUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		ExcelUtility Elib=new ExcelUtility();
		String BROWSER=flib.readDtaFromPropertyFile("browser");
		String URL2=flib.readDtaFromPropertyFile("url2");
		String USERNAME2=flib.readDtaFromPropertyFile("username2");
		String PASSWORD2=flib.readDtaFromPropertyFile("password2");
//		FileInputStream fis1=new FileInputStream(".\\src\\test\\resources\\Demo1\\Excel_data_for_project.xlsx");
//		Workbook wb=WorkbookFactory.create(fis1);
//		String category=wb.getSheet("category").getRow(1).getCell(0).getStringCellValue();
//		String desc=wb.getSheet("category").getRow(1).getCell(1).getStringCellValue();
		String category=Elib.readDataFromExcel("category", 1, 0);
		String desc=Elib.readDataFromExcel("category", 1, 1);
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
		//driver.get(URL2);
		wlib.get(URL2, driver);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wlib.waiForPageLoad(driver);
//		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(USERNAME2);
//		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(PASSWORD2);
//		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Login_Admin_Page admin_login=new Login_Admin_Page(driver);
		admin_login.admin_Login(USERNAME2, PASSWORD2);
//		driver.findElement(By.xpath("//a[@href='category.php']")).click();
//		driver.findElement(By.xpath("//input[@name='category']")).sendKeys(category);
//		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(desc);
//		driver.findElement(By.xpath("//button[text()='Create']")).click();
		Create_Category_Page create_cat=new Create_Category_Page(driver);
		create_cat.create_Category(category, desc);
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(category);
		create_cat.search_Category(driver, category, wlib);

		
		
		
	}
}
