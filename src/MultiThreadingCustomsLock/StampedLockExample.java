package MultiThreadingCustomsLock;

import java.util.concurrent.locks.StampedLock;

public class StampedLockExample {
	int a = 10;

	StampedLock lock = new StampedLock();

	public void produce() {
		long stamp = lock.tryOptimisticRead();
		
		try {
			System.out.println("optimistic read lock by: "+Thread.currentThread().getName());
			a=11;
			Thread.sleep(7000);
			if(lock.validate(stamp)){
				System.out.println("Value updated: "+a);
			}
			else {
				System.out.println("Roll back");
				a=10;
			}
		}catch(Exception e) {
			//
		}
	}
	
	public void consume() {
		long stamp = lock.writeLock();
		System.out.println("Write lock acquired by: "+Thread.currentThread().getName());
		
		try {
			System.out.println("Performing task");
			a= 6;
			
		}catch(Exception e) {
			//
		}finally {
			lock.unlockWrite(stamp);
			System.out.println("Write lock Released by: "+Thread.currentThread().getName());
		}
	}
}