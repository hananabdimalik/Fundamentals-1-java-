package cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayingCardDeckTest {

    @Test
    public void dealChangesStateOfDeck() {
        PlayingCardDeck oneCardRemovedPlayingCardDeck = new PlayingCardDeck();
        assertThat(oneCardRemovedPlayingCardDeck.getCards()).hasSize(52);
        oneCardRemovedPlayingCardDeck.deal();
        assertThat(oneCardRemovedPlayingCardDeck.getCards()).hasSize(51);

    }

    @Test
    public void deckRepresentationChangesWhenCardDealt() {
        Deck target = new PlayingCardDeck();
        String[] fullRepresentation = target.getCards();
        target.deal();
        String[] cardRemovedRepresentation = target.getCards();
        assertThat(fullRepresentation).isNotEqualTo(cardRemovedRepresentation);
    }
}