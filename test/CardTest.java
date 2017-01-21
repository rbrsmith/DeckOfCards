import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for Card
 */
public class CardTest {

    private Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(Suit.SPADES, Value.ACE);
    }

    @After
    public void tearDown() throws Exception {
        card = null;
    }

    @Test
    public void getSuit() throws Exception {
        assertEquals(card.getSuit(), Suit.SPADES);

    }

    @Test
    public void getValue() throws Exception {
        assertEquals(card.getValue(), Value.ACE);
    }

}