package business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BestMaker;
import dao.CusOrder;
import dao.CusOrderInfo;
import dao.Dao;

public class Bus {
	public List<CusOrder> getAllCustOrder() {
		List<CusOrder> list = new ArrayList<CusOrder>();
		Dao dao = new Dao();
		String query = "select name,amount from customer inner join "
				+ "car_order on customer.customerid=car_order.customerid " + "group by name,amount order by amount asc";
		list = dao.listCustomer(query);
		return list;
	}

	public List<BestMaker> getAllBestMaker() {
		List<BestMaker> list = new ArrayList<BestMaker>();
		Dao dao = new Dao();
		String query = " select * from  maxmaker()";
		list = dao.listMaker(query);
		return list;
	}
	public void showInfo( int id) {
		CusOrderInfo cus=null ;
		Dao dao = new Dao();
	//	cus = dao.orderDetail(id);
	}
	public void showCustOrder(List<CusOrder> list) {
		System.out.println("Name\tAmount");
		for (CusOrder c : list) {
			System.out.print(c.getName() + "\t");
			System.out.println(c.getAmount());
		}
	}

	public void showBestMaker(List<BestMaker> list) {
		System.out.println("Maker\tAmount");
		for (BestMaker b : list) {
			System.out.print(b.getName() + "\t");
			System.out.println(b.getAmount());
		}
	}

}
