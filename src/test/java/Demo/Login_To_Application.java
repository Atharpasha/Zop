package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_To_Application {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\commondata.properties");
		 Properties pr=new Properties();
		 pr.load(fis);
		 String URL=pr.getProperty("url");
		 String Browser=pr.getProperty("browser");
		 String Username=pr.getProperty("username");
		 String Password=pr.getProperty("password");
		 
		 WebDriver driver;
		 
		 if(Browser.equalsIgnoreCase("chrome"))
		 {
			WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();
		 }
		 else
		 {
			WebDriverManager.firefoxdriver().setup(); 
			driver=new FirefoxDriver();
		 }
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(URL);
		 Thread.sleep(5000);
		 driver.findElement(By.id("inputEmail")).sendKeys(Username);
		 driver.findElement(By.id("inputPassword")).sendKeys(Password);
		 driver.findElement(By.name("submit")).click();
		 
		  
		 

	}

}
