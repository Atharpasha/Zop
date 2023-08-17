package TestNg_Practice_Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.online_shopping_generic_library.BaseClass;
@Listeners(com.online_shopping_generic_library.ListernerImplementationClass.class)
public class T1_Test extends BaseClass {
	@Test(retryAnalyzer =com.online_shopping_generic_library.RetryImplementationClass.class )
	public void create()
	{
		System.out.println("--create--");	
	}

	@Test
	public void edit() 
	{
		System.out.println("--edit--");
	}

	@Test
	public void delete()
	{
		System.out.println("delete");	
	}
	


}
