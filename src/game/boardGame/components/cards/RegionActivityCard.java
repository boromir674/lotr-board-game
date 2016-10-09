package game.boardGame.components.cards;

import enums.ActivityCardColour;
import enums.ActivityCardType;
import game.components.senarios.Senario;

public class RegionActivityCard extends ActivityCard {
	
	private String title;
	private Senario region;
	
	public RegionActivityCard(ActivityCardType activity, ActivityCardColour colour, int numberOfSymbols, String title, Senario region) {
		super(activity, colour, numberOfSymbols);
		this.title = title;
		this.region = region;
	}
	
	public String getTitle() {
		return this.title;
	}

	public Senario getRegion() {
		return region;
	}

}
