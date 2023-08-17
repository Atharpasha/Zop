package Maven_Sample;

import org.testng.annotations.Test;

public class BTest {

	@Test(groups= {"smoke"})
	public void cTest()
	{
		System.out.println("smoke 1 ..");
		
	}
	@Test(groups= {"regression"})
	public void dTest()
	{
		System.out.println("regression 1..");
		
	}
}
