import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class RoundTest {
  private final Card card_1 = new Card("What is the first name of the main character in Silent Hill 3?", "heather",
      "Video Games");
  private final Card card_2 = new Card("What is Mike's middle name?", "nobody knows", "Turing Staff");
  private final Card card_3 = new Card("What is Rachel's favorite animal?", "panda", "Turing Staff");

  private final ArrayList<Card> cards = new ArrayList<Card>();

  private final Deck deck = new Deck(cards);

  private final Round round = new Round(deck);

  @BeforeEach
  void addCards() {
    cards.add(card_1);
    cards.add(card_2);
    cards.add(card_3);
  }

  @Test
  void emptyTurnsArray() {
    // Round has not started yet
    assertEquals(0, round.getTurns().size());
  }

  @Test
  void oneTurnArrayElement() {
    round.takeTurn("heather");

    assertEquals(1, round.getTurns().size());
  }

  @Test
  void currentCard1() {
    assertEquals(card_1.toString() + " question= " + card_1.getQuestion()
        + ", answer= " + card_1.getAnswer() + ", category= " + card_1.getCategory(),
        round.currentCard());
  }

  @Test
  void currentCard2() {
    // Check to see that current card is on 'card_2'
    round.takeTurn("heather");

    assertEquals(card_2.toString() + " question= " + card_2.getQuestion()
        + ", answer= " + card_2.getAnswer() + ", category= " + card_2.getCategory(),
        round.currentCard());
  }

  @Test
  void checkLatestCardFeedback() {
    round.takeTurn("heather");

    assertEquals("Correct!", round.latestCardFeedback());

    round.takeTurn("Smith");

    assertEquals("Incorrect!", round.latestCardFeedback());
  }

  @Test
  void checkNumberCorrect() {
    round.takeTurn("heather");
    round.takeTurn("Smith");
    round.takeTurn("panda");

    assertEquals(2, round.numberCorrect());
  }

  @Test
  void checkNumberCorrectByCategory() {
    round.takeTurn("harry");
    round.takeTurn("nobody knows");
    round.takeTurn("panda");

    assertEquals(0, round.numberCorrectByCategory("Video Games"));
    assertEquals(2, round.numberCorrectByCategory("Turing Staff"));
    assertEquals(0, round.numberCorrectByCategory("Music"));
  }

  @Test
  void checkPercentCorrect() {
    round.takeTurn("harry");
    round.takeTurn("nobody knows");
    round.takeTurn("panda");

    assertEquals(Double.valueOf(66), round.percentCorrect(), 0.6667);
  }
}
