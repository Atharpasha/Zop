package Maven_Sample;

import org.testng.annotations.Test;

public class ATest {
	@Test(groups= {"smoke"})
	public void aTest()
	{
		System.out.println("smoke..");
		
	}
	@Test(groups= {"regression"})
	public void bTest()
	{
		System.out.println("regression..");
		
	}

}
