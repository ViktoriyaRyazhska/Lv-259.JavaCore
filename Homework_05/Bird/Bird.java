package com.pack;

public abstract class Bird {

	private String feathers;
	private boolean layEggs;
	
	
	public Bird(String feathers, boolean layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	
	public abstract void fly();


	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
	
}