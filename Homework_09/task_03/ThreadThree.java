package com.pack3;

public class ThreadThree extends Thread {

	private String text;
	private int delay;

	public ThreadThree() {

		this.text = "Thread number three";
		this.delay = 1000;

		System.out.println("Thread three has been created");
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(text);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException ex) {
			}
		}
		System.out.println("The end");
	}
}