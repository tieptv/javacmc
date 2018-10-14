package Assignment_day5_nvtiep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

	public static Connection getConnection(String dbURL, String userName, String password) {
		Connection con = null;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = (Connection) DriverManager.getConnection(dbURL, userName, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Unconnected!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unconnected!");
			e.printStackTrace();
		}

		

		return con;
	}

}
