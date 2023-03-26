public class Main {

    public static void main(String[] args) {
        Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        Card card_2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        Card card_3 = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");

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
