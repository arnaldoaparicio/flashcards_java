import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TurnTest {

  private final Card card_1 = new Card("What is the first name of the main character in Silent Hill 3?", "heather",
      "Video Games");
  private final Card card_2 = new Card("What is Mike's middle name?", "nobody knows", "Turing Staff");
  private final Card card_3 = new Card("What is Rachel's favorite animal?", "panda", "Turing Staff");

  private final ArrayList<Card> cards = new ArrayList<Card>();

  private final Deck deck = new Deck(cards);

  private final Turn turn = new Turn("heather", card_1);

  @Test
  void allAttributes() {
    assertAll("turn",
    () -> assertEquals("heather", turn.getGuess()),
    () -> assertEquals(card_1, turn.getCard())
    );
  }

  @Test
  void checkForCorrectGuess() {
    assertEquals(true, turn.isCorrectGuess());
    assertEquals("Correct!", turn.guessFeedback());
  }

  @Test
  

}
