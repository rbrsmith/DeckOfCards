/**
 * Simple Exception throw when a deck
 * contains no cards
 */
public class EmptyDeckException extends Exception {

    public EmptyDeckException() {
        super("Deck is out of cards");
    }
}
