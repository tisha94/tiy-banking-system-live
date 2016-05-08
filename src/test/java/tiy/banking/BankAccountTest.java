package tiy.banking;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localdom on 5/6/2016.
 */
public class BankAccountTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCustomConstructor() throws Exception {
        double depositAmount = 100.00;
        BankAccount testAccount = new BankAccount("Test Account", depositAmount);
        assertEquals("Test Account", testAccount.getAccountID());
        assertEquals(depositAmount, testAccount.getAccountBalance(), 0.0);
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        BankAccount testAccount = new BankAccount();
        assertEquals(BankAccount.DEFAULT_ACCOUNT_ID, testAccount.getAccountID());
        assertEquals(0.0, testAccount.getAccountBalance(), 0.0);
    }

    @Test
    public void testDeposit() throws Exception {
        BankAccount testAccount = new BankAccount();
        double existingAccountBalance = testAccount.getAccountBalance();
        double amount = 20.0;
        testAccount.deposit(amount);
        assertEquals(amount + existingAccountBalance, testAccount.getAccountBalance(), 0.0);
    }

    @Test
    public void testDepositAndWithdraw() throws Exception {
        BankAccount testAccount = new BankAccount();
        double existingAccountBalance = testAccount.getAccountBalance();
        double amount = 20.0;
        testAccount.deposit(amount);
        testAccount.withdraw(amount);
        assertEquals(existingAccountBalance, testAccount.getAccountBalance(), 0.0);
    }

    @Test
    public void testWithdraw() throws Exception {
        BankAccount testAccount = new BankAccount();
        double existingAccountBalance = testAccount.getAccountBalance();
        double amountToDeposit = 1000.00;
        double amountToWithdraw = 200.00;
        testAccount.deposit(amountToDeposit);
        testAccount.withdraw(amountToWithdraw);
        double expectedBalance = existingAccountBalance + amountToDeposit - amountToWithdraw;
        assertEquals(expectedBalance, testAccount.getAccountBalance(), 0.0);
    }
}