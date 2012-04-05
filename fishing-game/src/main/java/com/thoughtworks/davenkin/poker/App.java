package com.thoughtworks.davenkin.poker;

import java.util.ArrayList;

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
        ArrayList<Integer> counts = new ArrayList<Integer>();
        for(int i = 0; i<1000;i++)
        {
            game.reset();
            counts.add(game.start());
        }
        int total= 0;
        for(Integer number : counts)
        {
            total = total + number;
            System.out.println(number);
        }
        System.out.println("average time: " + total/counts.size());
        
    }
}
