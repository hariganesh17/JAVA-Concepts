package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
	public static void main(String[] args) {

		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 8, 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(3),
				Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
		try {
			// then apply and then apply async

			CompletableFuture<String> obj = CompletableFuture.supplyAsync(() -> {
				try {
					System.out.println("supplyAsync thread Name:" + Thread.currentThread().getName());
					Thread.sleep(5000);
				} catch (Exception e) {
					//
				}
				return "Happy";

			}, executor).thenApplyAsync((String val) -> {
				System.out.println("then apply  thread Name:" + Thread.currentThread().getName());
				return val + " coding";
			}, executor).thenApplyAsync((String val) -> {
				System.out.println("then apply  thread Name:" + Thread.currentThread().getName());
				return val + " Evreyone";
			}, executor).thenApplyAsync((String val) -> {
				System.out.println("then apply  thread Name:" + Thread.currentThread().getName());
				return val + " do well";
			}, executor);

			// then compose and then compose async

			CompletableFuture<String> obj1 = CompletableFuture.supplyAsync(() -> {
				try {
					System.out.println("supplyAsync thread Name:" + Thread.currentThread().getName());
					Thread.sleep(5000);
				} catch (Exception e) {
					//
				}
				return "Happy";

			}, executor).thenComposeAsync((String val) -> {
				return CompletableFuture.supplyAsync(() -> val + " coding");
			}).thenComposeAsync((String val) -> {
				return CompletableFuture.supplyAsync(() -> val + " all");
			});

			// then combine and then combine async

			CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
				return "Happy";
			}, executor);

			CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> {
				return 100;
			}, executor);

			CompletableFuture<String> combine = task1.thenCombine(task2, (String val1, Integer val2) -> val1 + val2);
			System.out.println(combine.get());

			// printing outpur for above all
			// System.out.println(obj1.get());

		} catch (Exception e) {
			//
		}
	}
}
