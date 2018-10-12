package tieptv;

public class LG5 {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl Cracker",30,1000);
		staff[1] = new Employee("Harry Hacker",30,1000);
		staff[2] = new Employee("Tony Tester",30,1000);
		for (Employee e : staff)
			e.raiseSalary(5);
		for (Employee e : staff)
			System.out.println("name=" + e.getName()
			+ ",salary=" + e.getSalary()
			+ ",hireDay=" + e.getHireday());
	}

}
