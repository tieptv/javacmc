package Assignment_day5_nvtiep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

 

	public static Connection getConnection(String dbURL, String userName, 
            String password)  {
	    Connection con =null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = (Connection) DriverManager.getConnection(dbURL,userName,password);
            System.out.println("connect successfully!");
		} catch (SQLException e) {
			System.out.println("Unconnected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Not drive");
		}
		return con;
	}
	
}