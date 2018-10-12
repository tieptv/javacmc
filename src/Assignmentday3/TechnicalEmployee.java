package Assignmentday3;

public class TechnicalEmployee extends Employee {
protected int checkin;

public int getCheckin() {
	return checkin;
}
public void setCheckin(int checkin) {
	this.checkin = checkin;
}
public TechnicalEmployee(String name) {
	super(name,75000d);
}
@Override
	public String employeeStatus() {
	   return id+" "+name+" has "+checkin +"successful check ins";
	}
}
