package game.boardGame.components.cards;

import enums.ActivityCardColour;
import enums.ActivityCardType;
import game.components.senarios.Senario;

public final class ActivityCardFactory {
	
	public final HobbitCard getBattleHobbitCard(ActivityCardColour colour) {
		return new HobbitCard(ActivityCardType.BATTLE, colour);
	}
	public final HobbitCard getTravelHobbitCard(ActivityCardColour colour) {
		return new HobbitCard(ActivityCardType.TRAVEL, colour);
	}
	public final HobbitCard getHideHobbitCard(ActivityCardColour colour) {
		return new HobbitCard(ActivityCardType.HIDE, colour);
	}
	public final HobbitCard getFriendshipHobbitCard(ActivityCardColour colour) {
		return new HobbitCard(ActivityCardType.FRIENDSHIP, colour);
	}
	public final HobbitCard getBaladerHobbitCard() {
		return new HobbitCard(ActivityCardType.BALADER, ActivityCardColour.WHITE);
	}
	
	public final RegionActivityCard getBattleRegionActivityCard(ActivityCardColour colour, int numberOfSymbols, String title, Senario region) {
		return new RegionActivityCard(ActivityCardType.BATTLE, colour, numberOfSymbols, title, region);
	}
	public final RegionActivityCard getTravelRegionActivityCard(ActivityCardColour colour, int numberOfSymbols, String title, Senario region) {
		return new RegionActivityCard(ActivityCardType.TRAVEL, colour, numberOfSymbols, title, region);
	}
	public final RegionActivityCard getHideRegionActivityCard(ActivityCardColour colour, int numberOfSymbols, String title, Senario region) {
		return new RegionActivityCard(ActivityCardType.HIDE, colour, numberOfSymbols, title, region);
	}
	public final RegionActivityCard getFriendshipRegionActivityCard(ActivityCardColour colour, int numberOfSymbols, String title, Senario region) {
		return new RegionActivityCard(ActivityCardType.FRIENDSHIP, colour, numberOfSymbols, title, region);
	}
	public final RegionActivityCard getBaladerRegionActivityCard(ActivityCardColour colour, int numberOfSymbols, String title, Senario region) {
		return new RegionActivityCard(ActivityCardType.BALADER, colour, numberOfSymbols, title, region);
	}
}
