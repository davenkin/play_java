package com.thoughtworks.davenkin.poker;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerTest extends TestCase {
    public PlayerTest(String testName)
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( PlayerTest.class );
    }

    public void testPlayCards()
    {
        Deck deck = new Deck();
        Card card = deck.getCards().get(0);
        Player player = new Player("PlayerName");
        player.addCards(deck.getCards());
        List<Card> cards = deck.getCards().subList(0,5);
        assertTrue(player.playCards(cards));
        assertEquals(49, player.getCards().size());
        assertFalse(player.getCards().contains(card));
    }

    public void testPlayCard()
    {
        Deck deck = new Deck();
        Card card = deck.getCards().get(0);
        Player player = new Player("PlayerName");
        player.addCards(deck.getCards());
        assertTrue(player.playCard(card));
        assertEquals(53, player.getCards().size());
        assertFalse(player.getCards().contains(card));
    }

}
