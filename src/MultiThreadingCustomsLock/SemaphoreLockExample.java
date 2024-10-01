package MultiThreadingCustomsLock;

import java.util.concurrent.Semaphore;

public class SemaphoreLockExample {
	boolean isAvailable;
	
	Semaphore lock = new Semaphore(2);
	
	public void produce() {
		try {
			lock.acquire();
			System.out.println("lock acquired by: "+Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(7000);
		}catch(Exception e) {
			
		}finally {
			lock.release();
			System.out.println("Lock released by: "+Thread.currentThread().getName());
		}
	}
}
