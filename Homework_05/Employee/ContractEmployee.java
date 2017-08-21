package com.employee;

public class ContractEmployee extends Employee{
	
	private int fixedPayment;
	private String federalTaxIdmember;
	
	
	public ContractEmployee(String employeeld, String name, int fixedPayment, String federalTaxIdmember) {
		super(employeeld, name);
		this.fixedPayment = fixedPayment;
		this.federalTaxIdmember = federalTaxIdmember;
	}


	public int getFixedPayment() {
		return fixedPayment;
	}


	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}


	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}


	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}


	@Override
	public int calculatePay() {
		
		return fixedPayment;
	}
	
	
	
	
	

	
	
	
	
	

}
