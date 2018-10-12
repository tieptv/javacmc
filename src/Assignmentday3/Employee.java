package Assignmentday3;

public class Employee {
	
	protected int id;
	protected String name;
	protected Double basesalary;

	public Employee(String name, Double basesalary) {
		this.name = name;
		this.basesalary = basesalary;
	}
	public int getEmployeeId() {
		return id;
	}

	public void setEmployeeId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return basesalary;
	}

	public void setBaseSalary(Double basesalary) {
		this.basesalary = basesalary;
	}

	public Employee getManager() {
		return null;
	}

	public Boolean equals(Employee other) {
		if (this.id == other.id)
			return true;
		return false;
	}

	public String toString() {
		return id + " " + name;
	}

	public String employeeStatus() {
		return null;
	}
}
