/**
 * Class for representing a deck of playing cards
 * A deck holds 52 playing cards (54 including Joker)
 */
public class Deck {

    /**
     * We use simple array to hold our cards
     */
    private final Card[] cards;
    private int cardsInDeck;

    /**
     * Constructor
     * We create a deck of 54 cards (including two jokers)
     */
    public Deck() {
        cardsInDeck = 0;
        cards = new Card[54];

        cards[0] = new Card(Suit.JOKER, Value.JOKER);
        cardsInDeck += 1;

        cards[1] = new Card(Suit.JOKER, Value.JOKER);
        cardsInDeck += 1;

        // First two cards are jokers
        int k = 2;
        for(Suit s : Suit.values()) {
            for(Value v: Value.values()) {
                if(v == Value.JOKER || s == Suit.JOKER) continue;
                cards[k] = new Card(s, v);
                cardsInDeck += 1;
                k += 1;
            }
        }
    }


    /**
     *
     * @return Card at the top of the deck
     */
    public Card getTop() throws EmptyDeckException {
        if(cardsInDeck > 0) {
            cardsInDeck -= 1;
            return cards[cardsInDeck];
        }
        throw new EmptyDeckException();
    }

    /**
     *
     * @return int amount of cards remaining in deck
     */
    public int getNumberCardsInDeck() {
        return cardsInDeck;
    }

    /**
     *
     * @return String for printing
     */
    public String toString() {
        StringBuilder rtn = new StringBuilder();
        for(Card c: cards) {
            rtn.append(c + "\n");
        }
        return rtn.toString();

    }

    /**
     * Runnable main for the program
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);

    }

}
