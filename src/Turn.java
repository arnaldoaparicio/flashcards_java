public class Turn {

    private String guess;
    private Card card;

    Turn(String guess, Card card) {
        this.guess = guess;
        this.card = card;
    }

    public String getGuess() {
        return this.guess;
    }

    public Card getCard() {
        return this.card;
    }

    public boolean isCorrectGuess() {
        if (guess.toLowerCase().equals(card.getAnswer().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public String guessFeedback() {
        if (isCorrectGuess() == true) {
            return "Correct!";
        } else {
            return "Incorrect!";
        }
    }
}
