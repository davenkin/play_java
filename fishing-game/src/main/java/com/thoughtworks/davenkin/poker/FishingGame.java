package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class FishingGame extends PokerGame {

    public void dealCards() {
        deck.shuffle();
        int playerSize = players.size();
        int cardsPerPlayer = deck.getCards().size() / playerSize;
        int index = 0;
        for (Player player : players) {
            player.addCards(deck.getCards().subList(index, index + cardsPerPlayer));
            index = index + cardsPerPlayer;
        }
    }

    public Player nextPlayer() {
        if (!playerIterator.hasNext())
            initPlayerIterator();
        return playerIterator.next();

    }

    public void start() {
        initPlayerIterator();
        int count = 0;
        while (true) {
            count ++;
            Player currentPlayer = nextPlayer();
            Card cardToPlay = currentPlayer.getCards().get(0);
            currentPlayer.playCard(cardToPlay);
            board.addCard(cardToPlay);
            board.displayCards();


            if (cardToPlay.getRank() == Rank.JACK && board.getCards().size() != 1) {
                currentPlayer.addCards(board.getCards());
                board.getCards().clear();
//            } else {
//                Card lastByRank = board.findLastByRank(cardToPlay.getRank());
//                if (lastByRank != null && lastByRank != cardToPlay) {
//                    int from = board.getCards().indexOf(lastByRank);
//                    int to = board.getCards().indexOf(cardToPlay);
//                    List<Card> cardsInBetween = board.getCards().subList(from, to);
//                    board.getCards().removeAll(cardsInBetween);
//                    currentPlayer.addCards(cardsInBetween);
//
//
//                }
            }


            if (currentPlayer.getCards().size() == 0)
                players.remove(currentPlayer);

            if (players.size() == 1) {
                System.out.println("Winner: " + players.get(0).getName());
                break;
            }
        }
        System.out.println("Totally " + count + " rounds");
    }


}
