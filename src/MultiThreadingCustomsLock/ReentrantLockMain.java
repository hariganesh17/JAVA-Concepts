package MultiThreadingCustomsLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {

//	public static void main(String []args) {
//		
//	CustomsLock obj = new CustomsLock();
//	
//	Thread t1 = new Thread(()->{
//		obj.produce();
//	});
//	
//	Thread t2 = new Thread(()->{
//		obj.produce();
//	});
//	
//	t1.start();
//	t2.start();
//	}
	
	public static void main(String [] args){
		
		ReentrantLock lock = new ReentrantLock();
		ReentrantLockExample obj = new ReentrantLockExample();
		
		Thread t1 = new Thread(()->{
			obj.produce(lock);
		});
		
		ReentrantLockExample obj1 = new ReentrantLockExample();
		Thread t2 = new Thread(()->{
			obj1.produce(lock);
		});
		
		t1.start();
		t2.start();
	}
}	
