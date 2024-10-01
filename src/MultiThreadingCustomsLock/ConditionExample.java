package MultiThreadingCustomsLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionExample {
	boolean isAvailable = false;

	ReentrantLock lock = new ReentrantLock();

	Condition condition = lock.newCondition();

	public void produce() {
		try {
			lock.lock();
			System.out.println("produce lock acquired by: " + Thread.currentThread().getName());

			if (isAvailable) {
				System.out.println("Produce thread is waiting for consume Thread to consume: "+Thread.currentThread().getName());
				condition.await();
			}
			isAvailable = true;
			condition.signal();
		} catch (Exception e) {
			//
		} finally {
			lock.unlock();
			System.out.println("Produce lock released by: " + Thread.currentThread().getName());
		}
	}
	
	public void consume() {
		try {
			Thread.sleep(7000);
			lock.lock();
			System.out.println("Consume lock acquired by: "+Thread.currentThread().getName());
			
			if(!isAvailable) {
				System.out.println("Consume thread is waiting for produce thread to produce: "+Thread.currentThread().getName());
				condition.await();
			}
			isAvailable = false;
			condition.signal();
		}catch(Exception e) {
			
		}finally {
			lock.unlock();
			System.out.println("Consume lock released by: " + Thread.currentThread().getName());
		}
	}
}
