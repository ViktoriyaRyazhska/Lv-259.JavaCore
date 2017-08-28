package aven.fifth.homework.TaskTwo;

public class ContractEmployee extends Employee implements calculatePay {
	
	int federalTaxIdmember;
	Double workedHoursNumber;
	Double hourlyRate;
		
	public ContractEmployee(int employeeId, String name, int federalTaxIdmember, Double workedHoursNumber,
			Double hourlyRate) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.workedHoursNumber = workedHoursNumber;
		this.hourlyRate = hourlyRate;
	}


	@Override
	public double calculatePay() {
		return hourlyRate * workedHoursNumber;
	}

//The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked"
}
