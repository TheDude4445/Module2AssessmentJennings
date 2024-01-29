package tests;
import model.CardLogic;
import model.Card;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test2 {

	private Card testCard;

    @Before
    public void setUp() {
        // Initialize a Card object for testing
        testCard = new Card(123456789, "Test User", 1000.0);
    }


    @Test
    public void testDepositValidAmount() {
        CardLogic.deposit(testCard, 300.0);
        assertEquals(1300.0, testCard.getBalance(), 0.001); // Balance should be 1300.0 after deposit
    }

    @Test
    public void testDepositInvalidAmount() {
        CardLogic.deposit(testCard, -50.0);
        assertEquals(1000.0, testCard.getBalance(), 0.001); // Balance should remain unchanged
    }

	@Test
    public void testCheckBalance() {
        double expectedOutput = 1000.0;
        double actualBalance = CardLogic.checkBalance(testCard);
        assertEquals(expectedOutput, actualBalance, 0.001);
    
    }
}