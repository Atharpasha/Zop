package com.online_shhopping_object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page {

	//declaration
	@FindBy(id="exampleInputEmail1")
	private WebElement USERNAME;
	@FindBy(id="exampleInputPassword1")
	private WebElement PASSWORD;
	@FindBy(name="login")
	private WebElement LOGIN_BUTTON;

	//initialization
	public Sign_In_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getUSERNAME() {
		return USERNAME;
	}

	public WebElement getPASSWORD() {
		return PASSWORD;
	}

	public WebElement getLOGIN() {
		return LOGIN_BUTTON;
	}

	//Business library

	public void sign_In_To_Application(String username,String password)
	{

		getUSERNAME().sendKeys(username);
		getPASSWORD().sendKeys(password);
		getLOGIN().click();


	}






}
