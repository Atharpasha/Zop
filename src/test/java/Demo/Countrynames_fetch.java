package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Countrynames_fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> teams=driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]"));
		List<WebElement> matches=driver.findElements(By.xpath("//table/tbody/tr[*]/td[3]"));
		
	
		for(int i=0;i<=teams.size()-1;i++)
		{
			String s=matches.get(i).getText();
			int ii=Integer.parseInt(s);
			//String d=Integer.toString(ii);
			if(ii>30)
			{
				System.out.println(teams.get(i).getText()+"......"+matches.get(i).getText());
			}
					
		}
			
	}
	
}


