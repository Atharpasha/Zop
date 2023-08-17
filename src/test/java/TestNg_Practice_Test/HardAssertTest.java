package TestNg_Practice_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void hardAssertTest()
	{
		System.out.println("--1--");
		System.out.println("--2--");
		Assert.assertEquals("A", "B","Value mismatch");//verifying result
		System.out.println("--3--");
		System.out.println("--4--");
	}
	@Test
	public void hardAssert1Test()
	{
		Assert.fail();//explicitly failing TC
		System.out.println("--5--");
		System.out.println("--6--");
		boolean a=false;
		Assert.assertTrue(a,"not true");//applicable only if i want true condition
		System.out.println("--7--");
		System.out.println("--8--");
	}
	@Test
	public void hardAssert2Test()
	{
		System.out.println("--9--");
		System.out.println("--10--");
		String a=null;
		Assert.assertNotNull(a,"its a null bro");//applicable only if i want Null/NotNull condition
		System.out.println("--11--");
		System.out.println("--12--");
	}
	@Test
	public void hardAssert3Test()
	{
		System.out.println("--1--");
		System.out.println("--2--");
		if("king".contains("mm"))
		{
			System.out.println("ll");
		}
		System.out.println("--3--");
		System.out.println("--4--");
	}
}
