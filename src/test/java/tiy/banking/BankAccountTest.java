package tiy.banking;

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
    }
}