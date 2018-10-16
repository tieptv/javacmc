package business;

import java.util.ArrayList;
import java.util.List;

import dao.BestMaker;
import dao.CusOrder;
import dao.CusOrderInfo;
import dao.Dao;

public class Bus {
	/**
	 * tieptv 9:16:49 AM
	 * @return List<CusOrder> Trả về danh sách các khách hàng đặt hàng
	 */
	public List<CusOrder> getAllCustOrder() {
		List<CusOrder> list = new ArrayList<CusOrder>();
		String query = "select name,amount from customer inner join "
				+ "car_order on customer.customerid=car_order.customerid " + "group by name,amount order by amount asc";
		list = Dao.instance().listCustomer(query);
		return list;
	}

	/**
	 * tieptv 9:17:48 AM
	 * @return List<BestMaker> Trả về danh sách hãng xe bán được xe nhiều nhát
	 */
	public List<BestMaker> getAllBestMaker() {
		List<BestMaker> list = new ArrayList<BestMaker>();
		String query = " select * from  maxmaker()";
		list = Dao.instance().listMaker(query);
		return list;
	}

	/**
	 * tieptv 9:18:22 AM
	 * @param id: Thám số đầu vào id khách hàng
	 * @return List<CusOrderInfo> Trả về danh sách đơn dặt hàng của khách hàng theo
	 */
	public List<CusOrderInfo> getCusOrderID(int id) {
		List<CusOrderInfo> list = new ArrayList<CusOrderInfo>();
		list = Dao.instance().CustOrderID(id);
		return list;
	}

	/**
	 * tieptv 9:19:32 AM
	 * @param list: danh sách CusOrderInfo
	 * In ra danh sách đơn đặt hàng của 1 khách hàng
	 */
	public void showInfoID(List<CusOrderInfo> list) {
		System.out.println("Name\tAmount\tOrderID\tMaker");
		if (list.size() > 0)
			for (CusOrderInfo c : list) {
				System.out.print(c.getName() + "\t");
				System.out.print(c.getAmount() + "\t");
				System.out.print(c.getOrderID() + "\t");
				System.out.println(c.getMaker());
			}
	}

	/**
	 * tieptv 9:20:38 AM
	 * @param list:danh sách CusOrder
     * In ra danh sách khách hàng mua xe
	 */
	public void showCustOrder(List<CusOrder> list) {
		System.out.println("Danh sách khách hàng");
		System.out.println("Name\tAmount");
		if (list.size() > 0)
			for (CusOrder c : list) {
				System.out.print(c.getName() + "\t");
				System.out.println(c.getAmount());
			}
	}
	/**
	 * tieptv 9:20:38 AM
	 * @param list:danh sách BestMaker
     * In ra danh sách hãng xe bán được nhiều nhất trong năm nay
	 */
	public void showBestMaker(List<BestMaker> list) {
		System.out.println("Hãng xe bán được nhiều nhất");
		System.out.println("Maker\tAmount");
		if (list.size() > 0)
			for (BestMaker b : list) {
				System.out.print(b.getName() + "\t");
				System.out.println(b.getAmount());
			}
	}
	/**
	 * tieptv 9:20:38 AM
     * In ra danh sách đơn đặt hàng bị hủy từ những năm trước
	 */
	public void showNumberCancel() {
		int number = Dao.instance().removeStatus();
		if (number >= 0)
			System.out.println("Số đơn đặt hàng bị hủy từ những năm trước: " + number);

	}

}
