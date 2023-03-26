public class Main {

    public static void main(String[] args) {
        Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");

        System.out.println(card_1.getQuestion());
        System.out.println(card_1.getAnswer());
        System.out.println(card_1.getCategory());
    }
}
