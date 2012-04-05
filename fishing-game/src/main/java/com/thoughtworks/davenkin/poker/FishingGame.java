package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;
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

    private ListIterator<Player> playerIterator;
    private ArrayList<Player> failedPlayers = new ArrayList<Player>();

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

    public void reset() {
        for (Player player : players) {
            player.getCards().clear();
        }

        board.getCards().clear();
        players.addAll(failedPlayers);
        failedPlayers.clear();

        dealCards();
    }

    public Player nextPlayer() {
        if (!playerIterator.hasNext())
            initPlayerIterator();
        return playerIterator.next();

    }

    public int start() {
        initPlayerIterator();
        int count = 0;
        while (true) {
            count++;
            Player currentPlayer = nextPlayer();
            Card cardToPlay = currentPlayer.getCards().get(0);
            playCards(currentPlayer, cardToPlay);
            fish(currentPlayer, cardToPlay);
            if (resolveWinner(currentPlayer)) break;
        }
        return count;
    }

    private void playCards(Player currentPlayer, Card cardToPlay) {
        currentPlayer.playCard(cardToPlay);
        board.addCard(cardToPlay);
        board.displayCards();
    }

    private void fish(Player currentPlayer, Card cardToPlay) {
        if (cardToPlay.getRank() == Rank.JACK && board.getCards().size() != 1) {
            fishByJack(currentPlayer);
        } else {
            Card firstByRank = board.findFirstByRank(cardToPlay.getRank());
            if (firstByRank != null && firstByRank != cardToPlay) {
                fishByRepeat(currentPlayer, cardToPlay, firstByRank);
            }
        }
    }

    private boolean resolveWinner(Player currentPlayer) {
        if (currentPlayer.getCards().size() == 0) {
            players.remove(currentPlayer);
            failedPlayers.add(currentPlayer);
        }
        if (players.size() == 1) {
            System.out.println("Winner: " + players.get(0).getName());
            return true;
        }
        return false;
    }

    private void fishByRepeat(Player currentPlayer, Card cardToPlay, Card firstByRank) {
        int from = board.getCards().indexOf(firstByRank);
        int to = board.getCards().indexOf(cardToPlay);
        List<Card> cardsInBetween = board.getCards().subList(from, to + 1);
        board.removeAllFrom(from);
        currentPlayer.addCards(cardsInBetween);
    }

    private void fishByJack(Player currentPlayer) {
        currentPlayer.addCards(board.getCards());
        board.getCards().clear();
    }


    public void initPlayerIterator() {
        playerIterator = players.listIterator();
    }
}
