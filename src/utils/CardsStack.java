package utils;

import java.util.Collections;
import java.util.Stack;

public class CardsStack {

	private Stack<Card> cards;

	/**
	 * Creates a stack of cards with the given array of cards
	 * @param anArrayOfCards
	 */
	public CardsStack(Card[] anArrayOfCards) {
		this.cards = new Stack<Card>();
		for (int i=0; i<anArrayOfCards.length; i++){
			this.cards.push(anArrayOfCards[i]);
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card popTopCard(){
		return this.cards.pop();
	}
	
	public Card lookTopCard(){
		return this.cards.peek();
	}
	
	/**
	 * Adds all the given cards on top of the stack
	 * @param arrayOfCards
	 */
	public void addCardsOnTop(Card[] arrayOfCards){
		for (int i=0; i<arrayOfCards.length; i++){
			this.cards.push(arrayOfCards[i]);
		}
	}	
}
