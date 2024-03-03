package Maven_Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.Replace;
import org.testng.annotations.Test;

public class ImptPrograme {

	@Test
	public void count()
	{
		String s1="athar";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
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
	public void countWith()
	{
		String s="aaabbcc";
		
	HashSet<Character> hs=new HashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		hs.add(s.charAt(i));
	}
		for(Character c:hs)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(c==s.charAt(j))
				{
					count++;
				}
			
			}
			System.out.print(c+""+count);
		}
		
	}
	
	@Test
	public void count11()
	{
		String s1="abacd";
       char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{ 
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i>j)
				{
						break;
				}
				else if(ch[i]==ch[j])
				{
					count++;
				}
				
			}
			if(count>=1)
			{
				//System.out.println(ch[i]+ ""+count);
				System.out.println(ch[i]);

			}
		
			
		}
  }
	@Test
	public void count1111()
	{
		String s1="i am from am from banglore";
      String[] ch = s1.split("");
		for(int i=0;i<ch.length;i++)
		{ 
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] )
				{
					count++;
				}
				
			}
			if(count<1)
			{
				//System.out.println(ch[i]+ ""+count);
				System.out.print(ch[i]);

			}
		
			
		}
  }
	@Test
	public void count111()
	{
		int [] a= {1,2,3,2,4};
		for(int i=0;i<a.length;i++)
		{ 
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i>j)
				{
						break;
				}
				else if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count>=1)
			{
				//System.out.println(a[i]+ ""+count);
				System.out.println(a[i]);

			}
		
			
		}
  }
	
	@Test
	public void count123()
	{
		int[] n= {1,2,3,2,4};
		
		for(int i=0;i<n.length;i++)
		{
			int count=0;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j]&&(i>j))
				{
					break;
				}
				else if(n[i]==n[j])
				{
					count++;
				}
				
			}
			
				System.out.println(n[i]);
			
		}
		//System.out.println(s2);	
  }
	@Test
	public void printpossiblesubstring()
	{
		String s="abaab";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));

			}
		}
	}	 
	@Test
	public void print2subtring()
	{
		String s="abaab";	
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String d=s.substring(i, j);
				
				if(d.length()==2)
				{
					System.out.println(s.substring(i, j));
				}
			}
		
		}
	}	
	@Test
	public void printdupsubstring()
	{
		String s="abaab";	
		ArrayList<String> ar=new ArrayList<String>();
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String d=s.substring(i, j);
				if(d.length()==2)
				{
					hs.add(d);
					ar.add(d);
				}
			}
		}
		for(String h:hs)
		{
			int count=0;
			for(int i=0;i<ar.size();i++)
			{
				if(h.equalsIgnoreCase(ar.get(i)))
				{
					count++;
					
				}
			}
			if(count>1)
			{
				System.out.println(h);
			}
		}
	}	
	@Test
	public void printwithoutdupsubstring()
	{
		String s="abaab";	
		ArrayList<String> ar=new ArrayList<String>();
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String d=s.substring(i, j);
				if(d.length()==2)
				{
					hs.add(d);
					ar.add(d);
				}
			}
		}
		for(String h:hs)
		{
			int count=0;
			for(int i=0;i<ar.size();i++)
			{
				if(h.equalsIgnoreCase(ar.get(i)))
				{
					count++;
				}
			}
			if(count<=1)
			{
				System.out.println(h);
			}
		}
	}	

	@Test
	public void assign1()
	{
		String s="i love india";
		String s1=s.replace(" ", "");
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}
		for(int i=0;i<rev.length();i++)
		{
			if(i==0||i==4)
			{
				System.out.print(rev.charAt(i)+" ");
			}
			else
			{
				System.out.print(rev.charAt(i));
			}
		}
	}	
	
	@Test
	public void assign10()
	{
		String s="my name is athar";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
			rev+=s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				rev=rev.substring(0, i)+" "+rev.substring(i, rev.length());
			}
		}
		System.out.println(rev);
	}	
	@Test
	public void assign2()
	{
		String s="aabbabbbbb";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.println(s.charAt(i)+" "+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+" "+count);
    }
	
	@Test
	public void assign3()
	{
		String s1="a3b2c1";
   
		for(int i=0;i<s1.length();i=i+2)
		{ 
			for(int j=0;j<s1.charAt(i+1)-48;j++)
			{
				System.out.print(s1.charAt(i));
			}

		}
  }
	@Test
	public void assign5()
	{
		String[] s = {"Appday", "Append","Application"};
        String s1="";
        for (int i = 0; i < s[0].length(); i++) {
            boolean flag = true;
            for (int j = 1; j < s.length; j++)
            {
                if (!(s[j].contains(s[0].charAt(i)+""))) 
                {
                    flag = false;
                    break; 
                }
            }
            if (flag) {
                s1=s1+s[0].charAt(i);
            }
        }
        System.out.println("Common letters: " + s1);
	}
	@Test
	public void assign8()
	{
		String[] s = {"dayApp", "Append","licaApption"};
        String s1="";
        for (int i = 0; i < s[0].length(); i++) {
            boolean flag = true;
            for (int j = 1; j < s.length; j++)
            {
                if (!s[j].contains(s[0].charAt(i)+"")) 
                {
                    flag = false;
                    break; 
                }
            } 
            if (flag) {
                s1+=s[0].charAt(i);
            }
        }
        System.out.println("Common characters are : " + s1);
	}
	@Test
	public void assign6()
	
	{
		 String s = "java selenium java java";
		 String[] ss=s.split(" ");
	        String s2 = "java";
	        int count=0;
	        for(int i=0;i<ss.length;i++)
	        {
	        	if(ss[i].equalsIgnoreCase(s2)) 
	        	{
	        		count++;
	        	}
	        }
	    	   System.out.println(s2+" "+count+" times in a given string");
	      
		
	}
	@Test
	public void revUsingRecur()
	
	{
		String s="malayalam";
		String ss=r(s);
		if(s.equalsIgnoreCase(ss))
		{
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its a not palindrome");
		}
	}
	public String r(String s)
	{
		if(s==null||s.length()<=1)
		{
			return s;
		}
		return r(s.substring(1))+s.charAt(0);
	}
	
	@Test
	public void ty()
	{
		
		String s="aaabbcdddf";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		for(Character h:hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(h==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(h);
			}
			else
			{
			System.out.print(h+""+count);
			}
		}
	}
	@Test
	public void largestCharacter()
	{
		
		String s="hi! am! Arun!";
		String[] ss=s.split(" ");
		
			for(int j=0;j<ss.length;j++)
			{
				for(int i=ss[j].length()-2;i>=0;i--)
				{
					
					System.out.print(ss[j].charAt(i));
				}
				
				System.out.print(s.charAt(ss[j].length()) );
			}
	}
	@Test
	public void midlleOfstring()
	{
		String[] s= {"athar","tester","tyss","work"};
		int midlen=s.length/2;
		
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
			ar.add(s[i]);
		}
	  ar.add(midlen,"king");
	  Object[] o=ar.toArray();
	  System.out.println(Arrays.toString(o));
	}
	@Test
	public void inter()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" java ");
			}
			else if(i%3==0)
			{
				System.out.print(i+" selenium ");
			}
			else
			{
				System.out.print(i+" webdriver ");
			}
		}
	}
	
	@Test
	public void inter12()
	{
		String s="abAcBDYyzZ";
		char max='A';
		for(int i=0;i<s.length();i++)
		{
			String value=((char)((s.charAt(i))-32))+"";
			if(s.contains(value))
			{
				if((char)(s.charAt(i)-32)>max)
				{
					max=(char)(s.charAt(i)-32);
				}
			}
		}
		System.out.println(max);
		
	}
	
	@Test
	public void rem()
	{
		String s="aabccd";
		
		
		ArrayList<Character> ch=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			ch.add(s.charAt(i));
		}
		
	for(int i=0;i<ch.size();i++)
	{
int count=0;
for(int j=0;j<ch.size();j++)
{
	if(ch.get(i)==s.charAt(j)&& i>j)
	{
		break;
	}
	else if(ch.get(i)==s.charAt(j))
	{
		count++;
	}
}
if(count>1)
{
	System.out.println(ch.get(i));
	}
	}	
	}
	
	
	@Test
	public void shifting()
	{
		int[] a= {1,2,3,4};
		int n=3;
	 for(int i=1;i<=n;i++)
	 {
		int temp=a[0];
		
		for(int j=1;j<a.length;j++)
		{
			a[j-1]=a[j];
		}
		a[a.length-1]=temp;
		
   	}
	System.out.println(Arrays.toString(a));
	}
	
	
	@Test
	public void anagram()
	{
		String s1="race";
		String s2="cate";
		
		char[] c1=s1.toCharArray();
		char[] c2=s1.toCharArray();
		
	if(c1.length==c2.length)
	{
		for(int i=0;i<c1.length;i++)
		{
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]>c1[j])
				{
					char ch=c1[i];
					c1[i]=c1[j];
					c1[j]=ch;
					
				}
			}
			
		}
		
		for(int i=0;i<c2.length;i++)
		{
			for(int j=i+1;j<c2.length;j++)
			{
				if(c2[i]>c2[j])
				{
					char ch=c2[i];
					c2[i]=c2[j];
					c2[j]=ch;
					
				}
			}
		}			
		boolean flag = Arrays.equals(c1, c2);
		if(flag==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not Anagram");
		}
				
		
	}
	else
	{
		System.out.println("Not Anagram");
	}
}
	@Test
	public void rev()
	{
		String s="aabbacddb";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else 
			{
				System.out.println(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+""+count);
	}
	
	@Test
	public void shift()
	{
		int[] a= {1,2,3,4};
		
	//n=2  2 3 4 1 
	//n=3 3 4 1 2 
	//n=4 4 1 2 3	
		int n=5;
	for(int k=0;k<n;k++)
	{
		int temp=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		
	
	}
	System.out.println(Arrays.toString(a));
	}
	
	@Test
	public void mis()
	{
		String s= "ABCDEFGHI";
		
		for(int i=0;i<s.length()/2;i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				System.out.print(Character.toLowerCase(s.charAt(i))+"");
			}
		}
		for(int i=s.length()-1;i>=s.length()/2;i--)
		{
			System.out.print(s.charAt(i)+"");
		}
			
	}
	
	@Test
	public void mi()
	{
		String[] s= {"ABCDEFGHI"};
		for(int k=0;k<s.length;k++)
		{
			for(int i=0;i<s[k].length()/2;i++)
			{
				if(Character.isUpperCase(s[k].charAt(i)))
				{
					System.out.print(Character.toLowerCase(s[k].charAt(i))+"");
				}
			}
			for(int i=s[k].length()-1;i>=s[k].length()/2;i--)
			{
				System.out.print(s[k].charAt(i)+"");
			}
		}	
	}
	
	@Test
	public void m()
	{
		String[] s= {"ABCDEFGHI"};
		for(int k=0;k<s.length;k++)
		{
			for(int i=0;i<s[k].length()/2;i++)
			{
				char ch=s[k].charAt(i);
				int n=(int)ch;
				int sum=n+32;
				char c=(char)sum;
				System.out.print(c);
				
			}
			for(int i=s[k].length()-1;i>=s[k].length()/2;i--)
			{
				System.out.print(s[k].charAt(i)+"");
			}
		}	
	}
	@Test
	public void miy()
	{
		int n= 1234;
		int Evencount=0;
		int oddcount=0;
		while(n!=0)
		{
			int rem=n%10;
			
			if(rem%2==0)
			{
			  Evencount++;	
			}
			else
			{
				oddcount++;
			}
			
			n=n/10;
		}
		System.out.println(Evencount);
		System.out.println(oddcount);
		
	}
	
	@Test
	public void miyz()
	{
		String s="i am selenium";
		String rev="";
     String s1=s.replace(" ","");
     for(int i=s1.length()-1;i>=0;i--)
     {
    	 rev+=s1.charAt(i);
     }
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				rev=rev.substring(0,i)+" "+rev.substring(i,rev.length());
			}
		}
		System.out.println(rev);
	}
