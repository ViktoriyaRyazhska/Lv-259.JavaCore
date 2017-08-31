package com.pack;

public class ThreadThree extends Thread {

	private int delay;
	private String text;

	public ThreadThree(int delay, String text) {
		this.delay = delay;
		this.text = text;

	}
	
	@Override
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(text);
	
		try{
			Thread.sleep(delay);;
		}catch(InterruptedException ex ){
			ex.printStackTrace();
		}
		
		}
		
	}

}