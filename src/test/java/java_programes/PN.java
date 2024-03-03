package java_programes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.online_shopping_generic_library.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class PN {
	@Test
	public void rt() throws InterruptedException, IOException, TesseractException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[.=' LOGIN ']")).click();
		Thread.sleep(3000);
		WebElement img = driver.findElement(By.xpath("//img[@class='captcha-img']"));
//		 String cap=img.getText();
//		 System.out.println(cap);
		 File file = img.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("C://Users//Athar//eclipse-workspace//com.onlineshopping//Captcha//d.pnj"));
		 ITesseract tess=new Tesseract();
		 tess.setDatapath("C://Users//Athar//Desktop//captcha file//Tess4J-3.4.8-src//Tess4J//tessdata");//get it from Tess4j
		 String text = tess.doOCR(new File("C://Users//Athar//eclipse-workspace//com.onlineshopping//Captcha//d.pnj"));
		 System.out.println(text);
		 
	
		 
		 
	}

}
