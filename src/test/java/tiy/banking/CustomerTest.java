package tiy.banking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localdom on 5/6/2016.
 */
public class CustomerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    // make sure the Customer() constructor calls its base class constructor
    @Test
    public void testDefaultConstructor() throws Exception {
        Customer testCustomer = new Customer();
        assertEquals(Customer.DEFAULT_FIRST_NAME, testCustomer.getFirstName());
        assertEquals(Customer.DEFAULT_LAST_NAME, testCustomer.getLastName());
        assertEquals(Customer.DEFAULT_EMAIL_ADDRESS, testCustomer.getEmailAddress());
    }

    @Test
    public void testCustomerConstructor() throws Exception {
        Customer testCustomer = new Customer("Test", "Tester", "tester@tsl.com");
        assertEquals("Test", testCustomer.getFirstName());
        assertEquals("Tester", testCustomer.getLastName());
        assertEquals("tester@tsl.com", testCustomer.getEmailAddress());
    }

    @Test
    public void testAddBankAccount() throws Exception {
        Customer testCustomer = new Customer("Test", "Tester", "tester@tsl.com");
        String accountID = "TestAccount 1";
        double depositAmount = 100.00;
        // I know I can create a bank account with no issues because of the
        // BankAccountTest unit test class
        BankAccount testBankAccount = new BankAccount(accountID, 100.00);

        testCustomer.addBankAccount(testBankAccount);

        // validate the customer now has exactly one bank account
        assertEquals(1, testCustomer.getBankAccounts().size());

        // validate that we can retrieve the bank account by name from the customer
        BankAccount retrievedAccount = testCustomer.getBankAccountByID(accountID);
        assertEquals(accountID, retrievedAccount.getAccountID());
        assertEquals(depositAmount, retrievedAccount.getAccountBalance(), 0.0);

        // validate that my total balance for the customer is correct after
        // adding just a single account
        double totalCustomerMoney = testCustomer.getTotalAccountBalance();
        assertEquals(depositAmount, totalCustomerMoney, 0.0);
    }

    @Test
    public void testTotalAccountBalance() throws Exception {
        Customer testCustomer = new Customer("Test", "Tester", "tester@tsl.com");
        double amount1 = 100.00;
        double amount2 = 300.00;
        BankAccount testAccount1 = new BankAccount("Test Account 1", amount1);
        BankAccount testAccount2 = new BankAccount("Test Account 2", amount2);

        testCustomer.addBankAccount(testAccount1);
        testCustomer.addBankAccount(testAccount2);

        double expectedTotal = amount1 + amount2;

        assertEquals(expectedTotal, testCustomer.getTotalAccountBalance(), 0.0);
    }

    @Test
    public void testGetBankAccountByID() throws Exception {

    }
}