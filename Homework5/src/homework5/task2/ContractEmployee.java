package homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;

public class ContractEmployee extends Employee {
	private int federalTaxIdmember;
	private double fixedSalary;
	private int employeeId;

	public ContractEmployee() {
		super();
		this.employeeId=Employee.getEmployeeCount();
	}

	public ContractEmployee(String name, int federalTaxIdmember, double fixedSalary) {
		super(name);
		this.employeeId=Employee.getEmployeeCount();
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedSalary = fixedSalary;
	}
	
	

	public int getEmployeeId() {
		return employeeId;
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

	public double calculatePay() {
		return this.fixedSalary;
	}
	
	public void inputInfo(BufferedReader reader) throws IOException {
		System.out.println("===Conntract Employee===");
		System.out.print("Enter the name of employee: ");
		this.setName(reader.readLine());
		System.out.print("Enter the fixed salary per month: ");
		this.setFixedSalary(Double.parseDouble(reader.readLine()));
		System.out.print("Enter the federal tax id number: ");
		this.setFederalTaxIdmember(Integer.parseInt(reader.readLine()));
		
	}

}
