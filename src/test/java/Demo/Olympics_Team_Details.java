package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympics_Team_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> teams=driver.findElements(By.xpath("//div[@class='styles__CountryWrapper-sc-fehzzg-4 hjfJyH']"));
		List<WebElement> gold=driver.findElements(By.xpath("//div[@title='Gold']"));
		List<WebElement> silver=driver.findElements(By.xpath("//div[@title='Silver']"));
		List<WebElement> bronze=driver.findElements(By.xpath("//div[@title='Bronze']"));
		
		for(int i=0;i<=teams.size()-1;i++)
		{
			String a=teams.get(i).getText();
			String b=gold.get(i).getText();
			String c=silver.get(i).getText();
			String d=bronze.get(i).getText();
			
			System.out.println(a+" "+b+" "+c+" "+d);
			
		}
	
	}

}
