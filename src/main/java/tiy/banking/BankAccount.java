package tiy.banking;

/**
 * Created by localdom on 5/6/2016.
 */
public class BankAccount {
    private String accountID;
    private double accountBalance;

    public BankAccount() {
        System.out.println("BankAccount()");
    }

    public void deposit(double amount) {
        System.out.println("deposit()");
        accountBalance = accountBalance + amount;
    }

    public void withdraw(double amount) {
        System.out.println("withdraw()");
        accountBalance = accountBalance - amount;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
