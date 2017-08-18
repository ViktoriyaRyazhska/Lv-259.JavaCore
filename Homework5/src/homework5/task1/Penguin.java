package homework5.task1;

public class Penguin extends NonFlyingBird {
	private static final String name="Penguin";

	public Penguin() {
		super();
		this.setBirdName(Penguin.getName());
	}

	public Penguin(String feathers) {
		super(Penguin.getName(), feathers);
	}

	public static String getName() {
		return name;
	}
	
	
	
}
