package Homework2;

public class Main {

	public static void main(String[] args) {
		
		Minterface[] emp = new Minterface[5];
		emp[0]= new SalariedEmployee ("Ivan", 22457, 4000);
		emp[1]= new SalariedEmployee ("Kristina", 13472, 5000);
		emp[2]= new ContractEmployee ("Sofia", 12345, 120, 40);
		emp[3]= new ContractEmployee ("Oksana", 54321,70, 50);
		emp[4]= new SalariedEmployee ("Miha", 78222, 7000);
		
		Minterface t = emp[0];
		 
		 for (int i = 0; i < emp.length - 1; i++) {
		 	for (int j = i + 1; j < emp.length; j++) {
		 		if (emp[i].calculatePay() > emp[j].calculatePay()) {
		 			t = emp[i];
		 			emp[i]=emp[j];
		 			emp[j]=t;
		 		}
		 	}
		 }
		
		 for (int i = 0; i < emp.length; i++){
			System.out.println(emp[i].toString());}
	
	}

}
