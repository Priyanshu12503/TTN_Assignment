package Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTesting {

    static void main(String[] args) throws InterruptedException {

        List<Runnable> tasks = new ArrayList<>();

        for(int i = 1;i<=5;i++)
        {
            tasks.add(new Task(i));
        }

        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        submitTasks(singleExecutor,tasks);

        ExecutorService fixedExecutor = Executors.newFixedThreadPool(3);
        submitTasks(fixedExecutor, tasks);

        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        submitTasks(cachedExecutor, tasks);
    }

    private static void submitTasks(ExecutorService executor, List<Runnable> tasks) throws InterruptedException {
   for(Runnable r : tasks){
       executor.submit(r);
   }

   executor.shutdown();
   executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("All task are completed " +executor);


    }
}
