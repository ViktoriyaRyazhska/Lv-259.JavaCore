package Homework;

public class Swallow extends FlyingBird {
	
	@Override
	 public String toString() {
		layEggs = true;
	 	return "Swallow. "  + "Feathers " + feathers + ", lay eggs " + layEggs;
	 }
}
