package tiy.banking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localdom on 5/6/2016.
 */
public class BankTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddCustomer() throws Exception {

    }

    @Test
    public void testSave() throws Exception {
        Bank myBank = new Bank();
        // do things to the bank ...
        myBank.save();

        Bank retrievedBank = Bank.retrieve();

        assertEquals(myBank.getBankID(), retrievedBank.getBankID());
        assertEquals(myBank.getBankName(), retrievedBank.getBankName());
    }

    @Test
    public void testAddBankAccountForCustomer() throws Exception {

    }

    @Test
    public void testGetTotalMoneyAtBank() throws Exception {

    }

    @Test
    public void testNextBankID() throws Exception {

    }
}