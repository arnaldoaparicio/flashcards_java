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
        ArrayList<String> formattedTurnsTaken = new ArrayList<String>();
        
        turnsTaken.forEach(turn -> {
            formattedTurnsTaken.add(String.format("%s %s question= %s, answer= %s, category= %s", 
            turn.toString(), turn.getCard(), turn.getCard().getQuestion(), turn.getCard().getAnswer(), turn.getCard().getCategory()));
        });
        return formattedTurnsTaken.toString();
    }

    public String currentCard() {
        return deck.formattedAllCards().get(0).toString();
    }

    public Integer turnsCount() {
        return this.turnsTaken.size();
    }

    public void takeTurn(String guess) {
        Turn turn = new Turn(guess, deck.firstCard());
        turnsTaken.add(turn);
        deck.allCards().remove(0);
    }
}
