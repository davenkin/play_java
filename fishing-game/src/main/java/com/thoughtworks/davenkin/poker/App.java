package com.thoughtworks.davenkin.poker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Deck deck = new Deck();
        FishingGame game = new FishingGame();
        game.setDeck(deck);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.dealCards();
        game.initPlayerIterator();
        game.start();
    }
}
