import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;


public class CardTest {

  private final Card card = new Card("What is my name?", "John Doe", "Names");

  @Test
  void groupedAssertions() {
    assertAll("card",
      () -> assertEquals("What is my name?", card.getQuestion()),
      () -> assertEquals("John Doe", card.getAnswer()),
      () -> assertEquals("Names", card.getCategory())
      );
  }
  
}
