package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureExample {
		public static void main(String[] args) {
			ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4,5,TimeUnit.SECONDS,
											  new ArrayBlockingQueue<>(2),Executors.defaultThreadFactory(),
											  new ThreadPoolExecutor.DiscardPolicy());
			
			Future<?> futureObj =  poolExecutor.submit(()->{
				
				try {
				Thread.sleep(5000);
				}catch(Exception e) {
					//
				}
				System.out.println("task executed by thread");
			});
				System.out.println("is task done:"+futureObj.isDone());
				
				try {
					futureObj.get(2, TimeUnit.SECONDS);
				} catch (TimeoutException e) {
					//
				}catch (Exception e) {
					//
				}
				
				try {
					futureObj.get();
				}catch(Exception e) {
					//
				}
				
				System.out.println("is task done:"+futureObj.isDone());
				System.out.println("is task cancelled:"+futureObj.isCancelled());
		}
}
