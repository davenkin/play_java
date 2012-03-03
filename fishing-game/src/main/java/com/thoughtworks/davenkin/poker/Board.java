package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;
import java.util.ListIterator;

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
    
    public Card findLastByRank(Rank rank)
    {
        ListIterator<Card> iterator = cards.listIterator();
        if(iterator.hasNext())
        {
            Card currentCard = iterator.next();
            if(currentCard.getRank() == rank)
                return currentCard;
        }
        return null;
    }
    
    public void displayCards()
    {
        System.out.println("The board currently contains:");

        for(Card card : cards)
        {
            System.out.println(card.toString());
        }
    }
}
