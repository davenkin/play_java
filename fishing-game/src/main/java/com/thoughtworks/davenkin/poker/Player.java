package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Player {

    private ArrayList<Card> myCards = new ArrayList<Card>();
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        myCards.add(card);
    }

    public void addCards(List<Card> cards) {
        myCards.addAll(cards);
    }

    public boolean playCards(List<Card> cards) {
        if (myCards.containsAll(cards)) {
            myCards.removeAll(cards);
            return true;
        }
        return false;
    }

    public boolean playCard(Card card) {
        if (myCards.contains(card)) {
            myCards.remove(card);
            System.out.println(name + " played: " + card.toString());
            return true;
        }
        return false;
    }

    public ArrayList<Card> getCards() {
        return myCards;
    }

    public String getName() {
        return name;
    }
}
