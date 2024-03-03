package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFlights {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/travel/flights");
	    driver.findElement(By.xpath("(//input[@class='II2One j0Ppje zmMKJ LbIaRd'])[3]")).sendKeys("delhi");
		 driver.findElement(By.xpath("(//div[@class='w1ZvBc'])[1]")).click();
	     Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='TP4Lpb eoY5cb j0Ppje'])[1]")).click();
		driver.findElement(By.xpath("//div[@data-iso='2023-10-01']")).click();
		driver.findElement(By.xpath("//div[@data-iso='2023-10-03']")).click();
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']/following-sibling::span[.='Done']")).click();
		driver.findElement(By.xpath("//span[.='Search' and @class='VfPpkd-vQzf8d']")).click();
		//driver.findElement(By.xpath("(//span[.='Explore'])[2]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@jsname='IWWDBc']//div[@class='U3gSDe']//div[@class='BVAVmf I11szd POX3ye']"));
		System.out.println(list.get((list.size())-2).getText());
	
	}

}
