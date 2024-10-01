package MultiThreadingCustomsLock;

import java.util.concurrent.locks.ReadWriteLock;

public class ReadWriteLockExample {
	
	boolean isAvailable;
	
	public void produce(ReadWriteLock lock) {
		try{
			lock.readLock().lock();
			System.out.println("Read lock acquired by: "+Thread.currentThread().getName());
			Thread.sleep(5000);
		}
		catch(Exception e) {
			//
		}
		finally{
			lock.readLock().unlock();
			System.out.println("Read lock relesed by: "+Thread.currentThread().getName());
		}
	}
	
	public void comsume(ReadWriteLock lock) {
		try{
			lock.writeLock().lock();
			System.out.println("Write lock acquired by: "+Thread.currentThread().getName());
		}
		catch(Exception e) {
			//
		}
		finally {
			lock.writeLock().unlock();
			System.out.println("Write lock released by: "+Thread.currentThread().getName());
		}
	}
}
