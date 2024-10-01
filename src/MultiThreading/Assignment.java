package MultiThreading;

import java.util.LinkedList;
import java.util.Queue;

// 2 thread producer and consumer share a common fixed buffer size as a queue
// producer job is to generate data and put into buffer while consumer job is to consume data from buffer
// Note- the producer won't produce data if buffer size is full and consumer won't consume data if buffer is empty

public class Assignment {

	private Queue<Integer> sharedBuffer;
	private int bufferSize;

	public Assignment(int bufferSize) {
		sharedBuffer = new LinkedList<>();
		this.bufferSize = bufferSize;
	}

	public synchronized void produce(int item) throws Exception {
		while (sharedBuffer.size() == bufferSize) {

			System.out.println("Buffer is full, producer waiting for consumer..");
			wait();
		}
		sharedBuffer.add(item);

		System.out.println("produced.."+item);
		notifyAll();
	}

	public synchronized int consume() throws Exception {
		while (sharedBuffer.isEmpty()) {

			System.out.println("Buffer is empty, consumer is waiting for producer ");
			wait();
		}
		int item = sharedBuffer.poll();

		System.out.println("Consumed.. " + item);

		notifyAll();
		return item;

	}
}
