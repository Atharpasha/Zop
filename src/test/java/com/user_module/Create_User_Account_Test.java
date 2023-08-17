package com.user_module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shhopping_object_repository.Create_A_New_Account_Page;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Login_Admin_Page;
import com.online_shhopping_object_repository.Manage_User_Page;
import com.online_shopping_generic_library.ExcelUtility;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.JavaUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_User_Account_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		//		Random random=new Random();
		//		random.ints(200);

		//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\commondata.properties");
		//		Properties pr=new Properties();
		//		pr.load(fis);
		//		String BROWSER=pr.getProperty("browser");
		//		String URL=pr.getProperty("url");
		//		String URL3=pr.getProperty("url2");
		//		String USERNAME=pr.getProperty("username2");
		//		String PASSWORD=pr.getProperty("password2");
		FileUtility flib=new FileUtility();
		ExcelUtility Elib=new ExcelUtility();
		JavaUtility jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		String BROWSER=flib.readDtaFromPropertyFile("browser");
		String URL=flib.readDtaFromPropertyFile("url");
		String URL3=flib.readDtaFromPropertyFile("url2");
		String USERNAME=flib.readDtaFromPropertyFile("username2");
		String PASSWORD=flib.readDtaFromPropertyFile("password2");
		//		FileInputStream fis1=new FileInputStream(".\\src\\test\\resources\\Demo1\\Excel_data_for_project.xlsx");
		//		Workbook wb=WorkbookFactory.create(fis1);
		//		String full_name=wb.getSheet("signup").getRow(1).getCell(0).getStringCellValue();
		//		String email=wb.getSheet("signup").getRow(1).getCell(1).getStringCellValue()+random;
		//		String contact=wb.getSheet("signup").getRow(1).getCell(2).getStringCellValue();
		//		String password=wb.getSheet("signup").getRow(1).getCell(3).getStringCellValue();
		//		String confpassword=wb.getSheet("signup").getRow(1).getCell(4).getStringCellValue();
		//		String search=wb.getSheet("signup").getRow(1).getCell(0).getStringCellValue();
		//		
		
		//		String full_name=Elib.readDataFromExcel("signup", 1, 0);
		//		String email_first=Elib.readDataFromExcel("signup", 1, 1);
		//     	String email_extension=Elib.readDataFromExcel("signup", 2, 1);
		//     	String email=email_first+jlib.getRandom()+email_extension;
		//    	String contact=Elib.readDataFromExcel("signup", 1, 2);
		//     	String password=Elib.readDataFromExcel("signup", 1, 3);
		//     	String confpassword=Elib.readDataFromExcel("signup", 1, 4);
		//    	String search=Elib.readDataFromExcel("signup", 1, 0);
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
		//		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys(full_name);
		//		WebElement eml=driver.findElement(By.xpath("//input[@id='email']"));
		//		eml.clear();
		//		eml.sendKeys(email);
		//		driver.findElement(By.xpath("//input[@id='contactno']")).sendKeys(contact);
		//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		//		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys(confpassword);
		//		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Create_A_New_Account_Page creatt=new Create_A_New_Account_Page(driver);
		creatt.create_A_User_Account(Elib.getMultipleDataFromExcel(driver,"create_user_ac", 0, 1) , driver, jlib);
		creatt.pop_Register(driver, wlib);
		//		String register_con=driver.switchTo().alert().getText();
		//		String text=wlib.alertGetText(driver);
		//		if(text.equalsIgnoreCase("you are successfully register"))
		//		{
		//			System.out.println("sucessfully registeration done...");
		//		}
		//		//driver.switchTo().alert().accept();
		//		wlib.alertAccept(driver);
		//		driver.close();
		//		Thread.sleep(5000);
		//       WebDriver driver1;
		//		
		//		if(BROWSER.equalsIgnoreCase("chrome"))
		//		{
		//			WebDriverManager.chromedriver().setup();
		//		     driver1=new ChromeDriver();
		//			
		//		}
		//		else{
		//			WebDriverManager.firefoxdriver().setup();
		//		     driver1=new FirefoxDriver();
		//				
		//		}
		//		//driver1.manage().window().maximize();
		//		wlib.maximizeWindow(driver1);
		//driver1.get(URL3);
		wlib.get(URL3, driver);
		Thread.sleep(5000);
		Login_Admin_Page admin=new Login_Admin_Page(driver);
		admin.admin_Login(USERNAME, PASSWORD);
		Manage_User_Page manage_user=new Manage_User_Page(driver);
		manage_user.search_For_User("king", driver);
		//		driver1.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(USERNAME);
		//		driver1.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(PASSWORD);
		//		driver1.findElement(By.xpath("//button[text()='Login']")).click();

		//		driver1.findElement(By.xpath("//a[@href='manage-users.php']")).click();
		//		driver1.findElement(By.xpath("//input[@type='text']")).sendKeys(search);
		//		String text1=driver1.findElement(By.xpath("//td[text()='king']")).getText();
		//		if(text1.equals("king"))
		//		{
		//			System.out.println("category is created");
		//		}
		driver.close();


	}

}
