package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.online_shhopping_object_repository.Create_A_New_Account_Page;
import com.online_shhopping_object_repository.Home_Page;
import com.online_shhopping_object_repository.Sign_In_Page;
import com.online_shopping_generic_library.BaseClass;

public class Sign_Up_App_Test extends BaseClass {
	@Test(groups= {"smoke"})
	public void sign_up_Test() throws EncryptedDocumentException, IOException, InterruptedException
	{				
		     	String full_name=ELib.readDataFromExcel("signup", 1, 0);
		     	String email_first=ELib.readDataFromExcel("signup", 1, 1);
		     	String email_extension=ELib.readDataFromExcel("signup", 2, 1);
		     	String email=email_first+JLib.getRandom()+email_extension;
		     	String contact=ELib.readDataFromExcel("signup", 1, 2);
		     	String password=ELib.readDataFromExcel("signup", 1, 3);
		     	String confpassword=ELib.readDataFromExcel("signup", 1, 4);
		     	Home_Page home=new Home_Page(driver);
		     	home.clickOnLogoutLink();
		     	Thread.sleep(2000);
				home.clickOnLoginLink();
				Create_A_New_Account_Page create_ac=new Create_A_New_Account_Page(driver);
				create_ac.create_A_New_Account(full_name ,email ,contact,password,confpassword);
				create_ac.verify_Create_Account(driver, wLib);
				Sign_In_Page signin=new Sign_In_Page(driver);
				home.clickOnLoginLink();
				String USERNAME = fLib.readDtaFromPropertyFile("username");
				String PASSWORD = fLib.readDtaFromPropertyFile("password");
				signin.sign_In_To_Application(USERNAME,PASSWORD);
				System.out.println("Sgn up has done");
			}	
}
