package com.company;

import java.util.*;

enum Suit {
    SPADES,
    CLUBS,
    HEARTS,
    DIAMONDS
}

enum Rank {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE
}

public class StringAssign4 {

    public static void main(String[] args) {

        String[] cardPack = cards();
        System.out.println(Arrays.toString(cardPack));
        shuffle(cardPack);
        System.out.println(Arrays.toString(cardPack));
        System.out.println("First card of shuffled card pack is: "
              + Arrays.toString(Arrays.copyOfRange(cardPack, 0, 1)));
        cardPack[0] = "0";
        System.out.println("Next six cards (excluding the first card) of shuffled card pack are: "
                + Arrays.toString(Arrays.copyOfRange(cardPack, 1, 7)));
    }

    public static String[] cards() {

        int index = 0;
        String[] cards = new String[52];
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards[index] = s.toString() + r.toString();
                index++;
            }
        }
        return cards;
    }

    public static void shuffle(String[] cards) {

        Collections.shuffle(Arrays.asList(cards)); // Generic solution that gives reliable shuffle
        // https://www.journaldev.com/32661/shuffle-array-java
    }
}

// Shuffling cards with for loop learning purposes:
//        Random r = new Random();
//        for (int i = 0; i < cards.length; i++) {
//            int j = r.nextInt(cards.length);
//            if (i != j) {
//                String temp = cards[i];
//                cards[i] = cards[j];
//                cards[j] = temp;
//            }
//        }
