package com.pack;

public class BirdTest {

	public static void main(String[] args) {

		Bird[] birds = new Bird[4];

		birds[0] = new Eagle("brown", true);
		birds[1] = new Swallow("black", true);
		birds[2] = new Penguin("white", true);
		birds[3] = new Chicken("red", true);

		for (int i = 0; i < birds.length; i++) {

			birds[i].fly();
		}

		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i].toString());

		}
	}
}
