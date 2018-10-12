package javaday2;

import java.util.ArrayList;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<Car>();
		Sedan seadan = new Sedan();
		seadan.setColor("black");
		seadan.setLength(20);
		seadan.setSpeed(10);
		seadan.setRegularPrice(100d);

		Ford ford1 = new Ford();
		ford1.setColor("red");
		ford1.setManufacturerDiscount(10);
		ford1.setRegularPrice(100d);
		ford1.setYear(2018);
		ford1.setSpeed(20);

		Ford ford2 = new Ford();
		ford2.setColor("pink");
		ford2.setManufacturerDiscount(10);
		ford2.setRegularPrice(200d);
		ford2.setYear(2019);
		ford2.setSpeed(30);
		
		Car car=new Car();
		car.setColor("black");
		car.setRegularPrice(100d);
		car.setSpeed(10);

		list.add(seadan);
		list.add(ford1);
		list.add(ford2);
		list.add(car);
		
		for(Car c : list)System.out.println("gia xe  "+c.getSalePrice());
	}

}
