package task1;

public class Main {

	public static void main(String[] args) {
		
		Eagle eg = new Eagle("Eagle", true);
		System.out.println(eg);
		eg.feathers();
		eg.layEggs();
		eg.fly();
		System.out.println("-----------------------------");
		
		Swallow sw = new Swallow("Swallow", true);
		System.out.println(sw);
		sw.feathers();
		sw.layEggs();
		sw.fly();
		System.out.println("-----------------------------");
		
		Penguin pe = new Penguin("Penguin", true);
		pe.feathers();
		pe.layEggs();
		pe.fly();
		System.out.println("-----------------------------");
		
		Chicken ch = new Chicken("Chicken", true);
		ch.feathers();
		ch.layEggs();
		ch.fly();
	}

}
