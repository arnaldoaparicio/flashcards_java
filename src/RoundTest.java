import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

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
  void currentCard() {
    
  }
}
