package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class FishingGame implements CardDealer {

    private ArrayList<Player> players = new ArrayList<Player>();
    private Deck deck;
    private Board board = new Board();


    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void dealCards() {
        deck.shuffle();
        int playerSize = players.size();
        int cardsPerPlayer =  deck.getCards().size() / playerSize;
        int index = 0;
        for (Player player : players) {
            player.addCards(deck.getCards().subList(index, index + cardsPerPlayer));
            index = index + cardsPerPlayer;
        }
    }

    public void start()
    {

    }


}
