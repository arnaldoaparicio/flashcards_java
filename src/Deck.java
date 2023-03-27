import java.util.ArrayList;
import java.util.stream.*;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();

    Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String getCards() {
//        this.cards.forEach(card -> {
//            System.out.printf("%s question= %s , answer= %s , category= %s", card.toString(), card.getQuestion(), card.getAnswer(), card.getCategory());
//        });
        return this.cards.toString();
    }

    public Integer cardCount() {
        return this.cards.size();
    }

    public String cardsInCategory(String category) {
        return cards.stream().filter(card -> card.getCategory() == category).collect(Collectors.toList()).toString();
    }

}
