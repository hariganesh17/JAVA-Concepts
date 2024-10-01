package MultiThreadingCustomsLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockMain {

	public static void main(String[] args) {

		ReadWriteLockExample obj = new ReadWriteLockExample();
		ReadWriteLock lock = new ReentrantReadWriteLock();

		Thread t1 = new Thread(() -> {
			obj.produce(lock);
		});

		Thread t2 = new Thread(() -> {
			obj.produce(lock);
		});
		
		ReadWriteLockExample obj1 = new ReadWriteLockExample();
		
		Thread t3 = new Thread(() -> {
			obj1.comsume(lock);
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}