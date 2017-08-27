package task2;

public class Employee implements CalculatePay {

	private int employeeId;
	private String name;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

	@Override
	public double calculatePay() {
		return 0;
	}
	
	

}
