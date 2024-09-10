import Account.Account;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;
    private static double amount;

    @BeforeClass
    public static void setupClass() {
        amount = 100.0;
    }

    @AfterClass
    public static void teardownClass() {
        amount = 0.0;
    }

    @Before
    public void setup() {
        account = new Account();
    }

    @After
    public void teardown() {
        account = null;
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {
        account.deposit(amount);
        assertEquals(amount, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSuccess() {
        account.deposit(amount);
        double withdrawnAmount = account.withdraw(amount);
        assertEquals(amount, withdrawnAmount, 0.001);
        assertEquals(amount - amount, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawFailure() {
        account.deposit(amount);
        double withdrawnAmount = account.withdraw(150.0);
        assertEquals(0.0, withdrawnAmount, 0.001);
        assertEquals(amount, account.getBalance(), 0.001);
    }

    @Test
    public void testMultipleDeposits() {
        account.deposit(amount);
        account.deposit(amount);
        assertEquals(amount*2, account.getBalance(), 0.001);
    }

    @Test
    public void testMultipleWithdrawals() {
        account.deposit(amount);
        account.withdraw(amount/2);
        account.withdraw(amount/4);
        assertEquals(25, account.getBalance(), 0.001);
    }
}


