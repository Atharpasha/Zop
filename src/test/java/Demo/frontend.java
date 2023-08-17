package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frontend {

	public static void main(String[] args) throws Throwable {
		
	// TODO Auto-generated method stub
		Connection con=null;
		try {
		String expected="project name";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Username']")));
		WebElement username=driver.findElement(By.xpath("//label[text()='Username']"));
		username.sendKeys("rmgyantra");
		WebElement password=driver.findElement(By.xpath("//label[text()='Password']"));
		password.sendKeys("rmgy@9999");
	    WebElement signin=driver.findElement(By.xpath("//button[text()='Sign in']"));
	    signin.click();
		WebElement project=driver.findElement(By.xpath("//a[text()='Projects']"));
		project.click();
		WebElement createproject=driver.findElement(By.xpath("//span[text()='Create Project']"));
		createproject.click();
		WebElement pjname=driver.findElement(By.xpath("//input[@name='projectName']"));
		pjname.click();
		WebElement pjmanager=driver.findElement(By.xpath("//input[@name='createdBy']"));
		pjmanager.click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='status']"));
		Select sc=new Select(dropdown);
		sc.selectByValue("created");
		WebElement creatproject=driver.findElement(By.xpath("//a[value='Add Project']"));
		creatproject.click();
		//get particular driver class
		Driver driver1=new Driver();
		//drivermanager loads all the classes present in the jdbc.driver implementation class
		DriverManager.registerDriver(driver1);
		//get connection with db
	    con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/project","root@%", "root");
	    //create statement
		Statement state=con.createStatement();
		//performing sql statements
		ResultSet result=state.executeQuery("select * from Buykart");
		boolean Flag=false;
		//iterating one by one 
		while(result.next())
		{
			String actual=result.getString(4);//projrt name sould be present in the 4th column
			if(actual.equalsIgnoreCase(expected))
			{
				Flag=true;
				break;
			}
			
		
		}
		if(Flag==true)
		{
			System.out.println("project created");
			
		}
		else
		{
			System.out.println("not created");
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			//finally used to close DB
			con.close();
		}
		
	
		

	}

}
