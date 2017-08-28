package aven.fifth.homework;

public class FlyingBird extends Bird {

	
	public FlyingBird(String feathers, Boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("Can fly");
	}

}
