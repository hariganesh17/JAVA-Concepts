package MultiThreadingCustomsLock;

public class StampedLockMain {
	public static void main(String[] args) {
		StampedLockExample obj = new StampedLockExample();

		Thread t1 = new Thread(() -> {
			obj.produce();
		});

		Thread t2 = new Thread(() -> {
			obj.consume();
		});
		
		t1.start();
		t2.start();
	}

}
