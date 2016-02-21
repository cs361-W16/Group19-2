package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testSpanishGame{

    @Test
    public void  testSpanishGameCreation(){
        Game s = new spanishGame();
        assertNotNull(s);
    }

    @Test
    public void testSpanishDeckCount(){
        Game s = new spanishGame();
        s.buildDeck();
        assertEquals(40, s.deck.size()); 
    }

}
