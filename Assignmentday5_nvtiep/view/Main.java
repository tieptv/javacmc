package view;

import java.util.List;
import java.util.Scanner;

import business.Bus;
import dao.BestMaker;
import dao.CusOrder;
import dao.CusOrderInfo;

public class Main {

	public static void main(String[] args) {
		boolean t = true;
		int select;
		Bus bus = new Bus();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("------Menu-------");
			System.out.println("Mời bạn chọn từ 1-6");
			System.out.println("1.Danh sách khách hàng mua xe");
			System.out.println("2.Hãng xe bán được nhiều xe nhất");
			System.out.println("3.Xóa nhứng đơn đặt hàng đã bị hủy từ những năm trước");
			System.out.println("4.Tìm kiếm khách hàng đã đặt hàng ");
			System.out.println("Các phím bất kì:Thoát chương trình");
			select = scan.nextInt();
			switch (select) {
			case 1: {
				List<CusOrder> list = bus.getAllCustOrder();
				bus.showCustOrder(list);
				break;
			}
			case 2: {
				List<BestMaker> list = bus.getAllBestMaker();
				bus.showBestMaker(list);
				break;
			}
			case 3: {
				bus.showNumberCancel();
				break;
			}
			case 4: {
				System.out.println("Nhập ID khách hàng");
				int number = scan.nextInt();
				List<CusOrderInfo> list = bus.getCusOrderID(number);
				bus.showInfoID(list);
				break;
			}
			case 5:
			default:
				t = false;
				break;
			}
		} while (t);
	}

}
