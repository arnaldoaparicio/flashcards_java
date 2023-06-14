import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card card_1 = new Card("What is the first name of the main character in Silent Hill 3?", "heather", "Video Games");
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
        System.out.println("Video Games - " + round.percentCorrectByCategory("Video Games") + "% correct " + "(" + round.numberCorrectByCategory("Video Games") + " correct)");
        System.out.println("Turing Staff - " + round.percentCorrectByCategory("Turing Staff") + "% correct " + "("
                + round.numberCorrectByCategory("Turing Staff") + " correct)");
        System.out.println("Pop Culture - " + round.percentCorrectByCategory("Pop Culture") + "% correct " + "("
                + round.numberCorrectByCategory("Pop Culture") + " correct)");
        
        scanner.close();
    }
}
