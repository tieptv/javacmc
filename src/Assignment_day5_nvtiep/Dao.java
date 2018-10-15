package Assignment_day5_nvtiep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;" + "databaseName=CMC_FINAL;"
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
			String query = "select name,amount from customer inner join car_order on customer.customerid=car_order.customerid group by name,amount order by amount asc";
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
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
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

	public static void RemoveStatus() {
		con = connection.getConnection(DB_URL, USER_NAME, PASSWORD);
		try {
			CallableStatement cs = con.prepareCall("{call removestatus(?)}");
			cs.registerOutParameter(1, java.sql.Types.INTEGER);
			cs.execute();
			int number = cs.getInt(1);
			System.out.println("So hang bi xoa: " + number);
			cs.close();

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

	public static void printinfomation(int id) {
		con = connection.getConnection(DB_URL, USER_NAME, PASSWORD);
		try {
			CallableStatement cs = con.prepareCall("{call printcustomer(?,?,?,?,?)}");
			cs.setInt(1, id);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.registerOutParameter(4, java.sql.Types.INTEGER);
			cs.registerOutParameter(5, java.sql.Types.VARCHAR);
			cs.execute();
			String name = cs.getString(2);
			int orderid = cs.getInt(3);
			int amount = cs.getInt(4);
			String maker = cs.getString(5);
			System.out.print(name + "\t" + orderid + "\t" + amount + "\t" + maker);
			cs.close();

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

	public static void Insert(Car c) {
		con = connection.getConnection(DB_URL, USER_NAME, PASSWORD);
		String query = "insert into car values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, c.getId());
			ps.setString(2, c.getMaker());
			ps.setString(3, c.getModel());
			ps.setInt(4, c.getYear());
			ps.setString(5, c.getColor());
			ps.setString(6, c.getNote());
			ps.executeUpdate();
			System.out.println("Insert Successfully!");
			ps.close();
		} catch (SQLException e) {
			System.out.println("Insert Unsuccessfully!");
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
