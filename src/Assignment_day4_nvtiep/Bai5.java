package Assignment_day4_nvtiep;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
public static void main(String[] args) {
	String xau;
	System.out.println("NNhap chuoi ");
	Scanner scan =new Scanner(System.in);
	try {
	 StringTokenizer st = new StringTokenizer(scan.nextLine()," -");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
	}
	catch(NumberFormatException e) {
		System.out.println("loi");
	}
}
}
