package Q5;
import java.util.concurrent.*;

public class CallableDemo implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {

        System.out.println("Printing from callable ");
        return 145;
    }

    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CallableDemo cd = new CallableDemo();
        Future<Integer> future =executorService.submit(cd);

        Integer result = future.get();
        System.out.println("Result of callable "+ result);

        executorService.shutdown();
    }
}
