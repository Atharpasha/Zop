package java_programes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.bouncycastle.operator.AADProcessor;
import org.testng.annotations.Test;

public class String_Program {
	@Test
	public void reverseString()
	{
		String s="Banglore";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		System.out.println("reverse string is = "+reverse);
		
		String s1="Banglore";
		char[] ch=s1.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		String s2="Banglore";
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.print(s2.charAt(i)+" ");
		}
		StringBuffer sb=new StringBuffer("BANGALURU");
		System.out.println(sb.reverse());
		
		StringBuilder sb1=new StringBuilder("BANGALURU");
		System.out.println(sb1.reverse());
		
		
		
	}
	@Test
	public void reverseSt()
	{
		  String s="a3b2c1d2";
		    char s1[]=s.toCharArray();
		    for(int i=0;i<s1.length;i=i+2)
		    {
		        for(int j=0;j<s1[i+1]-48;j++)
		         {
		          System.out.print(s1[i]);
		          
		         }
		    }
	}
	@Test
	public void printDup()
	{
		String s="testyantra";
		int countt=0;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&(i>j))
				{
					break;
				}
				else if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>=1)//> dup   >= non dup
				System.out.println(s.charAt(i)+""+count);
		}
	
	}
	@Test
	public void removeDupUsingCollection()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character d:set)
		{ int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(d==s1.charAt(j))
				{
//					System.out.println(d+"    "+j);
//					break;
					count++;
					
				}
			}
