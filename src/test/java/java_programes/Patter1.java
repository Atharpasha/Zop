package java_programes;

import org.testng.annotations.Test;

public class Patter1 {
@Test
public void p1()
{
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(j==0 &&(i==0||i==1||i==2||i==3||i==4))
			{
				System.out.print("a ");
			}
			else if(j==1 &&(i==1||i==2||i==3||i==4))
			{
				System.out.print("b ");
			}
			else if(j==2 &&(i==2||i==3||i==4))
			{
				System.out.print("c ");
			}
			else if(j==3 &&(i==3||i==4))
			{
				System.out.print("d ");
			}
			else if(j==4 &&i==4)
			{
				System.out.print("e ");
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
public void p2()
{
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==0&&j==0)
			{
				System.out.print("a ");
			}
			else if(i==1 && (j==0||j==1))
			{
				System.out.print("b ");
			}
			else if(i==2 && (j==0||j==1||j==2))
			{
				System.out.print("c ");
			}
			else if(i==3 && (j==0||j==1||j==2||j==3))
			{
				System.out.print("d ");
			}
			else if(i==4 && (j==0||j==1||j==2||j==3||j==4))
			{
				System.out.print("e ");
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
public void p3()
{
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if((i==0&&j==0) ||(i==4&&j==0))
			{
				System.out.print("0 ");
			}
			else if((i==1&&j==0)||(i==4&&j==1))
			{
				System.out.print("1 ");
			}
			else if((i==1&&j==1)||(i==4&&j==2))
			{
				System.out.print("2 ");
			}
			else if((i==2&&j==0)||(i==4&&j==3))
			{
				System.out.print("3 ");
			}
			else if((i==2&&j==1)||(i==4&&j==4))
			{
				System.out.print("4 ");
			}
			else if(i==2&&j==2)
			{
				System.out.print("5 ");
			}
			else if(i==3&&j==0)
			{
				System.out.print("6 ");
			}
			else if(i==3&&j==1)
			{
				System.out.print("7 ");
			}
			else if(i==3&&j==2)
			{
				System.out.print("8 ");
			}
			else if(i==3&&j==3)
			{
				System.out.print("9 ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}


}
