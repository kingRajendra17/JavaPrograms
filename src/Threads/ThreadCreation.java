package Threads;

class MyClass extends Thread {
	 public void run() {
		 for(int i = 0; i <= 7; i++) {
			 System.out.println(Thread.currentThread().getId() + " Value : " +i);
		 }
		 try {
			 Thread.sleep(1000);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
}

public class ThreadCreation {
	
	public static void main (String [] args) {
		MyClass c1 = new MyClass();
		c1.start();
		MyClass c2 = new MyClass();
		c2.start();
	}

}
