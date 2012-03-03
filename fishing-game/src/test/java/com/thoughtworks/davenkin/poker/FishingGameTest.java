package com.thoughtworks.davenkin.poker;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class FishingGameTest extends TestCase {
    public FishingGameTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(FishingGameTest.class);
    }

    public void testDealCards() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Deck deck = new Deck();
        assertEquals(27,deck.getCards().size() / 2);
        FishingGame game = new FishingGame();
        game.setDeck(deck);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.dealCards();
        assertEquals(27,player1.getCards().size());
        assertEquals(27,player2.getCards().size());
//        displayPlayerCards(player1);
//        displayPlayerCards(player2);

    }

    private void displayPlayerCards(Player player) {
        System.out.println("card for" + player.getName());
        for(Card card : player.getCards())
        {
            System.out.println(card.toString());
        }
    }


}
