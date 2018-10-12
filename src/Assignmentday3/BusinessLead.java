package Assignmentday3;

import java.util.ArrayList;

public class BusinessLead extends Accountant {
	protected int headcount;
	ArrayList<Accountant> report = new ArrayList<Accountant>();

	public BusinessLead(String name) {
		super(name);
		this.basesalary = 2 * this.basesalary;
		this.headcount = 10;
	}

	public boolean hasHeadCount() {
		if (report.size() < headcount)
			return true;
		return false;
	}

	public boolean addReport(Accountant e, TechnicalLead supportTeam) {
		if (report.size() <= headcount) {
			report.add(e);
			this.bonusbudget += 1.1 * e.basesalary;
			return true;
		}
		return false;
	}

	public boolean requestBonus(Employee e, double bonus) {
		if(bonus<this.bonusbudget)return true;
		return false;
	}

	public boolean approveBonus(Employee e, double bonus) {
       return true;
	}
 public static void main(String[] args) {
	 TechnicalLead CTO = new TechnicalLead("Satya Nadella");
     SoftwareEngineer seA = new SoftwareEngineer("Kasey");
     SoftwareEngineer seB = new SoftwareEngineer("Breana");
     SoftwareEngineer seC = new SoftwareEngineer("Eric");
     CTO.addReport(seA);
     CTO.addReport(seB);
     CTO.addReport(seC);
     System.out.println(CTO.getTeamStatus());
}
}
