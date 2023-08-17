package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Team_And_Won_Pro_Kabadi {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.prokabaddi.com/standings");
		List<WebElement> teams=driver.findElements(By.xpath("//div[@class='table-data team']"));
		List<WebElement> played=driver.findElements(By.xpath("//div[@class='table-data matches-play']"));
		List<WebElement> won=driver.findElements(By.xpath("//div[@class='table-data matches-won']"));
		
		for(int i=0;i<=teams.size()-1;i++)
		{
			System.out.println(teams+" "+played+"  "+won  );
			
		}
	}

}
