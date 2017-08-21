package com.pack;

public class Swallow extends FlyingBird{

	public Swallow(String feathers, boolean layEggs) {
		super(feathers, layEggs);
		
		
		
	}

	@Override
	public void fly() {
	System.out.println("I am a swallow and I am a flying bird");
	}

}
