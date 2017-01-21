import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for Deck
 */
public class DeckTest {


    private Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @After
    public void tearDown() throws Exception {
        deck = null;
    }

    @Test
    public void getTop() throws Exception {
        int cardCount = 0;
        while(deck.getNumberCardsInDeck() != 0) {
            Card card = deck.getTop();
            cardCount += 1;
        }
        assertEquals(cardCount, 54);
    }


}