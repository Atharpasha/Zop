package Maven_Sample;

import org.testng.annotations.Test;

public class ATest {
	String a="king hh";
	String b="king";
	@Test()
	public void aTest()
	{
		if(a==b)
		{
		System.out.println("kk");	
		}
		
	}
	@Test(groups= {"regression"})
	public void bTest()
	{
		System.out.println("regression..");
		
	}

}
