package models;

import org.junit.Test;

import static org.junit.Assert.*;


public class testenglishGame {

    @Test
    public void  testEnglishGameCreation(){
        Game newGame = new englishGame();
        assertNotNull(newGame);
    }

    @Test
    public void testNumberCols(){
        Game newGame = new englishGame();
        assertEquals(newGame.cols.size(),4);
    }

    @Test
    public void testGameShuffled(){
        Game g = new englishGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testEnglishGameBuildDeck(){
        Game newGame = new englishGame();
        newGame.buildDeck();
        assertEquals(52,newGame.deck.size());
    }

    @Test
    public void testGameStart(){
        Game g = new englishGame();
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
        Game g = new englishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemoveFunction(){
        Game g = new englishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }

}
