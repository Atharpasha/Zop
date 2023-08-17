package TestNg_Practice_Test;

import org.testng.annotations.Test;

public class SoftAssertTest {
	@Test
	public void softAssertTest()
	{
		System.out.println("--1--");
		System.out.println("--2--");
//		SoftAssert sa=new SoftAssert();
//		sa.assertEquals("A", "B","Value mismatch");
//		boolean b=false; 
//		sa.assertTrue(false);
//		System.out.println("--3--");
//		System.out.println("--4--");
		//sa.assertAll();//it should be at last bcoz it used to collect all the errors and once 
		//it colleect it will declare if we add this method in middle of @Test

	}
	@Test
	public void softAssert1Test()
	{
		System.out.println("--1--");
		System.out.println("--2--");
//		SoftAssert sa=new SoftAssert();
//		sa.assertEquals("A", "B","Value mismatch");
//		sa.assertNotNull(null,"its a null bro");
//		sa.assertAll();
//		System.out.println("--3--");
//		System.out.println("--4--");

	}
}
