package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.online_shhopping_object_repository.Billing_Shipping_Addresses_And_Procced_To_Chechout_Page;
import com.online_shhopping_object_repository.Choose_Payment_Method;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shopping_generic_library.BaseClass;

public class Order_Product_Test extends BaseClass {

	@Test(groups= {"smoke","regression"})
	public void Order_product_Test()
	{
		Home_Page home=new Home_Page(driver);
		home.clickOnHomeLink();
		driver.findElement(By.xpath("//a[@href='category.php?cid=4']")).click();
		driver.findElement(By.xpath("//a[@href='sub-category.php?scid=3']")).click();
		home.clickOnElectronicsLink(driver);
		home.clickOnMobilesLink(driver);
		home.clickOnAddProductButton(driver);
		home.verify_order(driver,wLib);  
		Billing_Shipping_Addresses_And_Procced_To_Chechout_Page checkout=new Billing_Shipping_Addresses_And_Procced_To_Chechout_Page(driver);
		checkout.procced_To_Checkout(wLib, driver);
		Choose_Payment_Method CPD=new Choose_Payment_Method(driver);
		CPD.cod_Payment_Method();       
		System.out.println("payment is done");
		System.out.println("order product is passed");	
	}
}
