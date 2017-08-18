package homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;

public class SalariedEmployee extends Employee  {
	private String socialSecurityNumber;
	private int hoursWorked;
	private double hourRate;
	private int employeeId;

	public SalariedEmployee() {
		super();
		this.employeeId=Employee.getEmployeeCount();
	}

	public SalariedEmployee(String name, String socialSecurityNumber, int hoursWorked, double hourRate) {
		super(name);
		this.employeeId=Employee.getEmployeeCount();
		this.socialSecurityNumber = socialSecurityNumber;
		this.hoursWorked = hoursWorked;
		this.hourRate = hourRate;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	public double calculatePay() {
		return this.hoursWorked * this.hourRate;
	}
	
	public void inputInfo(BufferedReader reader) throws IOException {
		System.out.println("===Creating Salaried Employee===");
		System.out.print("Enter the name of the employee: ");
		this.setName(reader.readLine());
		System.out.print("Enter the social security number: ");
		this.setSocialSecurityNumber(reader.readLine());
		System.out.print("Enter the amount of hours: ");
		this.setHoursWorked(Integer.parseInt(reader.readLine()));
		System.out.print("Enter the hourly rate: ");
		this.setHourRate(Double.parseDouble(reader.readLine()));
		
	}

}
