package TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Amazon_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/s?k=iphone+14&crid=212QZS6XAWUDB&sprefix=iphone+14%2Caps%2C298&ref=nb_sb_noss_1");
        List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<WebElement> name=driver.findElements(By.xpath("//div[@class='sg-col-inner']//span[contains(text(),'Apple iPhone 14 (128 GB) ')]"));
        for(int i=0;i<=price.size()-1;i++)
        {
        	String pr=price.get(i).getText();
        	String pric=pr.replace(",","");
            int act=Integer.parseInt(pric);
        	if(act<=70000) {
        		System.out.println("name ="+name.get(i).getText()+"--------"+"price="+price.get(i).getText());
        			
        	}
        }
	}
}
