package com.employee;

public class SalariedEmployee extends Employee{

	private int hourlyRate;
	private int workedHours;
	private String socialSecurityNumber;
	
	
	public SalariedEmployee(String employeeld, String name, int hourlyRate, int workedHours,
			String socialSecurityNumber) {
		super(employeeld, name);
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


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	@Override
	public int calculatePay() {
		
		return  hourlyRate * workedHours;
	}
	
	
	


	


	
	
	

	
	
}
