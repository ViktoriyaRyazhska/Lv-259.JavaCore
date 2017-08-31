package homework_2;

public class ContractEmployee extends Emploee implements Pay {

	private String name;
	private long federalTaxIdmember;
	private double hourlyRate;
	private int hours;



	public ContractEmployee(String employyed, String name, long federalTaxIdmember, double hourlyRate, int hours) {
		super(employyed);
		this.name = name;
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	public ContractEmployee() {

	}

	public long getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFederalTaxIdmember(long federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	

	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + ", federalTaxIdmember=" + federalTaxIdmember + ", hourlyRate="
				+ hourlyRate + ", hours=" + hours + "]";
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return hourlyRate*hours;
	}

}
