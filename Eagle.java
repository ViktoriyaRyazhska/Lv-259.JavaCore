package Homework;

public class Eagle extends FlyingBird {


	@Override
	 public String toString() {
		layEggs = true;
	 	return "Eagle. "  + "Feathers " + feathers + ", lay eggs " + layEggs;
	 }
}
