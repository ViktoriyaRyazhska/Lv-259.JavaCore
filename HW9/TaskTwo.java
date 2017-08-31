package aven.nineth.homework;

public class TaskTwo {

	/*
	 * Cause a deadlock. Organize the expectations of ending a thread in main(), and
	 * make the end of the method main() in this thread.
	 */

	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						System.out.println("Success!");
					}
				}
			}
		};
		t1.join();
	}

}
