package MultiThreading;

public class MoniterLockMain {
	
	public synchronized void task1(){
		
		try {
			System.out.println("Inside Sync task1 BEFORE waiting 10s");
			Thread.sleep(10000);
			System.out.println("Inside Sync task1 AFTER waiting 10s");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void task2() {
		System.out.println("Inside task2");
		
		synchronized (this) {
			System.out.println("Inside Sync task2");
		}
	}
	
	public void task3() {
		System.out.println("Inside task3");
	}
}
