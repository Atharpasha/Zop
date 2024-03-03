package JavaAssignment;

public class Employee implements Comparable<Employee>{
	
	String name;
	int id;
	int sal;
	int age;
	
	
	public Employee(String name,int id,int sal,int age)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.age=age;   
	}
	
	
	public String toString()
	{
		return(name+" "+id+" "+sal+" "+age);
	}
	public int compareTo(Employee o) {
		if(sal==o.sal)
		{
		return 0;
		}
		else if(sal>o.sal)
		{
		return 1;
		}
		else
		{
		 return -1;
		}
		
	}
}
	

