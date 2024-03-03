package java_programes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayFinding {
	@Test
	public void fstMinNoWithoutBubble()
	{
		int[] array= {5,3,0,1,4};
		int len=array.length;
		int min=array[0];
		for(int i=0;i<len;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
				
		}
			System.out.println(min);
			
	}
	@Test
	public void fstMaxNoWithoutBubble()
	{
		int[] array= {1,2,5,3,0,1,4};
		int len=array.length;
		int max=array[0];
		for(int i=0;i<len;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
				
		}
			System.out.println(max);
		 
		
	}
	@Test
	public void max()
	{
		 int num[] = {3,5,6,9,55,10,50};
	     int n = num.length;
	     int highest =num[0];// 5
	     int secondHighest = num[0]; //3
	     int thirdHighest = num[0];//3
	     int fourthHighest = num[0];//3
	 
	     for (int i = 0; i < n; i++) {  
	         if (num[i] > highest) {   //3>3f,5>3t 6>5t 9>6t 55>9t 10>55 50>55
	        	fourthHighest=thirdHighest; // 3 3 3 5
	        	thirdHighest=secondHighest;//3 3  5 6
	            secondHighest = highest; //3 5 6 9
	            highest = num[i]; //5 6 9 55
	        }
	         else if (num[i] > secondHighest) { //3>3f 10>9t 50>10t
	        	    fourthHighest=thirdHighest;// 6 9
		        	thirdHighest=secondHighest; //9 10
		            secondHighest = num[i]; //10 50
		        }
	         else if (num[i] > thirdHighest) { //3>3f
	        	 fourthHighest=thirdHighest;
		        	thirdHighest=num[i];
		        }
	         else if (num[i] > fourthHighest) { //3>3f
		        	fourthHighest=num[i];
		        }
	         
	    }
	    System.out.println("first highest  " + highest);
	    System.out.println("Second highest " + secondHighest);
	    System.out.println("third highest " + thirdHighest);
	    System.out.println("fourth highest " + fourthHighest);
	  
		
	}
	@Test
	public void max1()
	{
		int num[] = {3,5,6,9,55,10,50};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			//System.out.print(num[i]+" ");
			
		}
		System.out.println(num[0]);
	}
	@Test
	public void min()
	{
		 int arr[] = {17,10,9,4,2};
	     int smallest = arr[0];
	        int secondSmallest = arr[0];
	        int thirdSmallest = arr[0];
	        for(int i = 0; i < arr.length; i++) {
	 
	            if(arr[i] < smallest) { 
	            	thirdSmallest=secondSmallest;
	                 secondSmallest = smallest;
	                 smallest = arr[i]; 
	            } 
	 
	            else if(arr[i] < secondSmallest ) {
	            	thirdSmallest=secondSmallest;
	                secondSmallest = arr[i];
	             }
	            else if(arr[i] < thirdSmallest ) {
	                thirdSmallest = arr[i];
	             }
	          }
	    System.out.println("first smallest  " + smallest);
	    System.out.println("Second secondsmallest " + secondSmallest);
	    System.out.println("third secondsmallest " + thirdSmallest);
	}
	@Test
	public void printCombinationOfNumber()
	{
	 int[] arr= {8,4,3,9,2,7,5,3,6};
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			if(arr[i]+arr[j]==11)
			{
				System.out.println(arr[i]+"  "+arr[j]);
			}
		 }
		 
	 }
		
	}
	@Test
	public void printCombinationOfEvenNumber()
	{
	 int[] arr= {8,4,3,9,2,7,5,3,6};
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			if(((arr[i]+arr[j])%2)==0)
			{
				System.out.println(arr[i]+"  "+arr[j]);
			}
		 }
		 
	 }
		
	}
	@Test
	public void printCombinationOfOddNumber()
	{
	 int[] arr= {8,4,3,9,2,7,5,3,6};
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			if(((arr[i]+arr[j])%2)==1)
			{
				System.out.println(arr[i]+"  "+arr[j]);
			}
		 }
		 
	 }
		
	}
	@Test
	public void additionOfTwoArray()
	{
	 int[] a= {4,2,6,1,7};
	 int[] b= {3,1,7,2};
	int c[]=a;
	 int len=a.length;
	 if(a.length<b.length)
	 {
		 len=b.length;
	 }
	 for(int i=0;i<len;i++)
	 { 
		 try {
	      
		 System.out.println(a[i]+b[i]+" "); 
	         }
		 catch(Exception e)
	  {
		 if(a.length<b.length)
		 {
			 System.out.println(b[i]);
		 }
		 else
		 {
			 System.out.println(a[i]);
		 }
		 
	  }
     }
	 
		
	}
	@Test
	public void additionOfTwoArr()
	{
	 int[] a= {4,2,6,1};
	 int[] b= {3,1,7,2};
	int c[]=new int[a.length];
	
	 for(int i=0;i<a.length;i++)
	 {
		 c[i]=a[i]+b[i];
		System.out.print(c[i]+" "); 
		 
	 }
 }
	@Test
	public void additionOfTwoArrayOther()
	{
	 int[] a= {4,2,6,1,7};
	 int[] b= {3,1,7,2};
	if(a.length>=b.length)
	{
		int[] c=new int[a.length];
		
		 for(int i=0;i<c.length;i++)
		 {   
			 if(i<b.length)//0<4,1<4,2<4,3<4,4<4
			 {
				 c[i]=a[i]+b[i]; 
				 System.out.println(c[i]);
			 }
			 else
			 {
				 c[i]=a[i];
				 System.out.println(c[i]);
			 }
			
			
	     }
		
	}
	else 
	{
		int[] c=new int[b.length];
		for(int i=0;i<c.length;i++)
		{
			 if(i<a.length)
			 {
				 c[i]=a[i]+b[i]; 
				 System.out.println(c[i]);
			 }
			 else
			 {
				 c[i]=b[i];
				 System.out.println(c[i]);
			 }
		}
	}	

}
	@Test
	public void appending0sAtLast()
	{
		int[] a= {5,0,4,0,0,9};//o/p---5 4 9 0 0 0
		int []b=new int [a.length];
		int m=0;//non zeros shift to left side
		int n=a.length-1;//shift zeros to righ side
		for(int i=0;i<a.length;i++)
		{
				if(a[i]!=0)
				{
				b[m]=a[i];	
				m++;
				}
				else
				{
					b[n]=a[i];
					n--;
				}
		}
		for(int d:b)
		{
			System.out.println(d+" ");
		}
		
	}
	@Test
	public void appending0sAtFirst()
	{
		int[] a= {5,0,4,0,0,9};//o/p---0 0 0 5 4 9 
		int []b=new int [a.length];
		int m=0;//non zeros shift to left side
		int n=a.length-1;//shift zeros to righ side
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==0)
				{
				b[m]=a[i];	
				m++;
				
				}
				else
				{
					b[n]=a[i];
					n--;
					
				}
		}
		for(int d:b)
		{
			System.out.println(d+" ");
		}
		
	}
	@Test
	public void appending0sAtFirs()
	{
		int[] a= {5,0,4,0,0,9};//o/p---0 0 0 5 4 9 
		int [] b=new int[a.length];
		int m=0;
		int n=a.length/2;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n++;
			}
			

		}
		for(int d:b)
		{
		System.out.println(d);	
		}
	}
	@Test
	public void removeDuplicatesFromArrayUsingCellection()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}	
		for(int d:set)
		{
		System.out.println(d);	
		}
	}
	@Test
	public void removeDuplicatesFromArrayUsingMap()
	{
		int [] a= {2,3,1,4,1,3,5,2};
	HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{ 
				map.put(a[i],i);
			
		}	
		for(Entry<Integer, Integer> d:map.entrySet())
		{
			System.out.println(d.getKey()+" ");
		}
		
	}
	@Test
	public void countHowManyTimesDuplicateNumberIsRepeatingInArrayUsing()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		
		for(int i=0;i<a.length;i++)
		{  int count=0;
		
		
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				 count ++;
						
				}
			}	
			if(count>=1)
		{
				System.out.println(a[i]+ " is repeating"+   count+" times");
			}	
		}
	}
	@Test
	public void removeDuplicateNumberIsRepeatingInArray()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		
		for(int i=0;i<a.length;i++)
		{
		
		boolean f=false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				 f=true;
						
				}
			}	
			if(f==false)
			{
	        	System.out.println(a[i]+ " "+i);	
				
			}
		}
		
	}
	@Test
	public void countHowManyTimesDuplicateNumberIsRepeatingInArrayUsingCollection()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		
		for(int d:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(d==a[i])
				{
					count++;
				}
				
			}
			System.out.println(d+" is repeating "+count+"times");
		}
		
	}
	@Test
	public void countHowManyTimesDuplicateNumberIsRepeatingInArrayUsingMap()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i],i);
			
		}
		
		//for(int j=0;j<map.size();j++)
		for(Entry<Integer, Integer> p:map.entrySet())
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				//if(a[j]==a[i])
				if(p.getKey()==a[i])
				{
					count++;
				}
				
			}
			System.out.println(p.getKey()+" is repeating "+count+"times");
		}
		
	}
	@Test
	public void countNoOfDuplicatesInArrayUsingCollection()
	{
      int [] a= {2,3,1,4,1,3,5,2};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		int NoOfcount=0;
		for(Integer d:set)
		{	int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(d==a[i])
				{
					count++;
				}
				
			}
			
			if(count>=1) {
				NoOfcount++;
			}
			
	     }	
		System.out.println(NoOfcount);
		
	}
	@Test
	public void positionOfEachNoInArrayWithoutDuplicatesUsingCollection()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer d:set)
		{ 
			for(int j=0;j<a.length;j++)//gives position
			{
			
				if(a[j]==d)//2 ==2
				{
					System.out.println(d+" is present in "+(j)+"   position");
					break;
				}
				
			}
			
		}
		
	}
	
		
	@Test
	public void positionOfEachNoInArrayWithoutDuplicatesUsingCollectionn()
	{
		int [] a= {2,3,1,4,1,3,5,2};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		 List<Integer> l=new ArrayList<Integer>(set);
		 Collections.sort(l);
			for(int j=0;j<l.size();j++)//gives position
			{
			  System.out.println(l.get(j)+" is present in "+(j)+"   position");
			}	
		}
		
	@Test
	public void positionOfEachNoInArrayWithoutDuplicatesUsingMap()
	{int [] a= {2,3,1,4,1,3,5,2};
	
	LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
	for(int i=0;i<a.length;i++)
	{
		map.put(a[i],i);
		
	}
	System.out.println(map);
	//for(int j=0;j<map.size();j++)
	for(Entry<Integer, Integer> p:map.entrySet())//{2=7, 3=5, 1=4, 4=3, 5=6}
	{
		for(int i=0;i<a.length;i++)//{2,3,1,4,1,3,5,2};
		{  
			//if(a[j]==a[i])
			if(p.getKey()==a[i])
			{
				System.out.println(p.getKey()+" is present in "+(i)+"   position");
				break;
			}
			
		}
		
	}
	}
	
	@Test
	public void positionOfEachNoInArray()
	{
		String s="testyantra";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+" position  "+i);
		}	
	}
}

