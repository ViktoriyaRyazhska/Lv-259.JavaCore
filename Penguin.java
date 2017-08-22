package Homework;

public class Penguin extends NonFlyingBird {
	
	@Override
	 public String toString() {
		layEggs = true;
	 	return "Penguin. "  + "Feathers " + feathers + ", lay eggs " + layEggs;
	 }
}
