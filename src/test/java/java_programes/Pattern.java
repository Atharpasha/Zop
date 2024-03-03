package java_programes;

import org.testng.annotations.Test;

public class Pattern {
	@Test
	public void square()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(   );
		}
	}
	@Test
	public void pattern2()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==0 && j==0)
				{
					System.out.print(" * ");
				}
				else if(i==1 && (j==0 ||j==1))
				{
					System.out.print(" * ");
				}
				else if(i==2 &&(j==0 ||j==1||j==2))
				{
					System.out.print(" * ");
				}
				else if(i==3 &&(j==0 ||j==1||j==2||j==3))
				{
					System.out.print(" * ");
				}
				
			}
			System.out.println(  );
		}
	}
	@Test
	public void pattern3()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			  if(i==0 &&(j==0 ||j==1||j==2||j==3||j==4))
				{
					System.out.print(" * ");
				}
			  else if(i==1 &&(j==0 ||j==1||j==2||j==3))
					{
						System.out.print(" * ");
					}
			  else if(i==2 &&(j==0 ||j==1||j==2))
				{
					System.out.print(" * ");
				}
			  else if(i==3 && (j==0 ||j==1))
				{
					System.out.print(" * ");
				}
			  else if(i==4 && j==0)
				{
					System.out.print(" * ");
				}
			}
			System.out.println( );
		}
		
	}
	@Test
	public void pattern4()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			  if(i==0 && j==4)
				{
					System.out.print(" * ");
				}
			  else if(i==1 && (j==0 || j==1))
					{
						System.out.print(" * ");
					}
			  else if(i==2 && (j==0 ||j==1||j==2))
				{
					System.out.print(" * ");
				}
			  else if(i==3 &&(j==0 ||j==1||j==2||j==3))
				{
					System.out.print(" * ");
				}
			  else if(i==4 &&(j==0 ||j==1||j==2||j==3 ||j==4))
				{
					System.out.print(" * ");
				}
			}
			System.out.println(  );
		}
	}
	@Test
	public void pattern5()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			  if((i==0 && (j==0||j==1||j==2||j==3||j==4))||(i==1 && (j==1||j==2||j==3||j==4)||(i==2 && (j==2||j==3||j==4)))||(i==3 && (j==3||j==4))||(i==4 && j==4))
				{
				  System.out.print(" * ");
				}
			  else {
				  System.out.print(" ");
			  }
			}
			System.out.println(  );
		}
	}
	@Test
	public void pattern7()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((j==0 && (i==0||i==1||i==2||i==3||i==4)))
				{
				  System.out.print(" 1 ");
				}
				else if((j==1 && (i==0||i==1||i==2||i==3||i==4)))
				{
				  System.out.print(" 2 ");
				}
				else if((j==2 && (i==0||i==1||i==2||i==3||i==4)))
				{
				  System.out.print(" 3 ");
				}
				else if((j==3 && (i==0||i==1||i==2||i==3||i==4)))
				{
				  System.out.print(" 4 ");
				}
				else
				{
					System.out.print(" 5 ");
				}
			}
			System.out.println(  );
		}
	}
	@Test
	public void pattern8()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((j==0 &&(i==0||i==1||i==2||i==3||i==4)))
				{
				  System.out.print(" 1 ");
				}
				else if((j==1 &&(i==1||i==2||i==3||i==4)))
				{
				  System.out.print(" 2 ");
				}
				else if((j==2 &&(i==2||i==3||i==4)))
				{
				  System.out.print(" 3 ");
				}
				else if((j==3 &&(i==3||i==4)))
				{
				  System.out.print(" 4 ");
				}
				else if((j==4 && i==4))
				{
				  System.out.print(" 5 ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println( );
		}
	}
	@Test
	public void pattern9()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 &&(j==0||j==1||j==2||j==3||j==4)))
				{
				  System.out.print(" 1 ");
				}
				else if((i==1 &&(j==0||j==1||j==2||j==3)))
				{
				  System.out.print(" 2 ");
				}
				else if((i==2 &&(j==0||j==1||j==2)))
				{
				  System.out.print(" 3 ");
				}
				else if((i==3 &&(j==0||j==1)))
				{
				  System.out.print(" 4 ");
				}
				else if(i==4 &&j==0)
				{
				  System.out.print(" 5 ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern10()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 &&j==4))
				{
				  System.out.print(" 1 ");
				}
				else if((i==1 &&(j==3||j==4)))
				{
				  System.out.print(" 2 ");
				}
				else if((i==2 &&(j==2||j==3||j==4)))
				{
				  System.out.print(" 3 ");
				}
				else if((i==3 &&(j==1||j==2||j==3||j==4)))
				{
				  System.out.print(" 4 ");
				}
				else if((i==4 &&(j==0||j==1||j==2||j==3||j==4)))
				{
				  System.out.print(" 5 ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
	}
	@Test
	public void pattern11()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((j==0 &&i==0))
				{
				  System.out.print("1");
				}
				else if((j==1 &&(i==0||i==1)))
				{
				  System.out.print("2");
				}
				else if((j==2 &&(i==0||i==1||i==2)))
				{
				  System.out.print("3");
				}
				else if((j==3 &&(i==0||i==1||i==2||i==3)))
				{
				  System.out.print("4");
				}
				else if((j==4 &&(i==0||i==1||i==2||i==3||i==4)))
				{
				  System.out.print("5");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern12()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((i==0 &&j==0))
				{
				  System.out.print("A ");
				}
				else if((i==0 &&j==1))
				{
				  System.out.print("* ");
				}
				else if((i==0 &&j==2))
				{
				  System.out.print(" C ");
				}
				else if((i==0 &&j==3))
				{
				  System.out.print(" 1 ");
				}
				else if((i==1 &&j==0))
				{
				  System.out.print("Z ");
				}
				else if((i==1 &&j==1))
				{
				  System.out.print("10 ");
				}
				else if((i==1 &&j==2))
				{
				  System.out.print("20 ");
				}
				else if((i==1 &&j==3))
				{
				  System.out.print("# ");
				}
			}
			System.out.println( );
		}
	}
	@Test
	public void pattern13()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((j==0 &&(i==4||i==3||i==2||i==1||i==0)))
				{
				  System.out.print("5");
				}
				else if((j==1 &&(i==4||i==3||i==2||i==1)))
				{
				  System.out.print("4");
				}
				else if((j==2 &&(i==4||i==3||i==2)))
				{
				  System.out.print("3");
				}
				else if((j==3 &&(i==4||i==3)))
				{
				  System.out.print("2");
				}
				else if((j==4 &&i==4))
				{
				  System.out.print("1");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern14()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 &&j==0))
				{
				  System.out.print("1");
				}
				else if((i==1 &&(j==0||j==1)))
				{
					  System.out.print("2");
				}
				else if((i==2 &&(j==0||j==1||j==2)))
				{
					  System.out.print("1");
				}
				else if((i==3 &&(j==0||j==1||j==2||j==3)))
				{
					  System.out.print("2");
				}
				else if((i==4 &&(j==0||j==1||j==2||j==3||j==4)))
				{
					  System.out.print("1");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern15()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 &&j==0))
				{
				  System.out.print("      1");
				}
				else if((i==1 &&(j==0||j==1)))
				{
					  System.out.print("    2");
				}
				else if((i==2 &&(j==0||j==1||j==2)))
				{
					  System.out.print("   3");
				}
				else if((i==3 &&(j==0||j==1||j==2||j==3)))
				{
					  System.out.print("  4");
				}
				else if((i==4 &&(j==0||j==1||j==2||j==3||j==4)))
				{
					  System.out.print(" 5 ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern16()
	{
		char ch='A';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
	}
	@Test
	public void pattern17()
	{
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<1;j++)
//			{
//				System.out.print("A B C D E");
//			}
//			System.out.println();
//		}
		for(int i=0;i<5;i++)
		{  char ch='A';
			for(int j=0;j<5;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
	}
}