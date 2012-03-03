package com.thoughtworks.davenkin.poker;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Card implements ICard {
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
    
    public String toString()
    {
        return String.format("%s-%s", suit.toString(), rank.toString());

    }
    
}
