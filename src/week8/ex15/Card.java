package week8.ex15;

public class Card implements Comparable<Card> {
    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card other) {
        return this.value != other.value
                ? Integer.compare(this.value, other.value)
                : Integer.compare(this.suit, other.suit);
    }

    @Override
    public String toString() {
        String valueStr;
        switch (value) {
            case 11: valueStr = "J"; break;
            case 12: valueStr = "Q"; break;
            case 13: valueStr = "K"; break;
            case 14: valueStr = "A"; break;
            default: valueStr = String.valueOf(value);
        }

        String suitStr;
        switch (suit) {
            case SPADES: suitStr = "Spades"; break;
            case DIAMONDS: suitStr = "Diamonds"; break;
            case HEARTS: suitStr = "Hearts"; break;
            case CLUBS: suitStr = "Clubs"; break;
            default: suitStr = "Unknown";
        }

        return valueStr + " of " + suitStr;
    }
}