import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
            //1.supplyAsync - initiate async task
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->{
            System.out.println("Task 1 executed by: "+Thread.currentThread().getName());
            return "India";
        });
        //2.thenApply() - process result synchronously
        CompletableFuture<String> future2 = future1.thenApply(result ->{
            System.out.println("Task 2 executed by: "+Thread.currentThread().getName());
            return result + "Vs";
        });
        //3.thenApplyAsync - process result asynchronously
        CompletableFuture<String> future3 = future2.thenApplyAsync(result ->{
            System.out.println("Task 3 executed by: "+Thread.currentThread().getName());
            return result + "Australia";
        });
        //4.thenCompose - chaining
        CompletableFuture<String> future4 = future3.thenCompose(result ->{
            System.out.println("task 4 executed by: "+Thread.currentThread().getName());
            return CompletableFuture.supplyAsync(()->result + "- chained task");
        });
        //5.thenAccept() - End of chain, process result without returning anything
        future4.thenAccept(result ->{
            System.out.println("task 4 executed by: "+Thread.currentThread().getName());
            System.out.println("final result: "+result);
        });
        //6.thenCombine() - combine two completable future
        CompletableFuture<Integer> future5 = CompletableFuture.supplyAsync(()->5);
        CompletableFuture<Integer> future6 = CompletableFuture.supplyAsync(()->6);

        CompletableFuture<Integer> combinedFuture = future5.thenCombine(future6,(result1,result2)->{
            System.out.println("Task 5 executed by: "+Thread.currentThread().getName());
            return result1 * result2;
        });
        System.out.println("Product of two futures : "+combinedFuture.get());
    }
}
