package pkgCore;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pkgCore.Deck;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {
	
	
	@Test 
	public void TestEmptyDeck()  {
		//TODO: Build a deck, draw until you get a DeckException
		boolean thrown = false;
		Deck deck = new Deck();
		while (true) {
			try {
				deck.Draw();
			} catch (DeckException e) {
				thrown = true;
				break;
			}
		}
		
		Assert.assertTrue(thrown);
	}
	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		Deck deck = new Deck();
		Card card = new Card( eSuit.HEARTS, eRank.SEVEN);
		Assert.assertEquals(card.geteSuit(), deck.Draw(eSuit.HEARTS).geteSuit());
	}
	
	@Test
	public void TestDrawRank() {
		//TODO: Build a deck, test the Draw(eRank) method
		Deck deck = new Deck();
		Card card = new Card( eSuit.HEARTS, eRank.SEVEN);
		Assert.assertEquals(card.geteRank(), deck.Draw(eRank.SEVEN).geteRank());
	}
	@Test
	public void TestDeckRankCount() {
		//TODO: Build a deck, test the DeckRankCount method
		Deck deck = new Deck();
		Assert.assertTrue(4.0 == deck.Count(eRank.QUEEN));;
	}
	@Test
	public void TestDeckSuitCount() {
		//TODO: Build a deck, test the DeckSuitCount method
		Deck deck = new Deck();
		Assert.assertTrue(13.0 == deck.Count(eSuit.DIAMONDS));;
	}

}