@Test
public void rec()
{
	int a=1;
	re(a);
	
}
@Test
public void re(int a)
{
	
	if(a<=10)
	{
		System.out.println(a);
		re(a+1);
	}
	
	
}

@Test
public void t()
{
	String s= "1,09,00,23";
	
	String[] s1=s.split(",");
	int Largest=Integer.parseInt(s1[0]);
	for (int i = 1; i < s1.length; i++) {
		
	int n=Integer.parseInt(s1[i]);	
	
	if(Largest<n)
	{
		Largest=n;
	}
	
	}	
	System.out.println(Largest);
}

@Test
public void tt()
{
	String[] s= {"arshad","ayyub","athar"};
	
	int vowels=0;
	int consonent=0;
	
	for(int i=0;i<s.length;i++)
	{
		String s2=s[i];
		for(int j=0;j<s2.length();j++)
		{
			if(s[i].charAt(j)=='a' || s[i].charAt(j)=='e'||s[i].charAt(j)=='i'||s[i].charAt(j)=='o'||s[i].charAt(j)=='u')
			{
				vowels++;
			}
			else
			{
				consonent++;
			}
		}
		
	}
	System.out.println(vowels);
	System.out.println(consonent);
}


@Test
public void ttt()
{
	
	int a=12233445;
	String s2=String.valueOf(a);
			
	for(int j=0;j<s2.length();j++)
	{
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(j)==s2.charAt(i)&&(j>i))
			{
				break;
			}
			else if(s2.charAt(j)==s2.charAt(i))
			{
				count++;
			}

		}
		if(count>1)
		System.out.println(s2.charAt(j)+" "+count);
		
	}
	
}
@Test
public void e()
{
	
int[] a= {0,1,3,2,0};

int m=0;
int n=a.length-1;
for(int i=0;i<a.length;i++)
{
	if(a[i]==0)
	{
		a[n]=a[i];
		n--;
	}
	else
	{
		a[m]=a[i];
		m++;
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}

}
 } 
