package lab;
import java.sql.*;
public class Experiment1
{
	static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/";
	
	static final String USER="Angelina";
	static final String PASSWORD="1234";

	public static void main(String[] args)
	{
		Connection connect=null;
		Statement statement=null;
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database.....");
			
			connect=DriverManager.getConnection(DB_URL,USER,PASSWORD);
			
			statement=connect.createStatement();
			
			String sql="Create Database Angelina";
			
			boolean result=statement.execute(sql);
			System.out.println(result);
			
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			try
			{
				if(statement!=null)
				{
					statement.close();
				}
				if(connect!=null)
				{
					connect.close();
				}
			}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		}
			
	}
}
