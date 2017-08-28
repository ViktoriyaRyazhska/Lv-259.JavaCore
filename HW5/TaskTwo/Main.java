package aven.fifth.homework.TaskTwo;

class Main {

	public static void main(String[] args) {
	/*
	 * Create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID, name,
 and the average monthly wage for all elements of the list.
	 */

		SalariedEmployee empS1 = new SalariedEmployee(32, "Daniel", 3355, 800);
		SalariedEmployee empS2 = new SalariedEmployee(18, "Alica", 1144, 550);
		ContractEmployee empC1 = new ContractEmployee(41, "Kate", 4853, 45.00, 14.00);
		ContractEmployee empC2 = new ContractEmployee(41, "Cristine", 1418, 24.00, 16.00);
		
		Employee [] employees = {empS1, empS2, empC1, empC2};
		
		

	
		Employee tmp = null;
		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j]= tmp;
				}
			}
		}		
		
		for (int i = 0; i < 4; i++) {
			System.out.println(employees[i] + " " + employees[i].calculatePay());
		}
	}

}
