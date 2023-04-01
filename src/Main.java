import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card card_1 = new Card("What is 5 + 5?", "10", "STEM");
        Card card_2 = new Card("What is Mike's middle name?", "nobody knows", "Turing Staff");
        Card card_3 = new Card("What is Rachel's favorite animal?", "panda", "Turing Staff");
        Card card_4 = new Card("What cardboard cutout lives at Turing?", "Justin Bieber", "Pop Culture");

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(card_1);
        cards.add(card_2);
        cards.add(card_3);
        cards.add(card_4);

        Deck deck = new Deck(cards);

        Round round = new Round(deck);

        String dash = "-";
        String newDash = dash.repeat(44);

        
        System.out.println("Welcome! You're playing with " + cards.size() + " cards.");
        System.out.println(newDash);
        
        while(cards.size() > 0) {
            System.out.println(round.card().getQuestion());
            String guess = scanner.nextLine();
            round.takeTurn(guess);
            System.out.println(round.latestCardFeedback());
        }

        
        System.out.println("****** Game Over! ******");
        System.out.println("You have " + round.numberCorrect() + " out of " + round.turnsCount());
        System.out.println("STEM - " + round.percentCorrectByCategory("STEM") + " correct " + "(" + round.numberCorrectByCategory("STEM") + " correct)");
        System.out.println("Turing Staff - " + round.percentCorrectByCategory("Turing Staff") + " correct " + "("
                + round.numberCorrectByCategory("Turing Staff") + " correct)");
        System.out.println("Pop Culture - " + round.percentCorrectByCategory("Pop Culture") + " correct " + "("
                + round.numberCorrectByCategory("Pop Culture") + " correct)");
        
        scanner.close();
        ////////////////////////////////////////////////////////////////////////

    //     Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
    //     Card card_2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
    //     Card card_3 = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");

    //     ArrayList<Card> cards = new ArrayList<Card>();
    //     cards.add(card_1);
    //     cards.add(card_2);
    //     cards.add(card_3);

    //     Deck deck = new Deck(cards);
    //     Turn turn_1 = new Turn("Juneau", card_1);
        
    //     Round round_1 = new Round(deck);

    //    System.out.println(card_1.getQuestion());
    //    System.out.println(card_1.getAnswer());
    //    System.out.println(card_1.getCategory());


    //    System.out.println(turn_1.getGuess());
    //    System.out.println(turn_1.getCard());

    //    System.out.println(turn_1.getCard().getQuestion());

    //    System.out.println(turn_1.isCorrectGuess());

    //    System.out.println(turn_1.guessFeedback());
    //    System.out.println(deck.getCards());
    //    System.out.println(deck.cardCount());

    //     System.out.println(deck.cardsInCategory("Geography"));

    //     System.out.println(round_1.getDeck());
    //     System.out.println(round_1.getTurnsTaken());
    //     System.out.println("Current card: " + round_1.currentCard());
    //     System.out.println("Number of turns: " + round_1.turnsCount());
    //     System.out.println("Number correct: " + round_1.numberCorrect());
    //     round_1.takeTurn(turn_1.getGuess());
    //     System.out.println("All turns taken: " + round_1.getTurnsTaken());
    //     System.out.println("All cards: " + deck.formattedAllCards());
    //     System.out.println("Current card: " + round_1.currentCard());
    //     round_1.takeTurn("Venus");
    //     round_1.takeTurn("North north west");
    //     System.out.println("Number of turns: " + round_1.turnsCount());
    //     System.out.println("Latest card feedback: " + round_1.latestCardFeedback());
    //     System.out.println("Number correct: " + round_1.numberCorrect());
    //     System.out.println("Percent correct: " + round_1.percentCorrect());
    //     System.out.println("Number correct by category: " + round_1.numberCorrectByCategory("Geography"));
    //     System.out.println("Percent correct by category: " + round_1.percentCorrectByCategory("Geography"));

    }
}
