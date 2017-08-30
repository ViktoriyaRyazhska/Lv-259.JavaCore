package Homework3;

public class Main3 {

	public static void main(String[] args) {
		MyThread31 m1 = new MyThread31();
		Thread t1 = new Thread(m1);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
