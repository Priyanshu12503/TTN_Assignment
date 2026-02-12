package Q1;

import static java.lang.Thread.sleep;

public class RunnableInterfaceClass implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<5;i++)
        {
            System.out.println("The current running thread is "+Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

