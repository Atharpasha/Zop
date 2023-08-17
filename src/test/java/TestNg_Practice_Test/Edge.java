package TestNg_Practice_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
@Test
public class Edge {
	public void m1()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http;//www.google.com");
	}

}
