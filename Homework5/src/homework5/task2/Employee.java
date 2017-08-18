package homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Employee implements CalculatePay {
	private static int employeeCount = 0;
	private String name;

	public Employee() {
		employeeCount++;
	}

	public Employee(String name) {
		employeeCount++;
		this.name = name;
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getEmployeeId();

	public abstract double calculatePay();

	public abstract void inputInfo(BufferedReader reader) throws IOException;

	@Override
	public String toString() {
		return "id[" + this.getEmployeeId() + "] name=" + this.getName() + ", salary=$" + (int) this.calculatePay();
	}

}
