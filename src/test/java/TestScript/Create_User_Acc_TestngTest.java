package TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.online_shhopping_object_repository.Create_A_New_Account_Page;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Login_Admin_Page;
import com.online_shhopping_object_repository.Manage_User_Page;
import com.online_shhopping_object_repository.Sign_In_Page;
import com.online_shopping_generic_library.BaseClass;

public class Create_User_Acc_TestngTest extends BaseClass{
	@Test(groups={"smoke"})
	public void create_UserTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String URL=fLib.readDtaFromPropertyFile("url");
		String URL2=fLib.readDtaFromPropertyFile("url2");
		String USERNAME1=fLib.readDtaFromPropertyFile("username2");
		String PASSWORD1=fLib.readDtaFromPropertyFile("password2");
		String USERNAME=fLib.readDtaFromPropertyFile("username");
		String PASSWORD=fLib.readDtaFromPropertyFile("password");
		Home_Page home=new Home_Page(driver);
		home.clickOnLogoutLink();
		home.clickOnLoginLink();
		Create_A_New_Account_Page creatt=new Create_A_New_Account_Page(driver);
		creatt.create_A_User_Account(ELib.getMultipleDataFromExcel(driver,"create_user_ac", 0, 1) , driver, JLib);
		creatt.pop_Register(driver, wLib);
		wLib.get(URL2, driver);
		Thread.sleep(5000);
		Login_Admin_Page admin=new Login_Admin_Page(driver);
		admin.admin_Login(USERNAME1, PASSWORD1);
		Manage_User_Page manage_user=new Manage_User_Page(driver);
		manage_user.search_For_User("king", driver);
		wLib.get(URL, driver);
		home.clickOnLoginLink();
		Sign_In_Page signin=new Sign_In_Page(driver);
		signin.sign_In_To_Application(USERNAME, PASSWORD);
	}
}
