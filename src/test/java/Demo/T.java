package Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://3.111.214.139/#/login");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tech@credright.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("CredRight@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.findElement(By.xpath("//b[.='Logins']/../..//div[@class='card-body']//span[.='Last Month']/following-sibling::span[@class='index-count']")).click();
		
		Thread.sleep(2000);
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext())
		{
			String win=it.next();
			String url=driver.switchTo().window(win).getCurrentUrl();//SWITCHING HERE AND GETTING VALUE
			if(url.contains("http://3.111.214.139/#/home/application-list/total_logins"))
			{

				break;
			}	
		}	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/home/loan-application/26981']")).click();
	
	}
}
