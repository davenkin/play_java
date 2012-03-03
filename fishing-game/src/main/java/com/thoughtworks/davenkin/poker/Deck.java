package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck() {
        buildDeck();

    }

    private void buildDeck() {
        for (Rank rank : Rank.values()) {
            if (rank == Rank.JOKER)
                continue;
            for (Suit suit : Suit.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        cards.add(new Card(Suit.SPADE, Rank.JOKER));
        cards.add(new Card(Suit.HEART, Rank.JOKER));
    }

    public int getCardsNumber() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card findBySuitAndRank(Suit suit, Rank rank)
    {
        for(Card card : cards)
        {
            if(card.getRank() == rank && card.getSuit() == suit)
               return card;
        }
        return null;
    }

    public ArrayList<Card> getCards()
    {
        return cards;
    }

}
