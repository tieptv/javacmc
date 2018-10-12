package javaday2;
/**
 * 
 * @author User
 *
 */
public class Ford extends Car {
	private int year;
	private int manufacturerDiscount;
	
	Double getSalePrice() {
		return getRegularPrice()*(100-manufacturerDiscount)/100d;
			
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}
	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

}
