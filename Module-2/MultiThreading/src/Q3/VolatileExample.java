package Q3;

public class VolatileExample {

    static volatile boolean flag = false;

    static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {


            System.out.println("Thread started reading ");
            while (!flag) {

            }
            System.out.println("Flag change detected ");
        });




        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag = true;
            System.out.println("Thread update flag to true ");
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
