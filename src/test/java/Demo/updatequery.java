package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class updatequery {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		Connection con=null;
		int result=0;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
	    con = DriverManager.getConnection("", "root", "root");
		Statement state=con.createStatement();
		result=state.executeUpdate("insert into buykart values (1,'king','minister');");
		}catch(Exception e)
		{
			
		}
		finally {
		if(result>0)
		{
			System.out.println("data has been upadted");
		}
		else
		{
			System.err.println("data has not been updated");
		}
		con.close();
		}

	}

}
