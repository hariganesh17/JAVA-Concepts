package MultiThreading;

public class ThreadMain {
	public static void main(String [] args) {
		
		System.out.println("Inside Main Method.."+Thread.currentThread().getName());
		
		ThreadCreation obj = new ThreadCreation();
		Thread thread = new Thread(obj);
		
		thread.start();
		System.out.println("End of main method.."+Thread.currentThread().getName());
	}
}
