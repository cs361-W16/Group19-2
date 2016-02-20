package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
  */

  public class testspanishGame {

	@Test
	public void  testSpanishGameCreation(){
		Game s = new SpanishGame();
		assertNotNull(s);
	}

	@Test
		public void testSpanishDeckCount() {
			Game s = new SpanishGame();
			assertEquals(40,s.deck.size());
			s.remove(2);
			assertEquals(39,s.deck.size());
		}

  }
