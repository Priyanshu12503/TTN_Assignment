package Q4;

import java.util.Collections;
import java.util.concurrent.Callable;

public class DeadlockTesting extends Thread {

    static void main(String[] args) {
        DemoClass d1 = new DemoClass();
        DemoClass d2 = new DemoClass();

        Thread t1 = new Thread(() -> {
            synchronized (d1) {
                System.out.println(Thread.currentThread().getName() + " has taken lock on d1 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (d2) {
                    System.out.println(Thread.currentThread().getName() + " has taken lock on d2 ");
                }
            }
        });
        Thread t2 = new Thread(()->
        {
            synchronized (d2) {
                System.out.println(Thread.currentThread().getName() + "has taken lock on d2 ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (d1) {
                    System.out.println(Thread.currentThread().getName() + "has taken lock on d1");
                }
            }
        });

        t1.start();
        t2.start();


    }
    Callable<Integer> c = () -> {
        return 10 + 20;
    };

}