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

public class p4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	     WebDriverManager.firefoxdriver().setup();
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	     driver.get("https://ksrtc.in/oprs-web/");
	     Thread.sleep(5000);
	     List<WebElement> listlinks=driver.findElements(By.xpath("//a"));
	     System.out.println(listlinks.size());
	     ArrayList<String> links=new ArrayList<String>();
	     
	     for(int i=0;i<listlinks.size();i++)
	     {
	    	 String eachlink=listlinks.get(i).getAttribute("href");
	    	 
	    		 if(eachlink.isEmpty()||eachlink==null)
	    		 {
	    			links.add(eachlink);
	    		 }
	    		 
	    	
	   }
	     
	     
	}
	
}   

	


