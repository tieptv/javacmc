package tieptv;

import java.util.Random;
import java.util.Scanner;

public class LG4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhập dải số");
		int range=scan.nextInt();
		System.out.println("Nhập số số được chọn");
		int number=scan.nextInt();
		int[] array=new int[number];
		Random random=new Random();
		for(int i=0;i<number;i++) 
			array[i]=random.nextInt(range)+1;
		for(int a : array)System.out.println(a);
			
		
		
	}

}
