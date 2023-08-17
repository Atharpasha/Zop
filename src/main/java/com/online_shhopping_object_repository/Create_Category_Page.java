package com.online_shhopping_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.online_shopping_generic_library.WebDriverUtility;

public class Create_Category_Page {

	@FindBy(xpath="//a[@href='category.php']")
	private WebElement CREATE_CATEGORY;

	@FindBy(name="category")
	private WebElement CATEGORY_NAME;

	@FindBy(name="description")
	private WebElement CATEGORY_DESCRIPTION;

	@FindBy(name="submit")
	private WebElement CREATE_BUTTON;

	@FindBy(xpath="//input[@type='text' and @aria-controls='DataTables_Table_0']")
	private WebElement SEARCH_FOR_CATEGORY;

	public Create_Category_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCREATE_CATEGORY() {
		return CREATE_CATEGORY;
	}

	public WebElement getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}

	public WebElement getCATEGORY_DESCRIPTION() {
		return CATEGORY_DESCRIPTION;
	}

	public WebElement getCREATE_BUTTON() {
		return CREATE_BUTTON;
	}

	public WebElement getSEARCH_FOR_CATEGORY() {
		return SEARCH_FOR_CATEGORY;
	}

	public void create_Category(String category,String desc)
	{
		getCREATE_CATEGORY().click();
		getCATEGORY_NAME().sendKeys(category);
		getCATEGORY_DESCRIPTION().sendKeys(desc);
		getCREATE_BUTTON().click();	
	}
	public void search_Category(WebDriver driver,String category,WebDriverUtility wlib)
	{
		wlib.scrollIntoSpecificElement(driver, getSEARCH_FOR_CATEGORY());
		getSEARCH_FOR_CATEGORY().sendKeys(category);
		String text=driver.findElement(By.xpath("//td[text()='AI']")).getText();
		Assert.assertEquals(text, "AI","category not created");
		System.out.println("category is created");
//		if(text.equals("AI"))
//		{
//			System.out.println("category is created");
//		}
//		else
//		{
//			System.out.println("category is not created");
//		}

	}


}
