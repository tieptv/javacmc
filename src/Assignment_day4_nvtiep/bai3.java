package Assignment_day4_nvtiep;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int n;
		int[] mang;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so phan tu");
		n = scan.nextInt();
		mang = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("nhap so thu "+i+1);
			mang[i]=scan.nextInt();
		}
		int max = 0, min = mang[0];
		for (int i = 0; i < n; i++)
			if (mang[i] >= max)
				max = mang[i];
			else if (mang[i] <= min)
				min = mang[i];
		float mid=(float)(max+min)/2;
		long binhphuongmax = 0, binhphuongmin = 0;
		for (int i = 0; i < n; i++) {
			if(mang[i]<=mid)binhphuongmin+=Math.pow(mang[i], 2);
			else binhphuongmax+=Math.pow(mang[i],2);
		}
		System.out.println("binh phuong max "+binhphuongmax);
		System.out.println("binh phuong min "+binhphuongmin);
	}
}
