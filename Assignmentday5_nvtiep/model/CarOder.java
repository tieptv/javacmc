package model;

public class CarOder {
private int orderID;
private int custID;
private String carID;
private int amount;
private float salePrice;
private String orderDate;
private String deliveryDate;
private String deliveryAddress;
private String status;
private String note;
public int getOrderID() {
	return orderID;
}
public void setOrderID(int orderID) {
	this.orderID = orderID;
}
public int getCustID() {
	return custID;
}
public void setCustID(int custID) {
	this.custID = custID;
}
public String getCarID() {
	return carID;
}
public void setCarID(String carID) {
	this.carID = carID;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public float getSalePrice() {
	return salePrice;
}
public void setSalePrice(float salePrice) {
	this.salePrice = salePrice;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(String deliveryDate) {
	this.deliveryDate = deliveryDate;
}
public String getDeliveryAddress() {
	return deliveryAddress;
}
public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}

}
