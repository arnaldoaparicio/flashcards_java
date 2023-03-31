import java.util.ArrayList;
import java.util.stream.*;
import java.util.List;
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

    public String latestCardFeedback() {
        return turnsTaken.get(turnsTaken.size()-1).guessFeedback();
    }

    public Integer numberCorrect() {
        List<Turn> correctTurns = new ArrayList<Turn>();
        correctTurns = turnsTaken.stream().filter(turn -> turn.guessFeedback() == "Correct!").collect(Collectors.toList());
        return correctTurns.size();
    }

    public Float percentCorrect() {
        int percent = numberCorrect() / turnsTaken.size();
        float percentFloat = (float) percent;
        return percentFloat * 100;
    }

    public Integer numberCorrectByCategory(String category) {
        List<Turn> correctTurns = new ArrayList<Turn>();
        List<Turn> categoryCorrect = new ArrayList<Turn>();

        correctTurns = turnsTaken.stream().filter(turn -> turn.guessFeedback() == "Correct!")
                .collect(Collectors.toList());
        
        for(int index = 0; index < correctTurns.size(); index++) {
            if (correctTurns.get(index).getCard().getCategory() == category) {
                categoryCorrect.add(correctTurns.get(index));
            }
        }
        return categoryCorrect.size();
    }
}
