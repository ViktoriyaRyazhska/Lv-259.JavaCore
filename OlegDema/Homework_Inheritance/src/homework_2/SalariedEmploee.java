package homework_2;

public class SalariedEmploee extends Emploee implements Pay {

	private String name;
	private double monthySalary;
	private String socialSecurityNumber;

	

	public SalariedEmploee(String employyed, String name, double monthySalary, String socialSecurityNumber) {
		super(employyed);
		this.name = name;
		this.monthySalary = monthySalary;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public SalariedEmploee() {

	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthySalary() {
		return monthySalary;
	}

	public void setMonthySalary(double monthySalary) {
		this.monthySalary = monthySalary;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	

	@Override
	public String toString() {
		return "SalariedEmploee [name=" + name + ", monthySalary=" + monthySalary + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}

	@Override
	public double calculatePay() {
		return monthySalary;
	}

}
