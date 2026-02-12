package Q9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class ShutdownVsNow {

    static void main(String[] args) throws InterruptedException {

        ExecutorService executorOne = Executors.newFixedThreadPool(2);

        for(int i =1;i<=5;i++)
        {
            int taskId = i;
            executorOne.submit(()->{
                try {
                    Thread.sleep(1000);
                    System.out.println("Task "+taskId+ " executed by "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    System.out.println("Task "+ taskId+ "interrupted");
                }
            });

        }
        executorOne.shutdown();
        Thread.sleep(5000);
        Function
        ExecutorService executorTwo = Executors.newFixedThreadPool(2);

        for(int i =1;i<=5;i++)
        {
            int taskId = i;
            executorTwo.submit(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + taskId + " executed by "
                            + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " interrupted");
                }
            });
        }

        executorTwo.shutdownNow();

    }

}
