package com.pack;

public class Penguin extends NonFlyingBird{

	public Penguin(String feathers, boolean layEggs) {
		super(feathers, layEggs);
		
		
		
		
	}

	@Override
	public void fly() {
		
		System.out.println("I am penguin, I can't fly");
	}

}
