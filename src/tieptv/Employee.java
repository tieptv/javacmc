package tieptv;

public class Employee {
private String name;
private int hireday;
private double salary;

public Employee() {

}
public Employee(String name, int hireday, double salary) {
	super();
	this.name = name;
	this.hireday = hireday;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHireday() {
	return hireday;
}
public void setHireday(int hireday) {
	this.hireday = hireday;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void raiseSalary(int number)
{
	Double t=number/100d;
	salary+=salary*t;
}


}
