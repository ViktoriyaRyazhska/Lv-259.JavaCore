package aven.fifth.homework.TaskTwo;

public class SalariedEmployee extends Employee implements calculatePay{

	int socialSecurityNumber;
	int fixedMonthlyPayment;
	
	public SalariedEmployee(int employeeId, String name, int socialSecurityNumber, int fixedMonthlyPayment) {
		super(employeeId, name);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;
	}

	
	//For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“
}
