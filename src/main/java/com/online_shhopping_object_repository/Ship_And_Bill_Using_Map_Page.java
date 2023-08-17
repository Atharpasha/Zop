package com.online_shhopping_object_repository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.online_shopping_generic_library.WebDriverUtility;

public class Ship_And_Bill_Using_Map_Page {
	@FindBy(name="ordersubmit")
	private WebElement CHECKOUT_TO_PROCCED;

	@FindBy(xpath="//a[text()='Shipping / Billing Address']")
	private WebElement BILLING_AND_SHIPPING_ADDRESS_LINK; 

	@FindBy(name="billingaddress")
	private WebElement BILLING_ADDRESS;

	@FindBy(id="bilingstate")
	private WebElement BILLING_STATE;

	@FindBy(id="billingcity")
	private WebElement BILLING_CITY;

	@FindBy(id="billingpincode")
	private WebElement BILLING_PINCODE;

	@FindBy(xpath ="//button[@type='submit' and @name='update']")
	private WebElement BILLING_UPDATE_BUTTON;

	@FindBy(xpath="//a[@href='#collapseOne']")
	private WebElement BILLING_TAB;

	@FindBy(xpath="//textarea[@name='shippingaddress']")
	private WebElement SHIPPING_ADDRESS;

	@FindBy(id="shippingstate")
	private WebElement SHIPPING_STATE;

	@FindBy(id="shippingcity")
	private WebElement SHIPPING_CITY;


	@FindBy(id="shippingpincode")
	private WebElement SHIPPING_PINCODE;

	@FindBy(name="shipupdate")
	private WebElement SHIPPING_UPDATE_BUTTON;

	@FindBy(xpath="//a[@href='#collapseTwo']")
	private WebElement SHIPPING_TAB;

	public Ship_And_Bill_Using_Map_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCHECKOUT_TO_PROCCED() {
		return CHECKOUT_TO_PROCCED;
	}
	public WebElement getBILLING_AND_SHIPPING_ADDRESS_LINK() {
		return BILLING_AND_SHIPPING_ADDRESS_LINK;
	}

	public WebElement getBILLING_ADDRESS() {
		return BILLING_ADDRESS;
	}

	public WebElement getBILLING_STATE() {
		return BILLING_STATE;
	}

	public WebElement getBILLING_CITY() {
		return BILLING_CITY;
	}

	public WebElement getBILLING_PINCODE() {
		return BILLING_PINCODE;
	}

	public WebElement getBILLING_UPDATE_BUTTON() {
		return BILLING_UPDATE_BUTTON;
	}

	public WebElement getSHIPPING_ADDRESS() {
		return SHIPPING_ADDRESS;
	}

	public WebElement getSHIPPING_STATE() {
		return SHIPPING_STATE;
	}

	public WebElement getSHIPPING_CITY() {
		return SHIPPING_CITY;
	}

	public WebElement getSHIPPING_PINCODE() {
		return SHIPPING_PINCODE;
	}

	public WebElement getSHIPPING_UPDATE_BUTTON() {
		return SHIPPING_UPDATE_BUTTON;
	}
	public WebElement getBILLING_TAB() {
		return BILLING_TAB;
	}

	public WebElement getSHIPPING_TAB() {
		return SHIPPING_TAB;
	}

	public void procced_To_Checkout(WebDriverUtility wlib,WebDriver driver)
	{
		wlib.scrollIntoSpecificElement(driver,getCHECKOUT_TO_PROCCED());
		getCHECKOUT_TO_PROCCED().click();	

	}
	public void click_On_Billing_And_Shipping_Address_Link()
	{
		getBILLING_AND_SHIPPING_ADDRESS_LINK().click();
	}		

	public void billing_Address(HashMap<String, String> mapp,WebDriver driver,WebDriverUtility wlib) throws InterruptedException
	{


		//passing data from map to application or script
		for(Entry<String, String> set:mapp.entrySet())
		{
			//			if(set.getKey().contains("key from excel"))
			//			{
			//				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue()+jlib.getRandom());
			//			}
			//			else
			//			{
			//				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			//			}
			WebElement data_To_App=driver.findElement(By.xpath(set.getKey()));
			data_To_App.clear();
			Thread.sleep(3000);
			data_To_App.sendKeys(set.getValue());			
		} 
		//getBILLING_UPDATE_BUTTON().click();
		//		getBILLING_ADDRESS().clear();
		//		getBILLING_ADDRESS().sendKeys(billing_address);
		//		getBILLING_STATE().clear();
		//		getBILLING_STATE().sendKeys(billing_state);
		//		getBILLING_CITY().clear();
		//		getBILLING_CITY().sendKeys(billing_city);
		//		getBILLING_PINCODE().clear();
		//		getBILLING_PINCODE().sendKeys(billing_pincode);
		getBILLING_UPDATE_BUTTON().click();
		wlib.alertAccept(driver);
		//		Thread.sleep(500);
		//		getBILLING_TAB().click();

	}

	public void shipping_Address(HashMap<String, String> mapp,WebDriver driver,WebDriverUtility wlib) throws InterruptedException
	{
		wlib.scrollIntoSpecificElement(driver,getSHIPPING_TAB());
		getSHIPPING_TAB().click();
		for(Entry<String, String> set:mapp.entrySet())
		{
			//			
			WebElement data_To_App=driver.findElement(By.xpath(set.getKey()));
			data_To_App.clear();
			Thread.sleep(3000);
			data_To_App.sendKeys(set.getValue());			
		} 
		//		getSHIPPING_ADDRESS().clear();
		//		getSHIPPING_ADDRESS().sendKeys(shipping_address);
		//		getSHIPPING_STATE().clear();
		//		getSHIPPING_STATE().sendKeys(shipping_state);
		//		getSHIPPING_CITY().clear();
		//		getSHIPPING_CITY().sendKeys(shipping_city);
		//		getSHIPPING_PINCODE().clear();
		//		getSHIPPING_PINCODE().sendKeys(shipping_pincode);
		getSHIPPING_UPDATE_BUTTON().click();
		wlib.alertAccept(driver);
		//		Thread.sleep(500);

	}

}
