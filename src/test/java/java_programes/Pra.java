package java_programes;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Pra {

	@Test
	public void a()
	{

    String s="aaabbcdddf";
    Set<Character> set=new HashSet<Character>();
    for(int i=0;i<s.length();i++)
    {
    	set.add(s.charAt(i));
    }
    String w="";
    for(Character d:set)
    {  int count=0;
   
    	for(int i=0;i<s.length();i++)
    	{
    		if(d==s.charAt(i))
    		{
    			count++;
    		}
    		
    	}
    	w=w+d+count;
    	//System.out.println(w);
    	//System.out.println(d);
	}
    System.out.println(w);
	}
}
