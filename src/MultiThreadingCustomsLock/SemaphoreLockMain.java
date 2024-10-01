package MultiThreadingCustomsLock;

public class SemaphoreLockMain {
	public static void main(String[] args) {
		SemaphoreLockExample obj = new SemaphoreLockExample();

		Thread t1 = new Thread(() -> {
			obj.produce();
		});

		Thread t2 = new Thread(() -> {
			obj.produce();
		});

		Thread t3 = new Thread(() -> {
			obj.produce();
		});

		Thread t4 = new Thread(() -> {
			obj.produce();
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
