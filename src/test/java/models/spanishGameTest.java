package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class spanishGameTest{

    @Test
    public void  testspanishGameCreation(){
        Game s = new spanishGame();
        assertNotNull(s);
    }

    @Test
    public void testspanishDeckCount(){
        Game s = new spanishGame();
        assertEquals(40, s.deck.size()); 
    }

}
