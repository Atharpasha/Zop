package com.online_shhopping_object_repository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.online_shopping_generic_library.JavaUtility;
import com.online_shopping_generic_library.WebDriverUtility;

public class Create_A_New_Account_Page {

	@FindBy(id="fullname")
	private WebElement FULL_NAME; 
	@FindBy(id="email")
	private WebElement EMAIL; 
	@FindBy(id="contactno")
	private WebElement CONTACT_NUMBER; 
	@FindBy(id="password")
	private WebElement PASSWORD;
	@FindBy(id="confirmpassword")
	private WebElement CONFIRM_PASSWORD;
	@FindBy(id="submit")
	private WebElement SUBMIT;

	public Create_A_New_Account_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFULL_NAME() {
		return FULL_NAME;
	}

	public WebElement getEMAIL() {
		return EMAIL;
	}

	public WebElement getCONTACT_NUMBER() {
		return CONTACT_NUMBER;
	}

	public WebElement getPASSWORD() {
		return PASSWORD;
	}

	public WebElement getCONFIRM_PASSWORD() {
		return CONFIRM_PASSWORD;
	}

	public WebElement getSUBMIT() {
		return SUBMIT;
	}
	public void clickOnLogin()
	{

	}

	public void create_A_New_Account(String fullname ,String email ,String contactnumber,String password,String confirmpassword)
	{
		getFULL_NAME().sendKeys(fullname);
		getEMAIL().sendKeys(email);
		getCONTACT_NUMBER().sendKeys(contactnumber);
		getPASSWORD().sendKeys(password);
		getCONFIRM_PASSWORD().sendKeys(confirmpassword);
		getSUBMIT().click();
	}
	public void verify_Create_Account(WebDriver driver,WebDriverUtility wlib )
	{
		String text=wlib.alertGetText(driver);
		
		boolean bol=text.equalsIgnoreCase("you are successfully register");
		Assert.assertTrue(bol);
		
		
//	if(text.equalsIgnoreCase("you are successfully register"))
//		{
//			//driver.switchTo().alert().accept();
//			wlib.alertAccept(driver);
//		}
//		
//		
//		Assert.assertEquals(text, "you are successfully register");
//		
		wlib.alertAccept(driver);
		
		System.out.println("TC PASSED");
	}
	public void create_A_User_Account(HashMap<String, String> mapp,WebDriver driver,JavaUtility jlib)
	{
		for(Entry<String,String> set:mapp.entrySet())
		{
			
			if(set.getKey().equals("//input[@id='email']"))
			{
				 WebElement gjg = driver.findElement(By.xpath(set.getKey()));
				 String a=jlib.getRandom()+set.getValue();
				 gjg.sendKeys(a);
				 System.out.println(a);
			}
			else
			{
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			}
			
			
		}
		
		SUBMIT.click();	
	}
	public void pop_Register(WebDriver driver,WebDriverUtility wlib)
	{
		
		String text=wlib.alertGetText(driver);
		
		SoftAssert sa=new SoftAssert();
		boolean bol=text.equalsIgnoreCase("you are successfully register");
		sa.assertTrue(bol,"sucessfully registeration is not done...");
//		if(text.equalsIgnoreCase("you are successfully register"))
//		{
//			System.out.println("sucessfully registeration done...");
//		}
		//driver.switchTo().alert().accept();
		wlib.alertAccept(driver);
		//driver.close();
		sa.assertAll();
	}


}
