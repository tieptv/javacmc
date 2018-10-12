package tieptv;

import java.util.Scanner;

public class LG2 {
	public static void main(String[] args) {
	  Double money,remoney, rate;
	  Double amount=0.0d;
	  int year=0;
	  Scanner scan =new Scanner(System.in);
	  System.out.println("Nhập số tiền gửi hàng năm");
	  money=scan.nextDouble();
	  System.out.println("Nhập lãi suất");
	  rate=scan.nextDouble();
	  System.out.println("Nhập số tiền hưu mong muốn");
	  remoney=scan.nextDouble();
	  while(amount<=remoney) {
		  amount+=money;
		  amount+=money*rate;
		  year++;
	  }
	  System.out.println("year "+year );
	}
	public LG2() {
		
	}

}
