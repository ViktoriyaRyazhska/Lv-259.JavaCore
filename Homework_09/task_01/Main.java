package com.pack;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/////TASK_1
		
		ThreadOne th1 = new ThreadOne(1000, "message from Thread one");
		ThreadTwo th2 = new ThreadTwo(2000, "message from Thread two");
		ThreadThree th3 = new ThreadThree(3000, "message from Thread three");
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		th3.start();
		
		
		
		
	}

}
