package MultiThreading;

public class SharedResourceMain {
	
	public static void main(String[] args) {
//		SharedResource obj = new SharedResource();
//		
//		Thread ProducerThread = new Thread(()->{
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			obj.ProduceItem();
//		});
//		
//		Thread ConsumerThread = new Thread(()->{
//			obj.consumeItem();
//		});
//		
//		ProducerThread.start();
//		ConsumerThread.start();
//	}
	
	Assignment obj = new Assignment(3);
	
	Thread produceThread = new Thread(()->{
		for(int i=1;i<=6;i++) {
			try {
				obj.produce(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
	Thread consumeThread = new Thread(()->{
		for(int i=1;i<=6;i++) {
			try {
				obj.consume();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	produceThread.start();
	consumeThread.start();
	}
}
