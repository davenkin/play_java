package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PokerGame  implements CardDealer,RoleChecker {
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected Deck deck;

    protected Board board = new Board();
    ListIterator<Player> playerIterator;

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public abstract void start();

    protected void initPlayerIterator() {
        playerIterator = players.listIterator();
    }
}
