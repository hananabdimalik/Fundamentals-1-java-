package cards;

interface Deck {

    String[] getCards();
    Card deal();
    void shuffle();


}
