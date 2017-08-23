package homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
	public static Employee[] sortSalaryByDescending(Employee[] array) {
		Employee temo=p;
		System.out.println("===Sorting by salary in descending order===");
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].calculatePay()<array[j].calculatePay()) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		return array;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Employee[] employees=new Employee[5];
		employees[0]=new SalariedEmployee();
		employees[1]=new ContractEmployee();
		employees[2]=new ContractEmployee();
		employees[3]=new SalariedEmployee();
		employees[4]=new SalariedEmployee();
		
		for(int i=0;i<employees.length;i++) {
			employees[i].inputInfo(reader);
		}
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
		employees=sortSalaryByDescending(employees);
		
		
		
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
		

		
	}
		
}
