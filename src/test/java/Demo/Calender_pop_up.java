package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_pop_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String month="September 2023";
		int date=27;
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.goibibo.com/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%2112768765973%21654874673033%21p%21goibibo%21c%21&gad=1&gclid=Cj0KCQjw2eilBhCCARIsAG0Pf8urkil2V40wfgX41YofrqptWC-8P_GNZC6Ykm4ispOoUSGRlNCPQDcaApl5EALw_wcB");
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='sc-iCfMLu ixvMbU']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true)
		{
			try {
				driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
				System.out.println("done");
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
			
			
		}	
	driver.findElement(By.xpath("//span[text()='Done']"));
	}

}
