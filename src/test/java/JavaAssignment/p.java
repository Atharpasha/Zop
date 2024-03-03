package JavaAssignment;

import java.util.ArrayList;
import java.util.TreeSet;

public class p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(1);
		set.add(1);
		set.add(2);
		
		ArrayList<Integer> a=new ArrayList<Integer>(set);
		
		System.out.println(a.get(a.size()-1));
	}

}
