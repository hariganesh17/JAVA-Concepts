package MultiThreading;

public class MoniterLock {
	public static void main(String [] args) {
		MoniterLockMain obj = new MoniterLockMain();
		
		Thread t1 = new Thread(()->obj.task1());
		Thread t2 = new Thread(()-> obj.task2());
		Thread t3 = new Thread(()-> obj.task3());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
