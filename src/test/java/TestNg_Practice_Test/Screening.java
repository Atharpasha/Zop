package TestNg_Practice_Test;

import org.testng.annotations.Test;

public class Screening {
@Test
 public void r() {
	int a=0;
	int b=1;
	
 for(int i=1;i<=10;i++)
 {
	 System.out.print(a+" ");
	 int c=a+b;
	 a=b;
	 b=c;
 }
 System.out.println();
}

@Test
public void r1() {
	
	String s="athar";
	
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<=s.length();j++)
		{
			String s1=s.substring(i, j);
			System.out.println(s1);
		}
	}
  }
}
