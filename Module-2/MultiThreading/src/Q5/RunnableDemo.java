package Q5;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing this from runnable");

    }

    static void main(String[] args) {
        Thread t1 = new Thread(new RunnableDemo());
        t1.start();

    }
}
