package com.pack2;

public class Main {

	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = Thread.currentThread();

		synchronized (first) {
			Thread.yield();
			synchronized (second) {
				System.out.println("Success from thread1!");
			}
		}

		Thread thread2 = new Thread() {
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						System.out.println("Success from thread2!");
					}
				}
			}
		};

		thread1.join();
		thread2.start();
		System.out.println("the end"); // this line wouldn't be printed

	}

}
