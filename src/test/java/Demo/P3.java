package Demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		driver.get("https://mybmtc.karnataka.gov.in/");
		Thread.sleep(5000);
		List<WebElement> listlinks=driver.findElements(By.xpath("//a"));
		System.out.println(listlinks.size());
		ArrayList<String> links=new ArrayList<String>();

		for(int i=0;i<listlinks.size();i++)
		{
			String eachlink=listlinks.get(i).getAttribute("href");
			URL url=null;
			int statusCode=0;
			try {
				//load url
				url=new URL(eachlink);
				HttpURLConnection HttpURLConnection=(HttpURLConnection)url.openConnection();
				statusCode=HttpURLConnection.getResponseCode();
				if(statusCode>=400)
				{
					links.add(eachlink+"- - -"+statusCode);
				}

			}catch(Exception e)
			{
				links.add(eachlink+"- - -"+statusCode); 
			}
		}

		System.out.println(links);//MALFORMED exception
	}





}


