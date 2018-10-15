package Assignment_day5_nvtiep;

import java.util.Scanner;
public class main {
	
public static void main(String[] args) {
	//Dao.ListAllCar();
	System.out.println("---cau b---");
	Dao.showInfo();
	System.out.println("---cau c---");
	Dao.MaxMaker();
	System.out.println("---cau d---");
	Dao.RemoveStatus();
	System.out.println("---cau e---");
	Dao.printinfomation(5);
	/*
	Car c=new Car();
	Scanner scan=new Scanner(System.in);
	System.out.println("Thêm xe");
    System.out.println("Nhập id");
    c.setId(scan.nextLine());
    System.out.println("Nhập maker");
    c.setMaker(scan.nextLine());
    System.out.println("Nhập model");
    c.setModel(scan.nextLine());
    System.out.println("Nhập year");
    c.setYear(scan.nextInt());
    scan.nextLine();
    System.out.println("Nhập color");
    c.setColor(scan.nextLine());
    System.out.println("Nhập note");
    c.setNote(scan.nextLine());
    
    Dao.Insert(c);
    */
	//Dao.ListAllCar();
}
}
