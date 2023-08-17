package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Only_Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
//		List<WebElement> played=driver.findElements(By.xpath("//table//tr[*]//td[@class='table-body__cell u-center-text' and text()<'39']"));
//		List<WebElement> teams=driver.findElements(By.xpath("//table//tr[*]//td[2]"));
		List<WebElement> teams=driver.findElements(By.xpath("//table[1]//tr[2]//td"));
	for(int i=0;i<=teams.size()-1;i++)
		{
		
		{
				System.out.print(teams.get(i).getText()+"  ");
			}
				
		}
		
		
	}
}
