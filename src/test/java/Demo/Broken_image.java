package Demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_image {

	
	@Test
	public void brokenImage() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> list = driver.findElements(By.xpath("//img"));
		
		for(int i=0;i<list.size();i++)
		{
		String st = list.get(i).getAttribute("src");
		URL url=new URL(st);
		HttpsURLConnection htp=(HttpsURLConnection)url.openConnection();
		
		int code = htp.getResponseCode();
		
		if(code>=400)
		{
			System.out.println(st+" "+code);
		}
		
		}
		
		
		
		
	}
}
