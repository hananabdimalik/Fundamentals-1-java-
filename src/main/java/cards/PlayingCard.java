package cards;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

class PlayingCard implements Card {
    private final Suit suit;

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    @Override
    public boolean snap(Card otherCard) {
        throw new NotImplementedException();
    }

    private final int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    static String getFaceValue(int suitNumber) {

        switch (suitNumber) {
            case 0:
                return "ace";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Integer.toString(suitNumber + 1);
            case 10:
                return "jack";
            case 11:
                return "queen";
            case 12:
                return "king";
            default:
                throw new IllegalArgumentException("Something went wrong " + suitNumber + "is not a valid faceValue!");
        }
    }
}
