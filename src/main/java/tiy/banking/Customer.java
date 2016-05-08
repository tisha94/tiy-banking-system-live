package tiy.banking;

import java.util.HashMap;

/**
 * Created by localdom on 5/6/2016.
 */
public class Customer extends Person {
    private HashMap<String, BankAccount> bankAccounts;

    public Customer() {
        System.out.println("Customer()");
    }

    public void addBankAccount() {
        System.out.println("addBankAccount()");
    }

    public long getTotalAccountBalance() {
        System.out.println("getTotalAccountBalance()");
        return -1;
    }

    public BankAccount getBankAccountByID(String accountID) {
        System.out.println("getAccountByID()");
        return null;
    }

    public HashMap<String, BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(HashMap<String, BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
