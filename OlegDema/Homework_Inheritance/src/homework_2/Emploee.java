package homework_2;

public class Emploee {
	private String employyed;

	public Emploee(String employyed) {
		super();
		this.employyed = employyed;
	}

	public Emploee() {
		super();
	}

	public String getEmployyed() {
		return employyed;
	}

	public void setEmployyed(String employyed) {
		this.employyed = employyed;
	}

	@Override
	public String toString() {
		return "Emploee [employyed=" + employyed + "]";
	}
	
	
}
