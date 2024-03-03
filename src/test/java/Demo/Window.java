package Demo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[.=' BUSES ']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.hotels.irctc.co.in/']")).click();
		Thread.sleep(2000);
		LinkedHashSet<String> win = (LinkedHashSet<String>) driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String s1=it.next();
		String s2=it.next();
		String s3=it.next();
//		WebDriver o = driver.switchTo().newWindow(WindowType.WINDOW);
//		o.close();
	driver.switchTo().window(s3);
		driver.findElement(By.xpath("//a[.='Login']")).click();
	}
}
