package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_samsung_display {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(System.getProperty("URL"));
		
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon']")).sendKeys("Phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		JavascriptExecutor js=(JavascriptExecutor )driver;
		js.executeScript("window.scrollBy(0,400)","");
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/span[@data-csa-c-type='element']"));
		for(int i=0;i<=list.size()-1;i++)
		{
			if(list.get(i).getText().equals("SAMSUNG"))
			{
				System.out.println(list.get(i).getText());
				Thread.sleep(500);
			    //list.get(i).click();
				driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
				break;
			}
			
		}		
	}

}
