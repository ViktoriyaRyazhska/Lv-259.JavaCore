package Homework2;

public class ContractEmployee extends Employee implements Minterface {
	
	private int numberhours;
	private double hourlyrate;
		
	public ContractEmployee(){};
	public ContractEmployee(String n, int Id, int nh, double hr) {
		super(n, Id);
		this.numberhours=nh;
		this.hourlyrate=hr;
	}

	@Override
	public double calculatePay(){
		return hourlyrate*numberhours;
	}
	@Override
	public String toString(){
		return name + " , ID " + ID + ", the average monthly salary " + calculatePay();
	}

}
