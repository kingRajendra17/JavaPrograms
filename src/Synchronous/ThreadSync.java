package Synchronous;

public class ThreadSync {

	public static int count = 0;
	
	public static synchronized void inccount() {
		count++;
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					inccount();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					inccount();
				}
			}
		});

		t1.start();
		t2.start();
		

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Value : " + count);
	}
}
