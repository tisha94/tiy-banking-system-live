package tiy.banking;

import java.util.HashMap;

/**
 * Created by localdom on 5/6/2016.
 */
public class Customer extends Person {
    private HashMap<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();

    public Customer() {
        super();
        System.out.println("Customer()");
    }

    public Customer(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
        System.out.println("Customer(firstName, lastName, emailAddress)");
    }

    public void addBankAccount(BankAccount bankAccount) {
        System.out.println("addBankAccount()");
        bankAccounts.put(bankAccount.getAccountID(), bankAccount);
    }

    public double getTotalAccountBalance() {
        System.out.println("getTotalAccountBalance()");
        double totalBalance = 0.0;
        for (BankAccount currentAccount : bankAccounts.values()) {
            totalBalance += currentAccount.getAccountBalance();
        }

        return totalBalance;
    }

    public BankAccount getBankAccountByID(String accountID) {
        System.out.println("getAccountByID()");
        return bankAccounts.get(accountID);
    }

    public HashMap<String, BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(HashMap<String, BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
