package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PlayingCardDeck implements Deck {
    private List<PlayingCard> cards = new ArrayList<>(); //field

    public PlayingCardDeck() {

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                PlayingCard newPlayingCard = new PlayingCard(Suit.suit(suit), faceValue);
                cards.add(newPlayingCard);

            }
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];// local variable
        int cardNumber = 0;
        for (PlayingCard card : cards) {
            String suit = card.getSuit().getName();
            String faceValue = PlayingCard.getFaceValue(card.getFaceValue());

            result[cardNumber] = faceValue + " of " + suit;
            cardNumber++;
        }
        return result;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);

    }



}
