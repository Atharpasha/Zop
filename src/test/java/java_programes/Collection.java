package java_programes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Collection {
	
	@Test
	public void collectionTest()
	{
	ArrayList<Object> al = new ArrayList<Object>();
		al.add("king");
		al.add("athar");
		al.add("123");
		al.add("ty");
		
		System.out.println(al.toString()+ "  ");
		
	}
	@Test
	public void collection1Test()
	{
	LinkedList<Object> al = new LinkedList<Object>();
		al.add("king");
		al.add("athar");
		al.add("123");
		al.add("ty");
		
		System.out.println(al.toString()+ "  ");
		
	}
	@Test
	public void collection2Test()
	{
	LinkedHashSet<Object> al = new LinkedHashSet<Object>();
		al.add("king");
		al.add("athar");
		al.add("123");
		al.add("ty");
		al.add(null);
		System.out.println(al.toString()+ "  ");
		System.out.println(al.size());
		
	}
	@Test
	public void collection3Test()
	{
	LinkedHashSet<Object> al = new LinkedHashSet<Object>();
		al.add("king");
		al.add("athar");
		al.add("123");
		al.add("ty");
		al.add(null);
		System.out.println(al.toString()+ "  ");
		System.out.println(al.size());
		
	}
	@Test
	public void collection4Test()
	{
	 TreeSet<Object> al = new TreeSet<Object>();
		al.add("king");
		al.add("athar");
		al.add("123");
		al.add("ty");
		al.add(null);
		System.out.println(al.toString()+ "  ");
		System.out.println(al.size());
		
	}
	


}
