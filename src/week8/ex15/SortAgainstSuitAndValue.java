package week8.ex15;

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit() != c2.getSuit()) {
            return Integer.compare(c1.getSuit(), c2.getSuit());
        }
        return Integer.compare(c1.getValue(), c2.getValue());
    }
}