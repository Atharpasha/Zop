package Maven_Sample;

import java.util.HashSet;

import org.testng.annotations.Test;

public class D {

	
	@Test
	public void t1()
	{
		String s="aba";
		
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(char c:hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(c);
			}
		}
		
	}
	
	@Test
	public void t11()
	{
		 int num[] = {7,-3,0,2,1,-9};
	     int highest =0;
	     int secondHighest = 0; 
	     int thirdHighest = 0;
	 
	     for (int i = 0; i < num.length; i++)
	     {  
	         if (num[i] > highest) {   
	        	thirdHighest=secondHighest; 
	            secondHighest = highest; 
	            highest = num[i];
	        }
	         else if (num[i] > secondHighest) { 
		        	thirdHighest=secondHighest; 
		            secondHighest = num[i]; 
		        }
	         else if (num[i] > thirdHighest) { 
		        	thirdHighest=num[i];
		        }
	     }
	     System.out.println(highest*secondHighest*thirdHighest);
	}
	
	
	@Test
	public void t111()
	{
		
	}
}
