import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class TurnTest {

  private final Card card_1 = new Card("What is the first name of the main character in Silent Hill 3?", "heather",
      "Video Games");
  private final Card card_2 = new Card("What is Mike's middle name?", "nobody knows", "Turing Staff");

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
  void checkForIncorrectGuess() {
    Turn turn_2 = new Turn("James", card_2);

    assertNotEquals(turn_2.getGuess(), card_2.getAnswer());
    assertEquals(false, turn_2.isCorrectGuess());
    assertEquals("Incorrect!", turn_2.guessFeedback());
  }

}
