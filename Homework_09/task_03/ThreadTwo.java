package com.pack3;

public class ThreadTwo extends Thread{

	
	private String text;
	private int delay;
	
	
	public ThreadTwo(){
		
		this.text = "Thread number two";
		this.delay = 1000;
		
		System.out.println("Thread two has been created");
	}
	
	@Override
	public void run(){

		for (int i = 0; i < 3; i++) {
			System.out.println(text);
			try{
				Thread.sleep(delay);
			}catch(InterruptedException ex){
		}
			}
		
		
	ThreadThree th3 = new ThreadThree();
	
	th3.start();
		
}
	
	
	
}