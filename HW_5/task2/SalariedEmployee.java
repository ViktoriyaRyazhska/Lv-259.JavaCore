package task2;

public class SalariedEmployee extends Employee {
	
	private int hourlyRate;
	private int workedHours;
	private int socialSecurityNumber;
	
	public SalariedEmployee(int employeeId, String name, int hourlyRate, int workedHours, int socialSecurityNumber) {
		super(employeeId, name);
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [employeeId= " + getEmployeeId() + ", name= " + getName() + ", hourlyRate= " + getHourlyRate() + ", workedHours= " + getWorkedHours() + ", socialSecurityNumber= "
				+ getSocialSecurityNumber() + "]";
	}

	@Override
	public double calculatePay() {
		return hourlyRate * workedHours;
	}

}
