import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();

    Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList allCards() {
        return this.cards;
    }

    public ArrayList formattedAllCards() {
        ArrayList<String> cardAndDetails = new ArrayList<String>();

        this.cards.forEach(card -> {
            cardAndDetails.add(String.format("%s question= %s, answer= %s, category= %s", card.toString(),
                    card.getQuestion(), card.getAnswer(), card.getCategory()));
        });
        return cardAndDetails;
    }

    public String getCards() {
        ArrayList<String> cardAndDetails = new ArrayList<String>();

        this.cards.forEach(card -> {
            cardAndDetails.add(String.format("%s question= %s, answer= %s, category= %s", card.toString(),
                    card.getQuestion(), card.getAnswer(), card.getCategory()));
        });
        return cardAndDetails.toString();
    }

    public Integer cardCount() {
        return this.cards.size();
    }

    public String cardsInCategory(String category) {
        List<Card> categoryCards = new ArrayList<Card>();
        List<String> newCategoryCards = new ArrayList<String>();

        categoryCards = cards.stream().filter(card -> card.getCategory() == category).collect(Collectors.toList());

        categoryCards.forEach(card -> {
            newCategoryCards.add(String.format("%s question= %s, answer= %s, category= %s", card.toString(),
                    card.getQuestion(), card.getAnswer(), card.getCategory()));
        });
        return newCategoryCards.toString();
    }

    public Card firstCard() {
        return this.cards.get(0);
    }
}
