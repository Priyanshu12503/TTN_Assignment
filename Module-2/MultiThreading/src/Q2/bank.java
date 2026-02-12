package Q2;

public class bank {

    private int balance;

    public bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void withdrawMoney(int amount){

        if(balance>amount)
        {
            System.out.println("The amount of "+amount+ " rs is withdrawn by thread"+ Thread.currentThread().getName());
            balance = balance-amount;
        }
        else{
            System.out.println("Thread "+Thread.currentThread().getName()+" is trying to withdraw but the money is insufficient");
        }
    }

    public void depositMoney(int a){
        synchronized (this){
            if(a > 0)
            balance = balance+a;
            else
                System.out.println("Can not deposit negative balance ");
        }
    }
}
