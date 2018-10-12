package javaday2;

public class Sedan extends Car {
   private int length;
	Double getSalePrice() {
		if(length>20)return getRegularPrice()*0.95d;
		else return getRegularPrice()*0.9d;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
