package java_programes;

import org.testng.annotations.Test;

public class Numbers {
	@Test
	public void factorial()
	{
		int num=5;
		int f=1;
		for(int i=1;i<=5;i++)
		{
			f*=i;
			
		}
		System.out.println("Factorial of 5 is = "+f);
	}
	@Test
	public void fibonanacci()
	{
		int a=0;int b=1;
		for(int i=0;i<=5;i++)
		{
		System.out.println(a);
		int c=a+b;
		a=b;
		b=c;
			
		}
		
	}
	@Test
	public void primeNumber()
	{
		String prime="";
		String non_prime="";
		for(int i=1;i<=30;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;	
				}
			}
			if(count==2)
			{
				prime+=i+" ";
			}
			else {
				non_prime+=i+" ";
			}
		}
		System.out.println(prime);
		System.out.println(non_prime);
	}
	@Test
	public void primeNumberFromArray()
	{
		int[] a= {1,9,3,55,2,6,7,4};
		
		for(int i=0;i<a.length;i++)
		{   int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]+" is a prime Nuumber");
			}
			else
			{
				System.out.println(a[i]+" is  not a prime Nuumber");
			}
		}
	}
	@Test
	public void primeNumberFrom()
	{int n=1;
		for(int i=0;i<=6;i++)
		{
			 //1 3 7 15 31 63 127
			System.out.println(n+" ");
			n=(n*2)+1;
			
		}
	}
	@Test
	public void Strong()
	{
		int num=145;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int f=1;
		
			for(int i=rem;i!=0;i--)
			{
				f=f*i;//5*4*3*2*1
				//4*3*2*1
				
			}
			sum=sum+f;//120+24+1=145
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is a strong num");
			
		}
		else
		{
			System.out.println("its not a strong num");
		}
	}
}
