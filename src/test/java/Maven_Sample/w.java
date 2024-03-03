package Maven_Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w {

	@Test
	public void s() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='From']"));
		driver.findElement(By.xpath("//input[@value='Select Destination']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//div[.='Departure Date']")).click();
		driver.findElement(By.xpath("(//div[.='Select Date'])[2]")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-November-2023']//div[@data-testid='undefined-calendar-day-24']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(4000);
		String str = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-1hfyk0a']")).getText();
		
		boolean plce=str.contains("Delhi");
		boolean ad=str.contains(" 1 Adult");
		boolean dep=str.contains("Thu, 05 Oct 2023");
		boolean ret=str.contains("Fri, 24 Nov 2023");
		
	    assertTrue(plce);
	    assertTrue(ad);
	  //  assertTrue(dep);
	    assertTrue(ret);
	    System.out.println("verified sucessfully");
	}
}
