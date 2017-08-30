package Homework3;

public class MyThread31 implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<3; i++){
			System.out.println("Thread number two");
		}
		MyThread32 m2 = new MyThread32();
		Thread t2 = new Thread(m2);
		
		t2.start();	
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
