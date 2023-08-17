package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.online_shhopping_object_repository.Create_Category_Page;
import com.online_shhopping_object_repository.Login_Admin_Page;
import com.online_shopping_generic_library.BaseClass;

public class Create_Category_TestngTest extends BaseClass {
	@Test(groups= {"regression"}) 
	public void Create_Category_Test() throws IOException
	{
		String URL2=fLib.readDtaFromPropertyFile("url2");
		String USERNAME2=fLib.readDtaFromPropertyFile("username2");
		String PASSWORD2=fLib.readDtaFromPropertyFile("password2");
		String category=ELib.readDataFromExcel("category", 1, 0);
		String desc=ELib.readDataFromExcel("category", 1, 1);
		wLib.get(URL2, driver);
		Login_Admin_Page admin_login=new Login_Admin_Page(driver);
		admin_login.admin_Login(USERNAME2, PASSWORD2);
		Create_Category_Page create_cat=new Create_Category_Page(driver);
		create_cat.create_Category(category, desc);
		create_cat.search_Category(driver, category, wLib);
		String URL=fLib.readDtaFromPropertyFile("url");
		wLib.get(URL, driver);
		
	}
}
