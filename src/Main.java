import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        Card card_2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        Card card_3 = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(card_1);
        cards.add(card_2);
        cards.add(card_3);

        Deck deck = new Deck(cards);

//        System.out.println(card_1.getQuestion());
//        System.out.println(card_1.getAnswer());
//        System.out.println(card_1.getCategory());

        Turn turn_1 = new Turn("Juneau", card_1);

        Round round_1 = new Round(deck);

//        System.out.println(turn_1.getGuess());
//        System.out.println(turn_1.getCard());
//
//        System.out.println(turn_1.getCard().getQuestion());
//
//        System.out.println(turn_1.isCorrectGuess());
//
//        System.out.println(turn_1.guessFeedback());
    //    System.out.println(deck.getCards());
//        System.out.println(deck.cardCount());

        System.out.println(deck.cardsInCategory("STEM"));

        // System.out.println(round_1.getDeck());
        System.out.println(round_1.getTurnsTaken());
        // System.out.println(round_1.currentCard());

    }
}
