package com.online_shhopping_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Manage_User_Page {

	
	@FindBy(id="inputEmail")
	private WebElement EMAIL;
	
	@FindBy(id="inputPassword")
	private WebElement PASSWORD;
	@FindBy(name="submit")
	private WebElement LOGIN;
	
	@FindBy(xpath="//a[@href='manage-users.php']")
	private WebElement CLICK_ON_MANAGE_USER;

	@FindBy(xpath="//input[@type='text']")
	private WebElement SEARCH_FOR_USER;
	public WebElement getEMAIL() {
		return EMAIL;
	}

	public WebElement getPASSWORD() {
		return PASSWORD;
	}

	public WebElement getLOGIN() {
		return LOGIN;
	}

	public Manage_User_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCLICK_ON_MANAGE_USER() {
		return CLICK_ON_MANAGE_USER;
	}

	public WebElement getSEARCH_FOR_USER() {
		return SEARCH_FOR_USER;
	}
	public void search_For_User(String name,WebDriver driver)
	{
		getCLICK_ON_MANAGE_USER().click();

		getSEARCH_FOR_USER().click();
		SEARCH_FOR_USER.sendKeys(name);
		SoftAssert sa=new SoftAssert();
		String text1=driver.findElement(By.xpath("//td[text()='king']")).getText();
		sa.assertEquals(text1,"king","not matches");
		System.out.println("category is created");
//		if(text1.equals("king"))
//		{
//			System.out.println("category is created");
//		}

	}





}
