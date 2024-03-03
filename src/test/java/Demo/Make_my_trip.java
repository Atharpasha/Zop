package Demo;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_my_trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="September 2023";
		int date=13;
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.makemytrip.com/");
	 //   driver.navigate().refresh();
//	    Actions act=new Actions(driver);
//	    act.moveByOffset(40,40).click().perform();
//	    driver.findElement(By.xpath("//span[text()='Departure']")).click();
//	    while(true)
//	    {
//	    	try {
//	    driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
//	    break;
//	    	}catch(Exception e)
//	    	{
//	    		 driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();	
//	    	}
//	    }
//	   
//	    driver.close();
	}

}
