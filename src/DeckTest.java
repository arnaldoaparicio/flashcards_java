import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class DeckTest {
        private final Card card_1 = new Card("What is the first name of the main character in Silent Hill 3?", "heather", "Video Games");
        private final Card card_2 = new Card("What is Mike's middle name?", "nobody knows", "Turing Staff");
        private final Card card_3 = new Card("What is Rachel's favorite animal?", "panda", "Turing Staff");

        private final ArrayList<Card> cards = new ArrayList<Card>();

        private final Deck deck = new Deck(cards);

        @BeforeEach
        void addCards() {
          cards.add(card_1);
          cards.add(card_2);
          cards.add(card_3);
        }

        @Test
        void checkFirstCardInDeck() {
          assertAll("deck",
          () -> assertEquals("What is the first name of the main character in Silent Hill 3?", deck.firstCard().getQuestion()),
          () -> assertEquals("heather", deck.firstCard().getAnswer()),
          () -> assertEquals("Video Games", deck.firstCard().getCategory())
          );
        }
        
        @Test
        void deckCount() {
          assertEquals(3, deck.allCards().size());
        }
}
