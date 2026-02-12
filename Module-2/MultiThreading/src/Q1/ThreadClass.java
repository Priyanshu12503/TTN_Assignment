package Q1;

public class ThreadClass extends Thread{

    @Override
    public void run() {

        for (int i = 0;i<5;i++)
        {
            System.out.println("The running thread is "+getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
