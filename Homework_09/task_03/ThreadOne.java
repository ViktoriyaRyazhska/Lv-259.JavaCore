package com.pack3;

public class ThreadOne extends Thread {

	public ThreadOne() {

	}

	@Override
	public void run() {

		ThreadTwo threadTwo = new ThreadTwo();
		threadTwo.start();
	}

}
