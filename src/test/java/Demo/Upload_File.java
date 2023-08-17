package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import  java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {

	public static void main(String[] args) throws AWTException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
//uploading file using robot class	
StringSelection ss=new StringSelection("C:\\Users\\Athar\\Documents");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Robot r=new Robot();
r.delay(500);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
r.delay(500);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
//using AutoIt
Runtime.getRuntime().exec("C:\\Users\\Athar\\Desktop");
//using sendkeys
//sendkeys("path");only when attribute type=file
//switchTo window code

	
	driver.switchTo().frame(0);
	
}
	}



