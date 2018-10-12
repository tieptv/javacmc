package Assignment_day4_nvtiep;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap so");
		number=scan.nextInt();
		System.out.println("Giai thua cua "+number+": "+Giaithua(number));
	}
static Long Giaithua (int a) {
	Long tich=1l;
	if(a==1)return 1l;
	if(a<1)return 0l;
	for(int i=1;i<=a;i++)tich*=i;
	return tich;
  }
}
