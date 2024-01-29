package tests;
import model.CardLogic;
import model.Card;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test1 {

	private Card testCard;

    @Before
    public void setUp() {
        // Initialize a Card object for testing
        testCard = new Card(123456789, "Test User", 1000.0);
    }

    @Test
    public void testWithdrawValidAmount() {
        CardLogic.withdraw(testCard, 500.0);
        assertEquals(500.0, testCard.getBalance(), 0.001); // Balance should be 500.0 after withdrawal
    }

    @Test
    public void testWithdrawInvalidAmount() {
        CardLogic.withdraw(testCard, -100.0);
        assertEquals(1000.0, testCard.getBalance(), 0.001); // Balance should remain unchanged
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        CardLogic.withdraw(testCard, 1500.0);
        assertEquals(1000.0, testCard.getBalance(), 0.001); // Balance should remain unchanged
    }

}