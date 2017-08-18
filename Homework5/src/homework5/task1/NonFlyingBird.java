package homework5.task1;

public class NonFlyingBird extends Bird {
	
	
	
	public NonFlyingBird() {
		super();
	}
	
	

	public NonFlyingBird(String birdName, String feathers) {
		super(birdName, feathers);
	}



	public String fly() {
		return "Can't fly";
	}
	
	
}
