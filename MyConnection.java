package com.mydata;
import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection 
{
	public static Connection createConnection()
	{
		Connection con= null;
		try
		{
			Class c = Class.forName(DatabaseDetails.DATABASE_DRIVER);
			con = DriverManager.getConnection(DatabaseDetails.DATABASE_URL,DatabaseDetails.DATABASE_USER,DatabaseDetails.DATABASE_PASS);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return con;
	}

}
