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
    public void testSpanishDeckCount() {
        Game s = new spanishGame();
        assertEquals(40,s.deck.size());
        s.remove(2);
        assertEquals(39,s.deck.size());
    }

}
