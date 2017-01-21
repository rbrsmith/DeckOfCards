import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;

import java.util.HashMap;
import java.util.Map;

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
            deck.getTop();
            cardCount += 1;
        }
        assertEquals(cardCount, 54);
        try {
            deck.getTop();
            assert(false);
        } catch(EmptyDeckException e) {
            assert(true);
        }
    }


    @Test
    /**
     * Simple shuffle test - shuffle new deck 104 times
     * odds are that the cards at the top of the deck
     * is only the same place max twice
     */
    public void simpleShuffleTest() throws Exception {
        Map<Card, Integer> countMap = new HashMap<>();
        Integer numerTimeSeen;
        Card topCard;
        int i = 0;
        while(i < 108) {
            deck.shuffle();
            topCard = deck.getTop();
            numerTimeSeen = countMap.get(topCard);
            if (numerTimeSeen == null) countMap.put(topCard, 0);
            else countMap.put(topCard, numerTimeSeen + 1);
            deck = new Deck();
            i += 1;
        }

        // If the same card is constantly popped - we are not shuffling
        assertTrue(countMap.size() > 1);

        // Find the average number of times a card appears
        // at the top of the deck
        int average = 0;
        for(Integer count : countMap.values()) {
            average += count;
        }
        average = (average / countMap.size());
        assertTrue(average < 2);
    }


}