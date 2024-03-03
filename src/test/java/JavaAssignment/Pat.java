package JavaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class Pat {
	
	@Test
	public void p()
	{
		
		for(int i=0;i<5;i++)
		{
			int m=(i*2)+1;
			int x=1;
			for(int j=1;j<=m;j++)
			{
				
				if(j<=i)
				{
					System.out.print((x++)+" ");
				}
				else
				{
					System.out.print((x--));
				}
				
			}
			System.out.println("");
		}
		
	}

	@Test
	public void p1()
	{
		
		int n=1223345588;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		while(n!=0)
		{
			int rem=n%10;
			if(map.containsKey(rem))
			{
				map.put(rem,map.get(rem)+1);//4 
			}
			else
			{
				map.put(rem,1);
			}
			n=n/10;
				
		}
		System.out.println(map);
		
	}
	@Test
	public void p11()
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int c=1;
			for(int j=1;j<=i*2+1;j++)
			{
				if(j<=(i*2)/2)
				{
					System.out.print((c++)+" ");
				}
				else
				{
					System.out.print(c--+" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void p111()
	{	
		for(int i=0;i<5;i++)
		{
		
			for(int j=i;j<4;j++)
			{
				System.out.print("  ");
			}
			int d=1;
			for(int j=5;j>=5-i;j--)
			{
				System.out.print((d++)+" ");
			}
			for(int j=i;j>0;j--)
			{
				int h=j;
				System.out.print((h--)+" ");	
			}
			System.out.println();
		}
	}
	@Test
	public void pp()
	{
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		ArrayList<Integer> d=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			d.add(a[i]);
			d.add(b[i]);
		}
		System.out.println(d);
	}
	
	@Test
	public void map()
	{
		
		int[] a={2,3,0,1,8,0,9};
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==0)
			{
				int s=a[i];
				for(int j=0;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				a[a.length-1]=s;
			}
		}
		for(int d:a)
		{
			System.out.println(d);
		}
		}
		
	@Test
	public void AR()
	{
		int[] a= {1,2,3,4,5,7,9};	
		int sum=0;
		ArrayList<Integer> r=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			r.add(a[i]);
		}
		int sum1=0;
		for(int i=1;i<=9;i++)
		{
			if(!r.contains(i))
			{
				System.out.print(i+",");
			}
		}
	
	}	
		
	@Test
	public void insrt()
	{
		
		int[] a= {1,3,4,5};
		ArrayList<Integer> r=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(i==1)
			{
				r.add(2);
			}
			else
			{
			r.add(a[i]);
			}
		}
	
		System.out.println(r);
		
	}	
		
		
		
		
	
}