//			if(count>1)
//			{
				System.out.println(d);
			//}
	
		
			
		}
		
		
	}
	@Test
	public void removeDup()
	{
		String s="testyantra";
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)!=' ')
				{
				 System.out.print(s.charAt(i));
				 s=s.replace(s.charAt(i),' ');
				}
		}
		
	}
	@Test
	public void occuranceEachCharacter()
	{
		String s="testyantra";
		
	
	}
	@Test
	public void positionsOfEachCharacter()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		
			for(int j=0;j<s1.length();j++)
			{
					System.out.println(s1.charAt(j)+ "    occurance "+j);
			}
	}
	@Test
	public void occuranceOfDupCharacter()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{ 
			int count=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					s2+=s1.charAt(i);
					count++;
					
				}
			}
			if(count>1) {
			System.out.println(s2+ "    occurance "+count);
			s1=s1.replace(s1.charAt(i),' ');
			break;
			}
		}
	}
	@Test
	public void occuranceOfCharacter()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{ 
			int count=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			
			System.out.println(s1.charAt(i)+ "    occurance "+count);
		}
		
		
	}
	@Test
	public void occuranceOfEachCharacterUsingCollection()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character d:set)
		{ 
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(d==s1.charAt(j))
				{
					count++;
				}
			}
			System.out.println(d+ "    occurance "+count);
			
		}
		
		
	}
	@Test
	public void occuranceOfEachCharacterUsingMap()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			map.put(s1.charAt(i),i);
		}
		for(Entry<Character,Integer> d:map.entrySet())
		{ 
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(d.getKey()==s1.charAt(j))
				{
					count++;
				}
			}
			System.out.println(d.getKey()+ "    occurance "+count);
			
		}
		
		
	}
	@Test
	public void countOccuranceOfEachCharacterUsingMapp()
	{
		String s="TestYantra";
		String s1=s.toLowerCase();
		int NoOfOccurance=0;
		HashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			map.put(s1.charAt(i),i);
		}
		for(Entry<Character,Integer> d:map.entrySet())
		{ 
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(d.getKey()==s1.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(d.getKey()+" " +count);
				
			}
			
			
		}
	
		
	}
	@Test
	public void removeDuplicateCharacterFromString()
	{ 
		String s1="TestYantra";
		String s=s1.toLowerCase();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean f=false;
			for(int j=i+1;j<ch.length;j++)
			{ 
				if(ch[i]==ch[j])
				{
					//System.out.println(ch[i]);
					f=true;
				}
			}
			if(f==false)
			{
				System.out.println(ch[i]);
		}
		}
		
	}
	@Test
	public void removeDuplicateCharacterFromStringByColl()
	{ 
		String s1="TestYantra";
		String s=s1.toLowerCase();
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(Character d:set )
		{
			System.out.println(d+" ");
		}
		
	}
	@Test
	public void removeDuplicateCharacterFromStringByMap()
	{ 
		String s1="TestYantra";
		String s=s1.toLowerCase();
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], i);
		}
		for(Entry<Character,Integer>d:map.entrySet())
		{
			System.out.println(d.getKey()+" ");
		}
		
	}
	@Test
	public void countNoOfDuplicateFromString()
	{ 
		String s1="TestYantra";
		int NoOfCount=0;
		for(int i=0;i<s1.length();i++)
		{  int count=1;
			for(int j=i+1;j<s1.length();j++)
			{
			
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				NoOfCount++;
			
			}
			
		}
		System.out.println(NoOfCount);
		
	
	}
	@Test
	public void countNoOfDuplicateFromStringUsingCollection()
	{ 
		String s1="TestYantra";
		int NoOfCount=0;
		 HashSet<Character> set=new HashSet<Character>();
		 for(int i=0;i<s1.length();i++)
		 {
			 set.add(s1.charAt(i));
		 }
		for(Character d:set)
		{  int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(d==s1.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				NoOfCount++;
				System.out.println(d);
			}
			
		}
		//System.out.println(NoOfCount);
		
	
	}
	@Test
	public void countNoOfDuplicateFromStringUsingMap()
	{ 
		String s1="TestYantra";
		int NoOfCount=0;
		 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		 for(int i=0;i<s1.length();i++)
		 {
			 map.put(s1.charAt(i),i);
		 }
		for(Entry<Character,Integer> d:map.entrySet())
		{  int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(d.getKey()==s1.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				NoOfCount++;
			}
			
		}
		System.out.println(NoOfCount);
		
	
	}
	@Test
	public void positionOfEachCharacter()
	{
		String s="TestYantra";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println("Character "+s.charAt(i)+" and its position   "+i);
		
		}
		
	}
	@Test
	public void occuranceOfEachWord()
	{
		String s="I am from am from TestYantra";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{  int count=1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					count++;
				}
			}
			System.out.println(s1[i]+" its occurance "+count);
		}
		
		
	}
	@Test
	public void removeDuplicateWordFromString()
	{ 
		String s="I am from am from TestYantra";
		String [] s1=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{  boolean f=false;
			for(int j=i+1;j<s1.length;j++) 
			{
			  if(s1[i].equalsIgnoreCase(s1[j]))
			  {
				  f=true;
			  }
			}	
			if(f==false)
			{
				System.out.print(s1[i]+" ");
			}
		}
		
	}
	@Test
	public void countNoOfDuplicateWordFromString()
	{ 
		String s1="I am from am from TestYantra";
		String[] s2=s1.split(" ");
		int NoOfCount=0;
		for(int i=0;i<s2.length;i++)
		{  int count=1;
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].equals(s2[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				NoOfCount++;
			}
			
		}
		System.out.println(NoOfCount);
		
	
	}
	@Test
	public void positionOfEachWord()
	{
	
		String s="I am from am from TestYantra";
		String [] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println("word "+s1[i]+" and its position   "+i);
		}
		
	}
	
	@Test
	public void stringPalindrome()
	{
		String s="malayalam";
		String temp=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
	    }
		if(temp.equals(rev))
	  {
			System.out.println("its a palindrome");
	  }
		else
		{
			System.out.println("its a not a palendrome");
		}
	}
	@Test
	public void positionOfEachCharacterReverse()
	{
		String s="Tester";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i)+"  position  "+((s.length()-1)-i));
		}
	}
	@Test
	public void positionOfEachCharacterReverseUsingCollection()
	{
		String s="Tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(char d:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(d==s.charAt(i))
				{
					System.out.println(d+"  position  "+((s.length()-1)));/////****count and position ****///
					break;
				}
				
			}
			
		}
		
	}
	@Test
	public void reverseAGivenString()
	{
		String s= "i am from testyantra";
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
		System.out.print(s1[i]+"  ");
		}	
		
	}
	@Test
	public void reverseAWordsGivenString()
	{
		String s= "i am from testyantra";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{ 
			
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}
	@Test
	public void swapp1stAndLastWordsInString()
	{
		String s="i am from Testyantra";//Testyantra am from i
		String[] s1=s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}
	@Test
	public void findTheOccuranceOfEachhWordInStringUsingCollection()
	{
		String s="I am from am i TestYantra";
		String s1=s.toLowerCase();
		String[] s2=s1.split(" ");
		Set<String> set=new HashSet<String>();
		for(int i=0;i<s2.length;i++)
		{
			set.add(s2[i]);
		}
		for(String d:set)
		{ 
			int count=0;
			for(int j=0;j<s2.length;j++)
			{
				if(d.equalsIgnoreCase(s2[j]))
				{
					count++;
				}
			}
			System.out.println(d+ "    occurance "+count);
			
		}
		
		
	}
	@Test
	public void findTheOccuranceOfEachhWordInStringUsingMap()
	{
		String s="I am from am i TestYantra";
		String s1=s.toLowerCase();
		String[] s2=s1.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<s2.length;i++)
		{
			map.put(s2[i],i);
		}
		for(Entry<String,Integer> d:map.entrySet())
		{ 
			int count=0;
			for(int j=0;j<s2.length;j++)
			{
				if(d.getKey().equalsIgnoreCase(s2[j]))
				{
					count++;
				}
			}
			System.out.println(d.getKey()+ "                occurance "+count);
			
		}
		
		
	}
	@Test
	public void findTheNumberOfVowelsInAString()
	{
		String s1="India";
		String s=s1.toLowerCase();
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				s2+=s.charAt(i)+"  ";
				
			}
		}
		System.out.print("Vowels are = "+s2);
	}
	@Test
	public void countTheNumberOfVowelsInAStringWithDuplicates()
	{
		String s1="India";
		String s=s1.toLowerCase();
		 int count=0;
			for(int i=0;i<s.length();i++)
			{ 
				if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u')
				{
					count++;	
				}	
		   }
		System.out.println(count);
	}
	
	@Test
	public void countTheNumberOfVowelsInAStringWithoutDuplicates()
	{
		String s1="India";
		String s=s1.toLowerCase();
		 int count=0;
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character d:set)
		{ 
			if(d=='a' || d=='e' ||d=='i'||d=='o' ||d=='u')
			{
				count++;	
				System.out.println("vowel is  "+d+" ");
			}	
	   }
		System.out.println("NoOfCount    "+count);
	}
	@Test
	public void segregateAlphaNumberAndSpecialCharacterFromString()
	{
		String s="a1b2%c@3";
		String Alpha="";
		String number="";
		String special="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z')
			{//A=67 Z=90 a=97 z=122
			   Alpha+=s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				number+=s.charAt(i);
			}
			else 
			{

				special+=s.charAt(i);
			}
			
		}
		System.out.println("Alhabates are            "+Alpha);
		System.out.println("Numbers are              "+number);
		System.out.println("Special characters are   "+special);
		
	}
	@Test
	public void swapCase()
	{
		String s="ArShaD";
		StringBuffer b=new StringBuffer(s);
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				System.out.println(Character.toLowerCase(s.charAt(i)));
				
			}
			else if(Character.isLowerCase(s.charAt(i)))
			{
				System.out.println(Character.toUpperCase(s.charAt(i)));
			}
			
		}
		System.out.println(b);	
	}
	@Test
	public void sumOfumbersInString()
	{
		String s="1he2m4";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			//if(Character.isDigit(s.charAt(i)))
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				String d=String.valueOf(s.charAt(i));//char to string
				int f=Integer.parseInt(d);
				sum+=f;
				
			
			}
		}
		System.out.println(sum);
			
	}
	@Test
	public void sumOf2digitsInString()
	{
		String s="12a11b3";
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			   
			}
			else
			{
				sum+=tsum;
				  tsum=0;
			}
		}
		sum+=tsum;;	
		System.out.println(sum);
	}
	@Test
	public void swapString()
	{
		String s1="Athar";
		String s2="pasha";
		String s=s1+s2;
		s2=s.substring(0,(s.length()-s1.length()));//Athar
		s1=s.substring((s.length()-s2.length()),s.length());//pasha
		System.out.println(s1+" "+s2);
		
	}
	@Test
	public void printMinLengthValuesInString()
	{
		String[] s= {"12","1234","12345","45","1434234"};
		String Fmin_length=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<Fmin_length.length())
			{
				Fmin_length=s[i];
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==Fmin_length.length())
			{
				
				System.out.println(s[i]+"  ");
			}
			
		}
	}
		@Test
		public void printMaxLengthValuesInString()
		{
			String[] s= {"12","1234","12345","45","1434234"};
			String Fmax_length=s[0];
			String Smax_length=s[0];
			String Tmax_length=s[0];
			String Fomax_length=s[0];
			for(int i=0;i<s.length;i++)
			{
				if(s[i].length()>Fmax_length.length())
				{  
				    Fomax_length=Tmax_length;
					Tmax_length=Smax_length;
					Smax_length=Fmax_length;
					Fmax_length=s[i];
				}
				else if(s[i].length()>Smax_length.length())
				{ 
					Fomax_length=Tmax_length;
					Tmax_length=Smax_length;
					Smax_length=s[i];
				}
				else if(s[i].length()>Tmax_length.length())
				{  Fomax_length=Tmax_length;
					Tmax_length=s[i];
				}
				else if(s[i].length()>Fomax_length.length())
				{ 
					Fomax_length=s[i];;
				}
				
			}
//			for(int i=0;i<s.length;i++)
//			{
//				if(s[i].length()==Fmax_length.length())
//				{
//					
//					System.out.println(s[i]+"  ");
//				}
//				
//			}
		System.out.println(Fmax_length);
		System.out.println(Smax_length);
		System.out.println(Tmax_length);
		for(int i=0;i<s.length;i++)
			{
				if(s[i].length()==Fomax_length.length())
				{
					
					System.out.println(s[i]+"  ");
				}
				
			}
	}
@Test
public void capitalFirstLetterOfString()
	{	
	String s="my name is arshad";
		  
	 String[] s1=s.split(" ");
	 String s3=""; 
	 for(String s2:s1)
	 {
		 char ch1=Character.toUpperCase(s2.charAt(0));
		String s4=s2.substring(1);
		 s3+=ch1+s4;
//		 char s1=Character.toUpperCase(s[i].charAt(0));
//			String s2=s[i].substring(1, s[i].length());
//			System.out.print(s1+s2+" ");
//		 
	 }
	 System.out.println(s3);
	
			
		}
}
