package JavaAssignment;

import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main (String[]args)
	{
		Map<A,Integer> h=new HashMap<A,Integer>();
		
		h.put(new A("athar",1),1);
		h.put(new A("pasha",1),2);
		System.out.println(h);
	}

}
