package game.boardGame.components.cards;

import enums.ActivityCardColour;
import enums.ActivityCardType;

public abstract class ActivityCard extends Card {
	
	private ActivityCardType type;
	private ActivityCardColour colour;
	private int symbols;
	
	public ActivityCard(ActivityCardType activity, ActivityCardColour colour, int symbols) {
		this.type = activity;
		this.colour = colour;
		this.symbols = symbols;
	}

	public final ActivityCardType getType() {
		return type;
	}

	public final ActivityCardColour getColour() {
		return colour;
	}

	public final int getNumberOfSymbols() {
		return symbols;
	}
	
}
