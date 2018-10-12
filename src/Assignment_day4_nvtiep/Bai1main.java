package Assignment_day4_nvtiep;

import java.util.Scanner;
public class Bai1main implements Exponentiation  {
	static int i;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap so ");
		i=scan.nextInt();
		Bai1main m=new Bai1main();
		m.binhphuong();
		m.luythuaba();
	}
	@Override
	public void binhphuong() {
		System.out.println(i*i);
	}

	@Override
	public void luythuaba() {
		System.out.println(i*i*i);
	}
	
}
