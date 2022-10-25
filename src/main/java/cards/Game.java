package cards;

public class Game {
    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getCards();
        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }
}


