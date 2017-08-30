package Homework;

public class Main1 {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		MyThread2 m2 = new MyThread2();
		Thread t2 = new Thread(m2);
		t2.start();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0; i<5; i++){
			System.out.println("Hello 3");
			
		}

	}

}
