package task2;

public class ContractEmployee extends Employee {

	private int federalTaxIdmember;
	private double fixedSalary;
	
	public ContractEmployee(int employeeId, String name, int federalTaxIdmember, double fixedSalary) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedSalary = fixedSalary;
	}


	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee [employeeId= " + getEmployeeId() + ", name= " + getName() + ", federalTaxIdmember= " + getFederalTaxIdmember() + ", fixedSalary= " + getFixedSalary() + "]";
	}

	@Override
	public double calculatePay() {
		return this.fixedSalary;
	}

}
