package TestNg_Practice_Test;

import org.testng.annotations.Test;

import com.online_shopping_generic_library.BaseClass;

public class T6_Test extends BaseClass  {

	@Test
	public void ab()
	{
		System.out.println("--A--3");
	}
	@Test(groups= {"smoke"})
	public void aa()
	{
		System.out.println("--A--4");
	}
}
