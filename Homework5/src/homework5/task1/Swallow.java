package homework5.task1;

public class Swallow extends FlyingBird {
	
	private static final String name="Swallow"; 

	public Swallow() {
		super();
		this.setBirdName(Swallow.getName());
	}

	public Swallow(String feathers) {
		super(Swallow.getName(), feathers);
	}

	public static String getName() {
		return name;
	}
	
	
	
}
