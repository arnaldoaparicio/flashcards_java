import java.util.ArrayList;
public class Round {

    private Deck deck;
    private ArrayList<Turn> turnsTaken = new ArrayList<Turn>();

    Round(Deck deck) {
        this.deck = deck;
    }

    public String getDeck() {
        return deck.toString();
    }
    
    public String getTurnsTaken() {
        return turnsTaken.toString();
    }

    public String currentCard() {
        return deck.formattedAllCards().get(0).toString();
    }

    public Integer turnsCount() {
        return this.turnsTaken.size();
    }

    // public void takeTurn(String guess) {

    //     Turn turn = new Turn(guess, deck.allCards().get(0).cast(Card));
    //     turnsTaken.add(turn);
    // }
}
