package week8.ex15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public void sort() {
        Collections.sort(cards); // uses Card.compareTo()
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand other) {
        int sumThis = cards.stream().mapToInt(Card::getValue).sum();
        int sumOther = other.cards.stream().mapToInt(Card::getValue).sum();
        return Integer.compare(sumThis, sumOther);
    }
}