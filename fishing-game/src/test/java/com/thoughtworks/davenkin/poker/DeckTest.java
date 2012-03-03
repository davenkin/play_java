package com.thoughtworks.davenkin.poker;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class DeckTest extends TestCase{
    public DeckTest(String testName)
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( DeckTest.class );
    }

    public void testBuildDeck()
    {
        Deck deck = new Deck();
        assertEquals(54, deck.getCardsNumber());

    }

    public void testShuffle()
    {
        Deck deck = new Deck();
        Card cardBeforeShuffle = deck.findBySuitAndRank(Suit.DIAMOND, Rank.JACK);
        System.out.println("before shuffle:");
        displayDeckCards(deck);
        deck.shuffle();
        assertEquals(54, deck.getCardsNumber());

        Card cardAfterShuffle = deck.findBySuitAndRank(Suit.DIAMOND, Rank.JACK);
        System.out.println("after shuffle:");
        displayDeckCards(deck);

        assertEquals(cardBeforeShuffle,cardAfterShuffle);
    }

    private void displayDeckCards(Deck deck) {
        for(Card card : deck.getCards())
        {
            System.out.println(card.toString());
        }
    }

}
