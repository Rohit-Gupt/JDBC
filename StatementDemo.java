package com.mydata;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StatementDemo 
{

	public static void main(String []args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ID : ");
		int id=scanner.nextInt();
		System.out.println("Enter the Name : ");
		String name=scanner.next();
		Connection con=null;
		try
		{
	
			con=MyConnection.createConnection();
//			System.out.println(con);
			PreparedStatement preparedstatement=con.prepareStatement("insert into Student value(?,?)");
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, name);
			int i=preparedstatement.executeUpdate();
			if(i>0)
				System.out.println(i+" records are inserted.....");
			else
				System.out.println("something went wrong......");
			
			System.out.println("+---+---------+");
			ResultSet resultset=preparedstatement.executeQuery("select *  from Student");
			while(resultset.next())
			{
				System.out.print("|"+resultset.getInt("id")+"|");
				System.out.println(resultset.getString("name"));
			}
			System.out.println("+---+---------+");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
