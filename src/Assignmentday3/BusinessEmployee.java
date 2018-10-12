package Assignmentday3;

public class BusinessEmployee extends Employee {
protected Double bonusbudget;

public Double getBonusbudget() {
	return bonusbudget;
}
public void setBonusbudget(Double bonusbudget) {
	this.bonusbudget = bonusbudget;
}
public BusinessEmployee(String name) {
	super(name, 50000d);
}
public double getBonusBudget() {
	return 0;
	}
 @Override
	public String employeeStatus() {
		
		return id+" "+name+" with a budget of "+bonusbudget;
	}
}
