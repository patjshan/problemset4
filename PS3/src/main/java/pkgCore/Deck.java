package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck;
	
	public ArrayList<Card> getCardsInDeck(){
		return this.cardsInDeck;
	}

	public Deck() {
		cardsInDeck = new ArrayList<Card>();
		for (eSuit suit: eSuit.values()) {
			for (eRank rank: eRank.values()) {
				Card card = new Card(suit, rank);
				cardsInDeck.add(card);
			}
			}
		}

	//TODO: Fix the Draw method so it throws an exception if the deck is empty
	public Card Draw() throws DeckException{
		boolean bool = cardsInDeck.isEmpty();
			if  (bool) {
				throw new DeckException(this);
			}
			else {
				return  cardsInDeck.remove(0);
			}
		
		
	}
	
	//TODO: Write an overloaded Draw method to Draw a card of a given eSuit
	public Card Draw(eSuit suit){
		Card drawn = null;
		for(Card card: this.cardsInDeck) {
			if (card.geteSuit() == suit) {
				this.cardsInDeck.remove(card);
				drawn = card;
				break;
			}
			else {
				drawn = this.cardsInDeck.get(0);
			}
		
		}
		return drawn;
	}
	//TODO: Write an overloaded Draw method to Draw a card of a given eRank
	public Card Draw(eRank rank) {
		Card drawn = null;
		for(Card card: this.cardsInDeck) {
			if (card.geteRank() == rank) {
				this.cardsInDeck.remove(card);
				drawn = new Card(card.geteSuit(), card.geteRank());
				break;
			}
			else {
				drawn = this.cardsInDeck.get(0);
				}
			}
		return drawn;
	}
	//TODO: Write a method that will return the number of a given eSuit left in the deck.
	public double Count(eSuit suit) {
		double count = 0;
		for (Card card : this.cardsInDeck) {
			if (card.geteSuit() == suit) {
				count = count + 1;
			}
			else {}
		}
		return count;
	}
	//TODO: Write a method that will return the number of a given eRank left in the deck.
	public double Count(eRank rank) {
		double count = 0;
		for (Card card : this.cardsInDeck) {
			if (card.geteRank() == rank) {
				count = count + 1;
			}
			else {}
		}
		return count;
	}
	//TODO: Write a method that will return 0 or 1 if a given card is left in the deck.
	public double Count(Card card) {
		double exists = 0;
		for(Card card1 : this.cardsInDeck) {
			if (card1 == card) {
				exists = 1;
				return exists;
			}
			else {}
			
		}
		return exists;
	}
}
