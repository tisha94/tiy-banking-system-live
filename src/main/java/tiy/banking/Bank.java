package tiy.banking;

import java.util.HashMap;

/**
 * Created by localdom on 5/6/2016.
 */
public class Bank {
    private static int currentBankID = 100;

    private String bankID;
    public final static String BANKID_PREFIX = "TIYBANK";
    private String bankName;
    private String bankStreetAddress;
    private HashMap<String, Customer> bankCustomers;

    public Bank() {
        System.out.println("Bank()");
        bankCustomers = new HashMap<String, Customer>();
    }

    public void save() {
        System.out.println("save()");
    }

    public static Bank retrieve() {
        return null;
    }

    public void addCustomer(Customer customer) {
        System.out.println("addCustomer()");
    }

    public void addBankAccountForCustomer(BankAccount account, Customer customer) {
        System.out.println("addBankAccountForCustomer()");
    }

    public double getTotalMoneyAtBank() {
        return -1;
    }

    public static int nextBankID() {
        return currentBankID++;
    }

    public HashMap<String, Customer> getBankCustomers() {
        return bankCustomers;
    }

    public void setBankCustomers(HashMap<String, Customer> bankCustomers) {
        this.bankCustomers = bankCustomers;
    }

    public static int getCurrentBankID() {
        return currentBankID;
    }

    public static void setCurrentBankID(int currentBankID) {
        Bank.currentBankID = currentBankID;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public static String getBankidPrefix() {
        return BANKID_PREFIX;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankStreetAddress() {
        return bankStreetAddress;
    }

    public void setBankStreetAddress(String bankStreetAddress) {
        this.bankStreetAddress = bankStreetAddress;
    }
}
