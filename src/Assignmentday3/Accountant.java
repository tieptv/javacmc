package Assignmentday3;

public class Accountant extends BusinessEmployee {
	protected TechnicalLead tech;

	public Accountant(String name) {
		super(name);
	}

	public TechnicalLead getTeamSupported() {
		return tech;
	}

	public void supportTeam(TechnicalLead lead) {
		this.tech = lead;
	}

	public boolean approveBonus(double bonus) {
		return false;
	}
	public String employeeStatus()
	{
		return null;
	}
}
