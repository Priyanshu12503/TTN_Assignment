package Q2;

import java.util.Optional;

public class DepositMoney implements Runnable{

    bank account;

    public DepositMoney(bank account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("The amount of rs 505 is deposited in account ");
        account.depositMoney(505);
    }

}
