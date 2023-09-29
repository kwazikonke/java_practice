package JavaDeepDive;

public class SleepAndAwait {

	public static void main(String[] args) {
	
		
		final Object lock = new Object();
		// the same as >> Object lock = new Object();
		// but "Final" indicates Lock is immutable 
	

		// First Thread
		Thread thread1 = new Thread(()->{
			synchronized (lock) {
				//Tread 1 start sleeping for 2 seconds
				System.out.println("Thread 1: Is Starting..");
				try {
					Thread.sleep(2000); // 2 seconds
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				// Thread 1 is done sleeping
				System.out.println("Thread 1: Is Done.");
				lock.notify();
			}
		});
		
		// Second Thread
		Thread thread2 = new Thread(()->{
			synchronized (lock) {
				System.out.println("Thread 2: Is Waiting for Thread 1 to finish");
				try {
			// Waiting for notification from Thread 1
					lock.wait();
					}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2: Start after Thread 1 is finishe");
			}
		});
		
		thread1.start();
		thread2.start();
		
	}

}
