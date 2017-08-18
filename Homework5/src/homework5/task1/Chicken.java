package homework5.task1;

public class Chicken extends NonFlyingBird {
	
	private static final String name="Chicken";

	public Chicken() {
		super();
		this.setBirdName(Chicken.getName());
	}

	public Chicken( String feathers) {
		super(Chicken.getName(), feathers);
	}

	public static String getName() {
		return name;
	}
	
	
	
}
