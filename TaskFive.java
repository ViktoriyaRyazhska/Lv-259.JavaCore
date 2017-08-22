import java.util.Scanner;

public class TaskFive {

	public static void main(String[] args) {
	/*
	 *  Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.
	 */
		
		Car [] cars = new Car [4];
		cars [0] = new Car ("car1", 1991, 1.6);
		cars [1] = new Car ("car2", 1994, 1.4);
		cars [2] = new Car ("car3", 1994, 2.4);
		cars [3] = new Car ("car4", 1992, 2.1);

		//of a certain year
		int inputedYear = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter car relision year:");
		inputedYear = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].productionYear == inputedYear) {
				System.out.println(cars[i]);
			}
		}
		
		//ordered by field year
		System.out.println(" ");
		System.out.println("Ordered cars:");
		int tmp;
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars.length; j++) {
				if (cars[i].productionYear < cars[j].productionYear) {
					tmp = cars[i].productionYear;
					cars[i].productionYear = cars[j].productionYear;
					cars[j].productionYear = tmp;
				}
			}
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		

		
		sc.close();

	}
}
