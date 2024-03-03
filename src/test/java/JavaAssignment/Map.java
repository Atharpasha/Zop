package JavaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Map {
   @Test
	public void r()
	{
	HashMap<String, Employee> mp=new HashMap<String, Employee>();
	mp.put("athar",new Employee("athar",01,3000,20));
	mp.put("pasha",new Employee("pasha",02,4000,30));
	mp.put("king",new Employee("king",03,1000,40));
	mp.put("khan",new Employee("khan",04,2000,50));
	
	System.out.println(mp);

	ArrayList<Employee> ar=new ArrayList<Employee>(mp.values());
	Collections.sort(ar);
	
	System.out.println(ar);
	}
   
   @Test
  	public void rr()
  	{
  	HashMap<String, Employee> mp=new HashMap<String, Employee>();
  	mp.put("athar",new Employee("athar",01,3000,20));
  	mp.put("pasha",new Employee("pasha",02,4000,30));
  	mp.put("king",new Employee("king",03,1000,40));
  	mp.put("khan",new Employee("khan",04,2000,50));
  	System.out.println(mp);
  	ArrayList<Employee> ar=new ArrayList<Employee>(mp.values());
  	Collections.sort(ar,Collections.reverseOrder());
  	
  	System.out.println(ar);
  	}
	
}
