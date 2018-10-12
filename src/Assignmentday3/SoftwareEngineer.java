package Assignmentday3;

public class SoftwareEngineer extends TechnicalEmployee {
	static int count = 1;
	protected Boolean codeaccess;
	protected int successfulcheckIn;

	public int getSuccessfulcheckIn() {
		return successfulcheckIn;
	}

	public void setSuccessfulcheckIn(int successfulcheckIn) {
		this.successfulcheckIn = successfulcheckIn;
	}

	public Boolean getCodeaccess() {
		return codeaccess;
	}

	public void setCodeaccess(Boolean codeaccess) {
		this.codeaccess = codeaccess;
	}

	public SoftwareEngineer(String name) {
		super(name);
		this.checkin = 0;
		this.id = count;
		count++;
	}

	public boolean checkInCode() {
		successfulcheckIn++;
		return true;
	}
}
