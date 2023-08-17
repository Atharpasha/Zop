package com.online_shopping_generic_library;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * 
	 * @param driver
	 */
	public void get(String url,WebDriver driver)
	{
		driver.get(url);
	}
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * 
	 * @param driver
	 */
	public void waiForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void waittForSpecificElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void selectOption_Select(WebElement element,String value)
	{
		Select sc=new Select(element);
		sc.selectByValue(value);	
	}
	public void selectOption_Select(String text,WebElement element)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);	
	}
	public void selectOption_Select(WebElement element,int index)
	{
		Select sc=new Select(element);
		sc.selectByIndex(index);	
	}
	public void deSelectOption_Actions(WebElement element,int index)
	{
		Select sc=new Select(element);
		sc.deselectByIndex(index);	
	}
	public void deSelectOption_Actions(WebElement element,String value)
	{
		Select sc=new Select(element);
		sc.deselectByValue(value);	
	}
	public void deSelectOption_Actions(String text,WebElement element)
	{
		Select sc=new Select(element);
		sc.deselectByVisibleText(text);	
	}
	public void deSelectOption_Actions(WebElement element)
	{
		Select sc=new Select(element);
		sc.deselectAll();	
	}

	public void rightClick_Actions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();

	}
	public void rightClickWithElement_Actions(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();

	}
	public void doubleClickk_Actions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();

	}

	public void doubleClickkWithElement_Actions(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();

	}
	public void moveToElement_Actions(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();

	}
	public void moveByOffSet_Actions(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveByOffset(40,40).perform();
	}
	public void dragAndDrop_Actions(WebDriver driver,WebElement element1,WebElement element2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(element1, element2).perform();
	}
	public void clickAction_Actions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.click().perform();
	}
	public void press_Enter_Actions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void keyPress_Enter() throws AWTException
	{
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
	}
	public void keyRelease_Enter() throws AWTException
	{
		Robot ro=new Robot();
		ro.keyRelease(KeyEvent.VK_ENTER);
	}
	public void handleGmethodFrame(WebDriver driver,int index )
	{
		driver.switchTo().frame(index);
	}
	public void handleGmethodFrame(WebDriver driver,String text )
	{
		driver.switchTo().frame(text);
	}
	public void handleGmethodFrame(WebDriver driver,WebElement element )
	{
		driver.switchTo().frame(element);
	}
	/**
	 * 
	 * @param driver
	 * @param ExpectedURL
	 */
	public void getWindowHandlesGmethod(WebDriver driver,String ExpectedURL)
	{
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext())
		{
			String win=it.next();
			String url=driver.switchTo().window(win).getCurrentUrl();//SWITCHING HERE AND GETTING VALUE
			if(url.contains(ExpectedURL))
			{

				break;
			}	
		}	
	}
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public String alertGetText(WebDriver driver)
	{
		String text=driver.switchTo().alert().getText();
		return text;
	}
	public void alertSendText(WebDriver driver,String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
    /**
     * 
     * @param driver
     * @param element
     */
	public void scrollIntoSpecificElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	/**
	 * 
	 * @param driver
	 */
	public void scrollPage(WebDriver driver)
	{ 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");

	}
	/**
	 * 
	 * @param driver
	 * @return 
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver sdriver) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="./Screenshot/FailedTS.png";
		File des=new File(path);
		FileUtils.copyFile(src,des);
		return path;

	}








}
