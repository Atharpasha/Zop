package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven_Cmd {
	
 @Test
	public void readDataFromCmdTest()
	{
	String URL=System.getProperty("url");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	
	
	
	
		
	}
}
