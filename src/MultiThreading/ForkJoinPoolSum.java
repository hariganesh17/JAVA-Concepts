package MultiThreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolSum extends RecursiveTask<Integer>{

	int start;
	int end;
	
	ForkJoinPoolSum(int start,int end){
		this.start = start;
		this.end = end;
	}
	
	
	@Override
	protected Integer compute() {
		
		if(start - end <= 4) {
			int totalSum = 0;
			for(int i=start;i<=end;i++) {
				
				totalSum +=i;
			}
			return totalSum;
		}else {
			int mid = (start + end) / 2;
			
			ForkJoinPoolSum leftTask = new ForkJoinPoolSum(start, mid);
			ForkJoinPoolSum rigtTask = new ForkJoinPoolSum(mid+1,end);
			
			leftTask.fork();
			rigtTask.fork();
			
			int leftResult = leftTask.join();
			int rightResult = rigtTask.join();
			
			return leftResult + rightResult;
		}
	}
	
	public static void main(String[] args) {
		ForkJoinPool pool = ForkJoinPool.commonPool();
		Future<Integer> obj = pool.submit(new ForkJoinPoolSum(0, 100));
		
		try {
			System.out.println(obj.get());
		}catch(Exception e) {
			//
		}
	}
}