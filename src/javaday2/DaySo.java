package javaday2;

import java.util.Scanner;

public class DaySo {
	int n;
	int[] t;

	public DaySo(int n) {
		this.n=n;
		this.t = new int[n];
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("Nhập số " + i+" ");
				t[i] = scan.nextInt();
			}
		} else
			System.out.println("n =0 ");
	}
	public void print() {
		for(int i : t)System.out.print(i+" ");
	}
   public static void main(String[] args) {
	QuickSort qs=new QuickSort(5);
	qs.nhap();
	qs.Sort();
	qs.print();
}
}
