package SingleThread;

public class SingleThread {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <= 7; i++) {
					System.out.println(Thread.currentThread().getId() + " Value : " + i);
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

		t1.start();
	}
}