package Q2;

public class TestingSync  {

    static void main(String[] args) throws InterruptedException {


        bank ac = new bank(5000);
        System.out.println("The money is "+ac.getBalance());
        Thread t1 = new Thread(new WithDrawMoney(ac));
        Thread t2 = new Thread(new WithDrawMoney(ac));
        Thread t3 = new Thread(new DepositMoney(ac));
        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t2.join();


        System.out.println("The balance is "+ac.getBalance());


    }

}
