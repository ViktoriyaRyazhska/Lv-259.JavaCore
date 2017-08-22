package regina.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculate[] employees = new Calculate[4];
        employees[0] = new SalariedEmployee("001", "Polischyk", "123", 50.00, 160.00);
        employees[1] = new SalariedEmployee("002", "Musuchuk", "894", 200.00, 165.00);
        employees[2] = new ContractEmployee("003", "Bondarenko", "456", 20000.00);
        employees[3] = new ContractEmployee("004", "Yavorska", "795", 15000.00);

        sortOfWorkers(employees);
        printArr(employees);

    }

            public static void sortOfWorkers(Calculate[] employees) {
                Calculate tmp = null;
                for (int i = 0; i < employees.length - 1; i++) {
                    for (int j = i + 1; j < employees.length; j++) {
                        if (employees[i].calculatePay() < employees[j].calculatePay()) {
                            tmp = employees[i];
                            employees[i] = employees[j];
                            employees[j] = tmp;
                        }
                    }
                }
            }

            public static void printArr(Calculate[] employees){
                 for (int i = 0; i < employees.length; i++){
                    System.out.print(employees[i]+ " ");
                     System.out.println("monthly salary: " + employees[i].calculatePay());
                }
             }
}
