package cards;

class Suit {
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    public Suit(String name) {
        this.name = name;
    }

    static Suit suit(int suitNumber) {
        switch (suitNumber) {
            case 0:
                return new Suit("clubs");
            case 1:
                return new Suit("diamonds");
            case 2:
                return new Suit("hearts");
            case 3:
                return new Suit("spades");
            default:
                throw new IllegalArgumentException("Something went wrong " + suitNumber + "is not a valid suitName!");
        }
    }


    public String getName() {
        return name;
    }
}
