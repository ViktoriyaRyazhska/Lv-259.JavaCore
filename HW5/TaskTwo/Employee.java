package aven.fifth.homework.TaskTwo;

public class Employee implements calculatePay{
	private int employeeId;
	private String name;
	
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
		return "EmployeeId=" + employeeId + ", name=" + name;
	}


	@Override
	public double calculatePay() {
		return 0;
	}
	
	
}
