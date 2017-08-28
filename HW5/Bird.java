package aven.fifth.homework;

public abstract class Bird {
	
	String feathers;
	Boolean layEggs;
	
	abstract void fly();

	public Bird(String feathers, Boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Bird feathers=" + feathers + ", laying eggs=" + layEggs;
	}
	
	
	
	
	
/*
 * Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  Develop classes 
 * FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken. 
 */
	
}
