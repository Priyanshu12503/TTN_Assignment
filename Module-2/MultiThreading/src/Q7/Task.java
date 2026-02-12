package Q7;

public class Task implements Runnable{

    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(
                "Task "+taskId +" executed by "+Thread.currentThread().getName()
        );
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
