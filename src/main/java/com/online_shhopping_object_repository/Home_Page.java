package com.online_shhopping_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.online_shopping_generic_library.WebDriverUtility;

public class Home_Page {


	@FindBy(xpath="//a[@href='my-account.php']")
	private WebElement MY_ACCOUNT;

	@FindBy(xpath="//a[text()='Home']")
	private WebElement HOME_LINK;

	@FindBy(xpath="//a[@href='login.php']")
	private WebElement LOGIN_LINK;

	@FindBy(xpath="//a[@href='my-wishlist.php']")
	private WebElement WISHLIST_LINK;

	@FindBy(xpath="//a[@href='my-cart.php']")
	private WebElement MY_CART_LINK;

	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement LOGOUT_LINK;

	@FindBy(xpath="//a[@title='Wishlist']")
	private WebElement WISHLIST_BUTTON;

	@FindBy(xpath="//a[@href='my-account.php']")
	private WebElement MY_ACCOUNT_LINK;

	//	@FindBy(xpath="//a[@href='category.php?cid=4']")
	//	private WebElement ELECTRONICS_LINK;

	//	@FindBy(xpath="//a[@href='sub-category.php?scid=3']")
	//	private WebElement MOBILE_LINK;


	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	public WebElement getWISHLIST_BUTTON() {
		return WISHLIST_BUTTON;
	}

	public WebElement getMY_ACCOUNT() {
		return MY_ACCOUNT;
	}

	public WebElement getWISHLIST() {
		return WISHLIST_LINK;
	}

	public WebElement getMY_CART() {
		return MY_CART_LINK;
	}

	public WebElement getLOGOUT() {
		return LOGOUT_LINK;
	}

	public WebElement getLOGIN_LINK() {
		return LOGIN_LINK;
	}

	public WebElement getHOME_LINK() {
		return HOME_LINK;
	}
	public WebElement getMY_ACCOUNT_LINK() {
		return MY_ACCOUNT_LINK;
	}

	//	public WebElement getELECTRONICS_LINK() {
	//		return ELECTRONICS_LINK;
	//	}
	//
	//	public WebElement getMOBILE_LINK() {
	//		return MOBILE_LINK;
	//	}
	public void clickOnLoginLink()
	{
		getLOGIN_LINK().click();

	}
	public void clickOnMy_AccountLink()
	{
		getMY_ACCOUNT_LINK().click();

	}
	public void clickOnMy_CartLink()
	{
		getMY_CART().click();

	}
	public void clickOnHomeLink()
	{
		getHOME_LINK().click();

	}
	public void clickOnLogoutLink()
	{
		LOGOUT_LINK.click();

	}

	public void clickOnElectronicsLink(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@href='category.php?cid=4']")).click();
	}
	public void clickOnMobilesLink(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@href='sub-category.php?scid=4']")).click();

	}
	public void clickOnWishListButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@title='Wishlist']")).click();

	}
	public void clickOnAddProductButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@href='category.php?page=product&action=add&id=4']")).click();

	}
	public void verify_order(WebDriver driver,WebDriverUtility wlib)
	{
		String text=wlib.alertGetText(driver);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(text, "Product has been added to the cart","not matches");
//		if(text.equalsIgnoreCase("Product has been added to the cart"))
//		{
//			wlib.alertAccept(driver);
//			System.out.println("product is added");
//		}
		wlib.alertAccept(driver);
		System.out.println("product is added");
		sa.assertAll();
	}




}
