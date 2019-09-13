public class Account {

    private double balance;
    public Account{

    }

    public boolean withdraw(double amount){
            balance -= amount;
    }

    public double deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }


}
