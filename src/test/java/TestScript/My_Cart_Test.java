package TestScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.online_shhopping_object_repository.Home_Page;
import com.online_shopping_generic_library.BaseClass;
import com.online_shopping_generic_library.ObjectRefrence;

@Listeners(com.online_shopping_generic_library.ListernerImplementationClass.class)
public class My_Cart_Test extends BaseClass{
	@Test
	public void My_cart_Test()
	{
		ob.k.clickOnHomeLink();
//		Home_Page home=new Home_Page(driver);
//		home.clickOnMy_CartLink();
		Assert.fail();
		System.out.println("My cart is passed");
	}
}
