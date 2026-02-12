package Q6;

import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockTesting {

    static ReentrantLock l1 = new ReentrantLock();
    static ReentrantLock l2 = new ReentrantLock();

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            acquireLocks(l1, l2);
            try {
                System.out.println(Thread.currentThread().getName() + " acquired l1 and l2");
            } finally {
                l2.unlock();
                l1.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            acquireLocks(l2, l1);

            try {
                System.out.println(Thread.currentThread().getName() + " acquired l2 and l1");
            }
            finally {

                l1.unlock();
                l2.unlock();
            }
        });
    t1.start();
    t2.start();
    }

    private static void acquireLocks(ReentrantLock l1, ReentrantLock l2) {

        while (true) {
            if (l1.tryLock()) {
                if (l2.tryLock()) {
                    return;
                } else {
                    l1.unlock();
                }
            }
        }
    }

}
