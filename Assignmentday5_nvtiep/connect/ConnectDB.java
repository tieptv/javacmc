package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;" + "databaseName=CMC_FINAL;"
			+ "integratedSecurity=true";
	private static String USER_NAME = "sa";
	private static String PASSWORD = "123";
	private static Connection con = null;
	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = (Connection) DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			
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
