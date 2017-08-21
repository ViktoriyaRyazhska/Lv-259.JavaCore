package com.employee;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		
		// Create an array of employees and add the employees with different form of payment //
		
		Employee [] employees = new Employee[7];
		employees[0] = new SalariedEmployee("1", "vasia", 11, 160, "11");
		employees[1] = new SalariedEmployee("2", "kolia", 12, 150, "12");
		employees[2] = new SalariedEmployee("3", "anna", 13, 140, "13");
		employees[3] = new SalariedEmployee("1", "naria", 15, 90, "14");
		employees[4] = new ContractEmployee("11", "olha", 2000, "120");
		employees[5] = new ContractEmployee("12", "tom", 5000, "121");
		employees[6] = new ContractEmployee("13", "miki", 3000, "1210");
		
		

		// Arrange the entire sequence of workers descending the average monthly wage
	//	Output the employee ID, name, and the average monthly wage for all elements of the list
 
		
		
		Employee [] temp  = new Employee[1];
		
		for (int i = 0; i <employees.length; i++) {
			for (int j = 0; j < employees.length; j++) {
				
				if(employees[i].calculatePay() > employees[j].calculatePay()){
					temp[0] = employees[i];
					employees[i] = employees[j];
					employees[j] = temp[0];
				}
				
			}
		}
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Employee " + employees[i].getName() + ", employee Id - "+ employees[i].getEmployeeld() 
					+ ", earns " + employees[i].calculatePay() + " per month");
		}
		
	}
}
