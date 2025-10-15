package lab;
import java.sql.*;
public class Table
{

	static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/Angelina";
	
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
			String sql = "INSERT INTO user values"
                    + "(2,'Athul','George',23),"
                    +"(3,'Anil','Pate',21),"
                    +"(1,'Ram','Naik',20)";
			
			int i =statement.executeUpdate(sql);
			System.out.println("Table Create ,"+"Value of i="+i);
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
