package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.online_shhopping_object_repository.Billing_Shipping_Addresses_And_Procced_To_Chechout_Page;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Ship_And_Bill_Using_Map_Page;
import com.online_shopping_generic_library.BaseClass;

public class Shipping_Billing_Addresses_TestngTest extends BaseClass{
	@Test(groups={"regression"})
	public void Shipping_Billing_Addresse_Test() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Home_Page home=new Home_Page(driver);
		home.clickOnMy_AccountLink();
		Billing_Shipping_Addresses_And_Procced_To_Chechout_Page BAS=new Billing_Shipping_Addresses_And_Procced_To_Chechout_Page(driver);
		BAS.click_On_Billing_And_Shipping_Address_Link();
		Ship_And_Bill_Using_Map_Page map=new Ship_And_Bill_Using_Map_Page(driver);
		map.billing_Address(ELib.getMultipleDataFromExcel(driver,"billing_address", 0, 1), driver,wLib);
		map.shipping_Address(ELib.getMultipleDataFromExcel(driver,"shipping_address", 0, 1), driver, wLib);
		System.out.println("shipping and billing address updated successfully");
	}
}
