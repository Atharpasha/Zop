package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.online_shopping_generic_library.ExcelUtility;
import com.online_shopping_generic_library.FileUtility;
import com.online_shopping_generic_library.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Data_By_Map {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileUtility flib=new FileUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		String BROWSER=flib.readDtaFromPropertyFile("browser");
		String URL=flib.readDtaFromPropertyFile("url");
		ExcelUtility Elib=new ExcelUtility();
		
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
		wlib.maximizeWindow(driver);
		wlib.get(URL, driver);
		wlib.waiForPageLoad(driver);
		driver.findElement(By.xpath("//a[@href='login.php']")).click();
		
		Elib.getMultipleDataFromExcel(driver,"Create",0,1);
	
       // driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
