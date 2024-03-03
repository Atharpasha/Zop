package java_programes;

import org.testng.annotations.Test;

public class P {
	@Test
	public void r()
	{
		for(int i=0;i<5;i++)
		{
			
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void r1()
	{ 
		for(int i=0;i<6;i++)
			
		{
			char c='A';
			for(int j=i;j<6;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}
	@Test
	public void r2()
	{ 
		for(int i=0;i<5;i++)
			
		{
			for(int j=0;j<5;j++)
			{
				if((i==1&&j==0) ||(i==1&&j==4)||(i==3&&j==0)||(i==3&&j==4))
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(" * ");
				}
			
			}
			
			
			System.out.println();
		}
	}
	@Test
	public void r3()
	{ 
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");
			
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}
