import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();

    Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String getCards() {
        return this.cards.toString();
    }
}
