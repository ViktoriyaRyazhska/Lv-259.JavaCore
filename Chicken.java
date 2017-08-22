package Homework;

public class Chicken extends NonFlyingBird {
	
	@Override
	 public String toString() {
		layEggs = true;
	 	return "Chicken. "  + "Feathers " + feathers + ", lay eggs " + layEggs;
	 }
	
}
