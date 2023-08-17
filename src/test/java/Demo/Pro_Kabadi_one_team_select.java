package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro_Kabadi_one_team_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.prokabaddi.com/standings");
		//List<WebElement> row=driver.findElements(By.xpath(" "));
		String t="Bangluru Bulls";
		List<WebElement> column=driver.findElements(By.xpath("//div[@class='"+t+"']"));
		for(int i=0;i<=column.size()-1;i++)
		{
			String team=column.get(i).getText();
		if(team.equalsIgnoreCase("Bangluru Bulls"))
		{
				System.out.println(team);
				break;
		}
		
		}
	}

}
