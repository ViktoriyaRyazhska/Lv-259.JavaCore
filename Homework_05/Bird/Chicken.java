package com.pack;

public class Chicken extends NonFlyingBird{

	public Chicken(String feathers, boolean layEggs) {
		super(feathers, layEggs);
			
	}

	@Override
	public void fly() {
		System.out.println("I am chicken, I can't fly");
		
	}

}
