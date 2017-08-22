package Homework2;

public class SalariedEmployee extends Employee implements Minterface {
	
	private double fixedpayment;
	
	public SalariedEmployee(){};
	public SalariedEmployee(String n, int Id, double f) {
		super(n, Id);
		this.fixedpayment=f;
	}
	
	@Override
	public double calculatePay(){
		return fixedpayment;
	}
	@Override
	public String toString(){
		return name + " , ID " + ID + ", the average monthly salary " + calculatePay() + " , socialSecurityNumber";
	}
}
