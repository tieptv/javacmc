package Assignment_day4_nvtiep;

import java.util.ArrayList;

public class Bai4 {
	private String number;
	private String name;

	public Bai4(String name, String number) {
		super();
		this.number = number;
		this.name = name;
	}

	public static void main(String[] args) {
		ArrayList<Bai4> list = new ArrayList<Bai4>();
		list.add(new Bai4("Joy", "34543"));
		list.add(new Bai4("Jack", "56765"));
		list.add(new Bai4("Tina", "34576"));
		System.out.println("cau 1 " + checkso(list, "3443"));
		System.out.println("cau 2 " + checkmautin(list, "Jack"));
		System.out.println("cau 3 ");
		show(list, "Tina");
		System.out.println("cau 4 ");
		 delete(list,"Joy");
		System.out.println("cau 5 ");
		showAll(list);
	}

	public static boolean checkso(ArrayList<Bai4> list, String number) {
		for (Bai4 b : list)
			if (b.number.equals(number))
				return true;
		return false;
	}

	public static boolean checkmautin(ArrayList<Bai4> list, String name) {
		for (Bai4 b : list)
			if (b.name.equals(name))
				return true;
		return false;
	}

	public static void show(ArrayList<Bai4> list, String name) {
		for (Bai4 b : list)
			if (b.name.equals(name))
				System.out.println(name + " " + b.number);
		System.out.println("Khong co so ");
	}

	public static void delete(ArrayList<Bai4> list, String name) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).name.equals(name)) 
				list.get(i).number="";
	}

	

	public static void showAll(ArrayList<Bai4> list) {
		int len = list.size();
		for (int i = 0; i < len; i++)
			System.out.println(list.get(i).name + "\t" + list.get(i).number);
	}
}
