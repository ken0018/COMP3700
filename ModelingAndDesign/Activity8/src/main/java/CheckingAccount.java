public class CheckingAccount extends Account{

    double balance;
    double overdraftFee;
    boolean overDraft = false;

    public CheckingAccount(){
        balance = 0;
    }

    public double withdraw(double amount){
        balance -= amount;
        if(balance < 0){
            overDraft = true;
        }
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void charge(){
        if(overDraft){
            balance -= overdraftFee;
        }
    }




}
