package com.online_shopping_generic_library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {


	Connection connect=null;
	/**
	 * @author Athar
	 * @throws SQLException
	 */
	public void connectToDataase() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		connect=DriverManager.getConnection(IPathConstants.dUrl, IPathConstants.dbUsername, IPathConstants.dbPassword);
	}
	/**
	 * 		
	 * @param query
	 * @param columnNo
	 * @param Expected
	 * @return
	 * @throws SQLException
	 */
	public String executeAndGetdata(String query,int columnNo,String Expected) throws SQLException
	{
		ResultSet result=connect.createStatement().executeQuery(query);
		boolean Flag=false;
		while(result.next())
		{
			
			String actual=result.getString(columnNo);
			if(actual.equalsIgnoreCase(Expected))
			{
				Flag=true;
				break;

			}
		}
		if(Flag==true)
		{
			System.out.println("Data is present"); 
			//return to validate for user reference
			return Expected;
		}
		else
		{
			System.out.println("data is not present");
		}
		return "";
	}
	/**
	 * @author Athar
	 * @throws SQLException
	 */
	public void closeDb() throws SQLException
	{
		connect.close();
	}


}
