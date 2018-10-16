package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;

public class Dao {
	private static Dao _instance;

	/**
	 * tieptv 9:26:59 AM
	 * Trả về 1 đối tượng static Dao
	 */
	public static Dao instance() {
		if (_instance == null)
			_instance = new Dao();
		return _instance;
	}

	public List<CusOrder> listCustomer(String sql) {
		Connection con = null;
		List<CusOrder> list = new ArrayList<CusOrder>();
		try {
			con = ConnectDB.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				CusOrder num = new CusOrder();
				num.setName(rs.getString(1));
				num.setAmount(rs.getInt(2));
				list.add(num);
			}
			rs.close();
			statement.close();
			con.close();
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}

	}

	/**
	 * 
	 * tieptv 9:28:13 AM
	 * Trả về danh sách hãng xe bán được nhiều nhất
	 */
	public List<BestMaker> listMaker(String sql) {
		Connection con = null;
		List<BestMaker> list = new ArrayList<BestMaker>();
		try {
			con = ConnectDB.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				BestMaker num = new BestMaker();
				num.setName(rs.getString(1));
				num.setAmount(rs.getInt(2));
				list.add(num);
			}
			rs.close();
			statement.close();
			con.close();
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}

	}

	/**
	 * 
	 * tieptv 9:29:30 AM
	 * Trả về số đơn hàng đã bị xóa khi status =2
	 */
	public int removeStatus() {
		Connection con = null;
		try {
			con = ConnectDB.getConnection();
			String sql = "{call removestatus(?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.registerOutParameter(1, java.sql.Types.INTEGER);
			cs.execute();
			int number = cs.getInt(1);
			cs.close();
			con.close();
			return number;
		} catch (SQLException e) {
			return -1;
		}
	}

	/**
	 * 
	 * tieptv 9:31:10 AM
	 * Trả về sách đơn đặt hàng theo id khách hàng
	 */
	public List<CusOrderInfo> CustOrderID(int custID) {
		Connection con = null;
		List<CusOrderInfo> list = new ArrayList<CusOrderInfo>();
		try {
			con = ConnectDB.getConnection();
			String sql = "{call printcustomer(?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, custID);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				CusOrderInfo c = new CusOrderInfo();
				c.setName(rs.getString(1));
				c.setOrderID(rs.getInt(2));
				c.setAmount(rs.getInt(3));
				c.setMaker(rs.getString(4));
				list.add(c);
			}
			rs.close();
			cs.close();
			con.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
