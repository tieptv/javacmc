package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean t=true;
		int select;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("------Menu-------");	
			System.out.println("Mời bạn chọn từ 1-5");	
			System.out.println("1.Danh sách khách hàng mua xe");	
			System.out.println("2.Hãng xe bán được nhiều xe nhất");	
			System.out.println("3.Xóa nhứng đơn đặt hàng đã bị hủy từ những năm trước");	
			System.out.println("4.Tìm kiếm đơn đặt hàng theo id khách hàng");	
			System.out.println("5.Thoát chương trình");	
			select=scan.nextInt();
			switch(select) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: t=false ;break;
		    default :break;
			}	
		}
		while(t);
	}

}
