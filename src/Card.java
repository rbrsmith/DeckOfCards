/**
 * Class representing a playing card
 * Card usually has a value between 1-14
 * and holds one of four possible suits
 */
public class Card {

    private final Suit suit;
    private final Value value;

    /**
     *
     * @param s Suit enum of the card
     * @param v Value enum of the card
     */
    public Card(Suit s, Value v) {
        suit = s;
        value = v;
    }

    /**
     *
     * @return Suit enum of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     *
     * @return Value enum of the card
     */
    public Value getValue() {
        return value;

    }

    /**
     *
     * @return String for printing
     */
    @Override
    public String toString() {
        return getValue() + " of " + getSuit();
    }




}
