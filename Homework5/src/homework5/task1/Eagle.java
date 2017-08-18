package homework5.task1;

public class Eagle extends FlyingBird {
	
	private static final String name="Eagle";

	public Eagle() {
		super();
		this.setBirdName(Eagle.getName());
	}

	public Eagle(String feathers) {
		super(Eagle.getName(), feathers);
	}

	
	public static String getName() {
		return name;
	}
	
	
	

}
