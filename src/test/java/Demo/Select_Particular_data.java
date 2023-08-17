package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Select_Particular_data {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String expcted="king_table";
		Connection con=null;
		ResultSet result=null;
		try {
		Driver driver=new Driver();//java.sql package
		//register a database
		DriverManager.registerDriver(driver);
		//get connection for database
		con=DriverManager.getConnection("jdc:mysql://localhost:3306/king_table","root", "root");
		//create statement
		Statement state=con.createStatement();
	    result=state.executeQuery("select * from buykart;");
	    boolean flag=false;
		while(result.next())
		{
			String actual=result.getString(0);
			if(actual.equals(expcted))
			{
			   flag=true;
			}
	
		}
		if(flag==true)
		{
			System.out.println("project is created");
		}
		else
		{
			System.err.println("pjt not created");
		}
		}catch(Exception e)
		{
			
		}
		finally
		{
			con.close();
		}

	}


	}


