package com.online_shhopping_object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Admin_Page {

	@FindBy(id="inputEmail")
	private WebElement ADMIN_USERNAME;
	@FindBy(id="inputPassword")
	private WebElement ADMIN_PASSWORD;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement ADMIN_LOGIN;

	public Login_Admin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getADMIN_USERNAME() {
		return ADMIN_USERNAME;
	}

	public WebElement getADMIN_PASSWORD() {
		return ADMIN_PASSWORD;
	}

	public WebElement getADMIN_LOGIN() {
		return ADMIN_LOGIN;
	}

	public void admin_Login(String usename,String password)
	{
		getADMIN_USERNAME().sendKeys(usename);
		getADMIN_PASSWORD().sendKeys(password);
		getADMIN_LOGIN().click();

	}
}
