package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testEnglishGame{

  @Test
  public void testEnglishGameCreation(){
    Game s = new englishGame();
    assertNotNull(s);
  }

  @Test
  public void testEnglishDeckBuilt(){
    Game s = new englishGame();
    s.buildDeck();
    assertEquals(52, s.deck.size());
  }

}
