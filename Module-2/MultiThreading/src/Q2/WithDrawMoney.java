package Q2;

public class WithDrawMoney implements Runnable {

    public bank account;

    public WithDrawMoney(bank account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdrawMoney(500);



    }
}
