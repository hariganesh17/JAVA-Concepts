package MultiThreading;

public class ThreadCreation implements Runnable {

	@Override
	public void run() {
		System.out.println("code executed thread:"+Thread.currentThread().getName());
	}
	
}
