package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class englishGameTest{

    @Test
    public void testenglishGameCreation(){
        Game s = new englishGame();
        assertNotNull(s);
    }

    @Test
    public void testenglishDeckBuilt(){
        Game s = new englishGame();
        s.buildDeck();
        assertEquals(52, s.deck.size());
    }

}
