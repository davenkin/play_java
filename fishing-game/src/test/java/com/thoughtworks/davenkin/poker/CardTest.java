package com.thoughtworks.davenkin.poker;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/3/12
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class CardTest extends TestCase {

    public CardTest(String testName)
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( CardTest.class );
    }

    public void testToString()
    {
        Card card = new Card(Suit.DIAMOND,Rank.JACK);
        assertEquals("DIAMOND-JACK", card.toString());
    }


}
