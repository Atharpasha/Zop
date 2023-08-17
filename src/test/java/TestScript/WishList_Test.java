package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.online_shhopping_object_repository.Home_Page;
import com.online_shopping_generic_library.BaseClass;

public class WishList_Test extends BaseClass{
	@Test(groups= {"smoke"})
	public void Add_product_to_whishlist_Test() throws IOException
	{
		Home_Page home=new Home_Page(driver);
        home.clickOnHomeLink();
        home.clickOnElectronicsLink(driver);
        home.clickOnMobilesLink(driver);
        home.clickOnWishListButton(driver);
        System.out.println("add_to_wishlist_is_passed");
		
	}

}
