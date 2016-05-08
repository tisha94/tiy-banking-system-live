package tiy.banking;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by localdom on 5/6/2016.
 */
public class Bank {
    private static int currentBankID = 100;

    private String bankID;
    public final static String BANKID_PREFIX = "TIYBANK";
    private String bankName;
    private String bankStreetAddress;
    private HashMap<String, Customer> bankCustomers = new HashMap<String, Customer>();
    private static String fileName;

    public Bank() {
        System.out.println("Bank()");
        initBank();
    }

    public void initBank() {
        this.bankID = BANKID_PREFIX + currentBankID;
        currentBankID++;
        fileName = bankID + ".json";
    }

    public Bank(String bankName, String bankAddress) {
        this.bankName = bankName;
        this.bankStreetAddress = bankAddress;
        initBank();;
    }

    public void save() {
        System.out.println("save()");

        try {
            JsonSerializer jsonSerializer = new JsonSerializer().deep(true);
            String jsonString = jsonSerializer.serialize(this);

            System.out.println("JSON = ");
            System.out.println(jsonString);

            File sampleFile = new File(fileName);
            FileWriter jsonWriter = new FileWriter(sampleFile);
            jsonWriter.write(jsonString);
            jsonWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
            // TODO: add better exception handling here ...
        }

    }

    public static Bank retrieve(String bankID) {
        try {
            String fileToRetrieve = bankID + ".json";
            Scanner fileScanner = new Scanner(new File(fileToRetrieve));
            fileScanner.useDelimiter("\\Z"); // read the input until the "end of the input" delimiter
            String fileContents = fileScanner.next();
            JsonParser bankParser = new JsonParser();

            Bank newBank = bankParser.parse(fileContents, Bank.class);
            return newBank;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            // TODO Implement better exception handling here
            return null;
        }
    }

    public void addCustomer(Customer customer) {
        System.out.println("addCustomer()");
        bankCustomers.put(customer.getEmailAddress(), customer);
    }

    public void addBankAccountForCustomer(BankAccount account, Customer customer) {
        System.out.println("addBankAccountForCustomer()");
        customer.addBankAccount(account);
    }

    public double getTotalMoneyAtBank() {
        double totalBalance = 0.0;
        for (Customer customer : bankCustomers.values()) {
            totalBalance += customer.getTotalAccountBalance();
        }

        return totalBalance;
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
