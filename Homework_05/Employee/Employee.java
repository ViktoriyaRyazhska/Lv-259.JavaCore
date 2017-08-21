package com.employee;

public class Employee implements PayCalculation{

	private String employeeld;
	private String name;
	
	
	public Employee(String employeeld, String name) {
		super();
		this.employeeld = employeeld;
		this.name = name;
	}


	public String getEmployeeld() {
		return employeeld;
	}


	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int calculatePay() {
		return 0;
	}


	
	
	
}
