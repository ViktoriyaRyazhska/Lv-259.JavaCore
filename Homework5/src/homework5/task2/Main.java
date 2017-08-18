package homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
	public static Employee[] sortSalaryByDescending(Employee[] array) {
		Employee[] temp=new Employee[1];
		System.out.println("===Sorting by salary in descending order===");
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].calculatePay()<array[j].calculatePay()) {
					temp[0]=array[i];
					array[i]=array[j];
					array[j]=temp[0];
					
				}
			}
		}
		return array;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Employee[] employees=new Employee[5];
//		employees[0]=new SalariedEmployee("Andrii","102312CA",20,4);
//		employees[1]=new ContractEmployee("Max",20123,3000);
//		employees[2]=new ContractEmployee("Joe",20124,3200);
//		employees[3]=new SalariedEmployee("Bob","10123AS",30,4);
//		employees[4]=new SalariedEmployee("Den","1230DA",40,4);
		
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
