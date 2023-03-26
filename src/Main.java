public class Main {

    public static void main(String[] args) {
        Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");

        System.out.println(card_1.getQuestion());
        System.out.println(card_1.getAnswer());
        System.out.println(card_1.getCategory());

        Turn turn_1 = new Turn("Juneau", card_1);

        System.out.println(turn_1.getGuess());
        System.out.println(turn_1.getCard());

        System.out.println(turn_1.getCard().getQuestion());

        System.out.println(turn_1.isCorrectGuess());

        System.out.println(turn_1.guessFeedback());
    }
}
