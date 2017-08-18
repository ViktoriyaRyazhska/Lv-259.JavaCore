package homework5.task1;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Bird {
	private String birdName;
	private String feathers;

	public Bird() {

	}

	public Bird(String birdName, String feathers) {
		super();
		this.birdName = birdName;
		this.feathers = feathers;
	}

	public String layEggs() {
		return "Lays eggs";
	}

	public abstract String fly();

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}

	@Override
	public String toString() {
		return "Bird name=" + birdName + ", feathers=" + feathers + ", laying eggs capability=" + layEggs() + ", flying capability ="
				+ fly();
	}

	public void inputInfo(BufferedReader reader) throws IOException {
		System.out.print("Enter "+this.getBirdName()+"'s feathers: ");
		this.setFeathers(reader.readLine());
	}

}
