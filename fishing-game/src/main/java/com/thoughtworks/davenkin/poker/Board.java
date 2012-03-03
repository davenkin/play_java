package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Board {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card)
    {
        cards.add(card);
    }
}
