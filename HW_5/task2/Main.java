package task2;

	/* Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld. 
	 * Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
	 * 1. Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
	 * 2. Describe the string variable socialSecurityNumber in the class SalariedEmployee.
	 * 3. Include a description of federalTaxIdmember in the class of contractEmployee.
	 * 4. The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked".
	 * 5. For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“.
	 * 6. Create an array of employees and add the employees with different form of payment.
	 * 7. Arrange the entire sequence of workers descending the average monthly wage. 
	 * Output the employee ID, name, and the average monthly wage for all elements of the list.
	 */

public class Main {

	public static void main(String[] args) {
		
		Employee [] employees = new Employee[4];
		employees[0] = new SalariedEmployee(23, "Bob", 8, 130, 113);
		employees[1] = new SalariedEmployee(46, "Dan", 2, 90, 125);
		employees[2] = new ContractEmployee(21, "Ola", 1111, 22212.400);
		employees[3] = new ContractEmployee(12, "Tom", 1122, 33344.600);

		System.out.println("List of employees: ");
		for (Employee employee : employees) {
			System.out.println("\t" + employee);
		}
		
		System.out.println("\nSorting of descending the average monthly wage: ");
		employees = sortSalary(employees);

		for (int i = 0; i < employees.length; i++) {
			System.out.println("\tEmployee: [employeeId= " + employees[i].getEmployeeId() + ", name= "+ employees[i].getName() + ", earns " + employees[i].calculatePay() + " per month");
		}	
	}
	
	// sorting of descending the average monthly wage
	public static Employee[] sortSalary(Employee[] mas) {
		for (int i = 0; i < mas.length-1; i++) {
			for (int j = i+1; j < mas.length; j++) {
				if (mas[i].calculatePay() < mas[j].calculatePay()) {
					Employee temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
		}
		return mas;
	}

}
