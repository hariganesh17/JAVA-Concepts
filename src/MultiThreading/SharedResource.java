package MultiThreading;

public class SharedResource {
	
	boolean isItemPresent = false;
	
	public synchronized void ProduceItem() {
		
		isItemPresent = true;
		
		System.out.println("Producer Thread calling notify..");
		notifyAll();
	}
	
	public synchronized void consumeItem() {
		
		System.out.println("Consumer Thread Inside consume Item");
		
		if(!isItemPresent) {
			try {
				System.out.println("Consumer Thread waiting...");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		isItemPresent = false;
		System.out.println("Consumer Thread consumed item");
	}
}
