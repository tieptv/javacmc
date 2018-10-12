package tieptv;

import java.util.Scanner;

public class LG3 {
public static void main(String[] args) {
	int range_number;
	int pick_number;
	Scanner scan=new Scanner(System.in);
	System.out.println("Nhập dải số");
	range_number=scan.nextInt();
	System.out.println("Nhập số số được chọn");
	pick_number=scan.nextInt();
	long numerator=1,
	denominator=1;
	for(int i=range_number;i>=range_number-pick_number+1;i--)numerator*=i;
	//System.out.println(numerator);
	for(int i=1;i<=pick_number;i++)denominator*=i;
	System.out.println("Xác xuất trúng "+(double)denominator/numerator);
	
   }
}