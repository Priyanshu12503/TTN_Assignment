package Q1;

public class TestingThreads {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new RunnableInterfaceClass());

        ThreadClass t2 = new ThreadClass();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Main thread is terminated ");


    }

}
