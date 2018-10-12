package Assignment_day5_nvtiep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;" + "databaseName=tieptv;"
			+ "integratedSecurity=true";
	private static String USER_NAME = "sa";
	private static String PASSWORD = "123";
	private static Connection con = null;

	public static void Insert() {

	}

	public static void ListAllCar() {
		con = connection.getConnection(DB_URL, USER_NAME, PASSWORD);
		try {
			Statement st = con.createStatement();
			String query = "select * from car";
			ResultSet rs = st.executeQuery(query);
			System.out.println("CarID\tMaker\tModel\tYear\tColor\tNote");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " \t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6));
			}
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void showInfo() {
		con = connection.getConnection(DB_URL, USER_NAME, PASSWORD);
		try {
			Statement st = con.createStatement();
			String query = "select name,amount from customer inner join car_order on customer.customerid=car_order.customerid";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Name\tAmount");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " \t" + rs.getInt(2));
			}
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void MaxMaker() {
		con = connection.getConnection(DB_URL, USER_NAME, PASSWORD);
		try {
			String query = " select * from  maxmaker()";

			Statement cstm = con.createStatement();
			ResultSet rs = cstm.executeQuery(query);
			System.out.println("Maker\tAmout");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t");
			}
			cstm.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
