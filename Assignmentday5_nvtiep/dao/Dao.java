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

	public int removeStatus() {
		Connection con = null;
		try {
			con = ConnectDB.getConnection();
			CallableStatement cs = con.prepareCall("{call removestatus(?)}");
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

	public List<CusOrderInfo> orderDetail(int custID) {
		Connection con = null;
		List<CusOrderInfo> list = new ArrayList<CusOrderInfo>();
		try {
			con = ConnectDB.getConnection();
			String sql = "{call printcustomer(?,?,?,?,?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, custID);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.registerOutParameter(4, java.sql.Types.INTEGER);
			cs.registerOutParameter(5, java.sql.Types.VARCHAR);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				CusOrderInfo c = new CusOrderInfo();
				c.setName(cs.getString(2));
				c.setOrderID(cs.getInt(3));
				c.setAmount(cs.getInt(4));
				c.setMaker(cs.getString(5));
				;
				list.add(c);
			}
			CusOrderInfo c = new CusOrderInfo();
			c.setName(cs.getString(2));
			c.setOrderID(cs.getInt(3));
			c.setAmount(cs.getInt(4));
			c.setMaker(cs.getString(5));
			cs.close();
			con.close();
			return list;
		} catch (SQLException e) {
			return null;
		}
	}
}
