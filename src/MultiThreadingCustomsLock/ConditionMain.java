package MultiThreadingCustomsLock;

public class ConditionMain {
	public static void main(String [] args) {
		
		ConditionExample obj = new ConditionExample();
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<=2;i++) {
				obj.produce();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=2;i++) {
				obj.consume();
			}
		});
		
		t1.start();
		t2.start();
	}
}
