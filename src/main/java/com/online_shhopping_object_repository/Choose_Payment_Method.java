package com.online_shhopping_object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose_Payment_Method {


	@FindBy(xpath="//input[@value='COD']")
	private WebElement COD;

	@FindBy(xpath="//input[@value='Internet Banking']")
	private WebElement Internet_Banking;

	@FindBy(xpath="//input[@value='Debit / Credit card']")
	private WebElement Debit;

	@FindBy(xpath="//input[@value='submit']")
	private WebElement Submit;

	public Choose_Payment_Method(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCOD() {
		return COD;
	}

	public WebElement getInternet_Banking() {
		return Internet_Banking;
	}

	public WebElement getDebit() {
		return Debit;
	}
	public WebElement getSubmit() {
		return Submit;
	}

	public void cod_Payment_Method()
	{
		getCOD().click();
		getSubmit().click();

	}


}



