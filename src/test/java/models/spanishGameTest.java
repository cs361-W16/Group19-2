package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class spanishGameTest{

    @Test
    public void testspanishGameCreation(){
        Game s = new spanishGame();
        assertNotNull(s);
    }

    @Test
    public void testspanishDeckCount(){
        Game s = new spanishGame();
        assertEquals(40, s.deck.size()); 
    }

    /* new tests */

    @Test
    public void testGameInit(){
        Game g = new spanishGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(1,g.deck.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        Game g = new spanishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testCustomDeal(){
        Game g = new spanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("1Clubs",g.cols.get(0).get(0).toString());
        assertEquals("2Clubs",g.cols.get(1).get(0).toString());
        assertEquals("3Clubs",g.cols.get(2).get(0).toString());
        assertEquals("4Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemoveFunction(){
        Game g = new spanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }

}
