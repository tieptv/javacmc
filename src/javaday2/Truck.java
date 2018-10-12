package javaday2;

public class Truck extends Car {
    private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	Double getSalePrice() {
		Double sale_price;
		if(weight>2000) sale_price=getRegularPrice()*0.9;
		else sale_price=getRegularPrice()*0.8;
		return sale_price;
	}
 
}
