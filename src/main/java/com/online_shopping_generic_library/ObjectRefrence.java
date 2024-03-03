package com.online_shopping_generic_library;

import org.openqa.selenium.WebDriver;

import com.online_shhopping_object_repository.Billing_Shipping_Addresses_And_Procced_To_Chechout_Page;
import com.online_shhopping_object_repository.Home_Page;

public class ObjectRefrence  {
	 
	public WebDriver driver;
	
	public ObjectRefrence(WebDriver driver) {
		this.driver=driver;
	}
	public Home_Page k = new Home_Page(driver);
	public Billing_Shipping_Addresses_And_Procced_To_Chechout_Page b=new Billing_Shipping_Addresses_And_Procced_To_Chechout_Page(driver);
	
	
}
 