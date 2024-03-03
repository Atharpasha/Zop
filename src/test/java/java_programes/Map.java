package java_programes;

import org.testng.annotations.Test;

public class Map {
	
	@Test
	public void swap2NoUsing3rdVari()
	{
		int a=10;
		int b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is ="+a);
        System.out.println("b is ="+b);
		
		
	}
	@Test
	public void swap2NoWithoutUsing3rdVari()
	{
		int a=10;
		int b=20;
        a=a+b;//30
        b=a-b;//10
        a=a-b;//20
       
        System.out.println("a is ="+a);
        System.out.println("b is ="+b);
		
		
	}
	//bubble sorting
	
	@Test
	public void sortArrayAscendingOrder()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		for(int ar:array)
		{
			System.out.println(ar+" ");
		}
			
	}
	@Test
	public void sortDescArray()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		for(int ar:array)
		{
			System.out.println(ar+" ");
		}
		
	}
	@Test
	public void fstMinValue()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			System.out.println(array[0]);
		}
		
			
	}
	@Test
	public void secMinValue()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		System.out.println(array[1]);
			
	}
	@Test
	public void fstMaxValue()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		System.out.println(array[0]);
			
	}
	@Test
	public void secMaxValue()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		System.out.println(array[1]);
			
	}
	@Test
	public void sumfst3MinNum()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		//System.out.println(array[0]+array[1]+array[2]);
		int sum=0;
		for(int k=0;k<3;k++)
		{ 
			sum+=array[k];
		}
		System.out.println("sum of fst3Number ="+sum);	
	}
	@Test
	public void sumfst3MaxNum()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		//System.out.println(array[0]+array[1]+array[2]);
		int sum=0;
		for(int k=0;k<3;k++)
		{ 
			sum+=array[k];
		}
		System.out.println("sum of fst3Numbers ="+sum);	
	}
	@Test
	public void productoffst3MinNum()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		//System.out.println(array[0]*array[1]*array[2]);
		int product=1;
		for(int k=0;k<3;k++)
		{ 
			product*=array[k];
		}
		System.out.println("sum of fst3Numbers ="+product);	
	}
	@Test
	public void productOfFst3MaxNum()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
			
		}
		//System.out.println(array[0]*array[1]*array[2]);
		int product=1;
		for(int k=0;k<3;k++)
		{ 
			product*=array[k];
		}
		System.out.println("sum of fst3Numbers ="+product);	
	}
}
