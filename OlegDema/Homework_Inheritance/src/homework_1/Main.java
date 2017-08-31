package homework_1;

public class Main {

	public static void main(String[] args) {
		Bird []birds = new Bird[4];
		
		birds[0]= new Eagle("Rita", 35, "Brown", 2);
		birds[1]= new Swallow("Anna", 5, "Red", 10);
		birds[2]= new Penguin("Olena", 8, "Black", 9);
		birds[3]= new Kiwi("Vika", 2, "Green", 0);
		
		for (Bird bird : birds) {
			System.out.println(bird);
			bird.fly();
			System.out.println();
		}

	}

}
