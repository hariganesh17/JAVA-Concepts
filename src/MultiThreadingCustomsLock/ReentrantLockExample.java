package MultiThreadingCustomsLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	
//	boolean isAvailable;
//	
//	ReentrantLock lock = new ReentrantLock();
//	
//	public void produce() {
//		
//		try{
//			lock.lock();
//			System.out.println("Lock acquired by: "+Thread.currentThread().getName());
//			isAvailable = true;
//			Thread.sleep(5000);
//		}
//		catch(Exception e) {
//			//
//		}
//		finally {
//			lock.unlock();
//			System.out.println("Lock Released by: "+Thread.currentThread().getName());
//		}
//	}
	
	boolean isAvailable;
	
	public void produce(ReentrantLock lock) {
		
			try{
				lock.lock();
				System.out.println("Lock Aquired by: "+Thread.currentThread().getName());
				Thread.sleep(5000);
				}
			catch(Exception e) {
				//
			}
			finally{
				lock.unlock();
				System.out.println("Lock Released by: "+Thread.currentThread().getName());
			}
		
	}
}
