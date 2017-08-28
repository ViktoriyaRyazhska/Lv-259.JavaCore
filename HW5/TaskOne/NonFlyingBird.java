package aven.fifth.homework;

public class NonFlyingBird extends Bird{

	public NonFlyingBird(String feathers, Boolean layEggs) {
		super(feathers, layEggs);

	}

	@Override
	void fly() {
		System.out.println("Cannot fly");
	}

}
