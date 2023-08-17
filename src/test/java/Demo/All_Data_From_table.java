package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Data_From_table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		ArrayList<String> alllist=new ArrayList<String>();
     List<WebElement> list=driver.findElements(By.xpath("//table/tbody//tr[*]"));
     for(int i=0;i<=list.size()-1;i++)
     {
    	 if(list.get(i).getText().contains("England"))
    	 {
    		 System.out.println((list.get(i).getText())); 
    	 }
    	
     }
//     for(int j=0;j<=alllist.size()-1;j++)
//     {
//    	 System.out.println(alllist.get(j)+" ");
//    	 
//     }
	}
	

}
