package JavaAssignment;

import org.testng.annotations.Test;

public class C {

	@Test
	public void r()
	{
		
		int[] a= {10,20,30,40,50};
	    int n=2;
	 for(int j=n;j<a.length;j++)
	  { 
	
		for(int i=j;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<=j-1;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		 System.out.println();
		 break;
	  }
	}  
	
	
	@Test
	public void t()
	{
		
		String s1="i am from banglore";
		String s2="you are from patna";
		
		for(int i=0;i<s1.length();i++)
		{
			boolean flag=false;
			for(int j=0;j<s2.length();j++)
			{
				
				if(!(s1.equalsIgnoreCase(s2)))
				{
					flag=true;
				}
			}
			if(flag==true)
			{
				System.out.print(s1.charAt(i));
			}
		}
		
	}
	
}
