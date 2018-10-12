package Assignmentday3;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
	protected int headcount;
	ArrayList<SoftwareEngineer> report = new ArrayList<SoftwareEngineer>();

	public TechnicalLead(String name) {
		super(name);
		this.basesalary = 1.3 * this.basesalary;
		this.headcount = 4;
	}

	public boolean hasHeadCount() {
		if (report.size() < headcount)
			return true;
		return false;
	}

	public boolean addReport(SoftwareEngineer e) {
		if (report.size() <= headcount) {
			report.add(e);
			return true;
		}
		return false;
	}

	public boolean approveCheckIn(SoftwareEngineer e) {
		if (e.checkInCode() && e.getCodeaccess())
			return true;
		return false;
	}

	public boolean requestBonus(Employee e, double bonus) {
		return false;
	}

	public String getTeamStatus() {
		String result = "";
       for(SoftwareEngineer se:report)result+=se.employeeStatus()+"\n";
       return result;
	}
}
