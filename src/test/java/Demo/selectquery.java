package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectquery {

	public static void main(String[] args) throws SQLException {
		//in select we have to select 
		//non select only get count
		// TODO Auto-generated method stub
		Connection con=null;
		ResultSet result=null;
		try {
		Driver driver=new Driver();//java.sql package
		//register a database
		DriverManager.registerDriver(driver);
		//get connection for database
		con=DriverManager.getConnection("","root", "root");
		//create statement
		Statement state=con.createStatement();
	    result=state.executeQuery("select * from buykart;");
	    //result=state.executeQuery("select * from buykart where id=101;");
	   // System.out.println(result.getString("column_name"));
	    //or
		while(result.next())
		{
		System.out.println(result.getString(0)+" "+result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
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
