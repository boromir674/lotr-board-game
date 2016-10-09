package game.components.player;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import enums.ActivityCardColour;
import enums.ActivityCardType;
import game.boardGame.components.Ring;
import game.boardGame.components.cards.Card;
import game.boardGame.components.cards.GandalfCard;
import game.boardGame.components.cards.HobbitCard;
import game.boardGame.components.cards.RegionActivityCard;
import game.boardGame.components.cards.RegionSpecialCard;
import game.components.senarios.EmblemSymbol;
import game.exceptions.NotEnoughShieldsException;

public class Belongings {

	//private enum HobbitCardTypes {
		//WHITE_BATTLE, WHITE_TRAVEL, WHITE_HIDE, WHITE_FRIENDSHIP, WHITE_BALADER, GREY_BATTLE, GREY_TRAVEL, GREY_HIDE, GREY_FRIENDSHIP
	//}

	private Map<ActivityCardType, Map<ActivityCardColour, Integer>> hobbitCards;  
	private Map<EmblemSymbol, Integer> emblems;
	
	private List<GandalfCard> gandalfCards;
	private List<RegionActivityCard> regionCards;
	private List<RegionSpecialCard> yellowCards;

	private Ring ring;
	private int shields;

	public Belongings() {
		this.initializeHashes();
		
		this.gandalfCards =  new ArrayList<GandalfCard>();
		this.regionCards = new ArrayList<RegionActivityCard>();
		this.yellowCards = new ArrayList<RegionSpecialCard>();
		this.shields = 0;
	}
	
	// -------------------------- GETTERS --------------------------
	public final Map<ActivityCardType, Map<ActivityCardColour, Integer>> getHobbitCards() {
		return hobbitCards;
	}
	public final List<GandalfCard> getGandalfCards() {
		return gandalfCards;
	}
	public final List<RegionActivityCard> getRegionCards() {
		return regionCards;
	}
	public final List<RegionSpecialCard> getYellowCards() {
		return yellowCards;
	}
	public final Ring getRing() {
		return ring;
	}
	public final int getShields() {
		return shields;
	}

	// ------------------------- CARDS -------------------------------------
	public void add(Card aCard) {

		String cardClass = aCard.getClass().toString();
		if (cardClass.endsWith("HobbitCard")) {
			int value = this.hobbitCards.get(((HobbitCard)aCard).getType()).get(((HobbitCard)aCard).getColour());
			this.hobbitCards.get(((HobbitCard)aCard).getType()).put(((HobbitCard)aCard).getColour(), value + 1);
		} 
		else if (cardClass.endsWith("GandalfCard")) 
			this.gandalfCards.add((GandalfCard) aCard);
		else if (cardClass.endsWith("RegionCard")) {
			if (aCard instanceof RegionActivityCard) {
				this.regionCards.add((RegionActivityCard) aCard);
			}
			else if (aCard instanceof RegionSpecialCard) {
				this.yellowCards.add((RegionSpecialCard) aCard);
			}
		}
	}
	public void remove(Card aCard) {
		String cardClass = aCard.getClass().toString();
		if (cardClass.endsWith("HobbitCard")) {
			int value = this.hobbitCards.get(((HobbitCard)aCard).getType()).get(((HobbitCard)aCard).getColour());
			this.hobbitCards.get(((HobbitCard)aCard).getType()).put(((HobbitCard)aCard).getColour(), value - 1);
		} 
		else if (cardClass.endsWith("GandalfCard")) 
			this.gandalfCards.remove((GandalfCard) aCard);
		else if (cardClass.endsWith("RegionCard")) {
			if (aCard instanceof RegionActivityCard) {
				this.regionCards.remove((RegionActivityCard) aCard);
			}
			else if (aCard instanceof RegionSpecialCard) {
				this.yellowCards.remove((RegionSpecialCard) aCard);
			}
		}
	}	
	// ---------------- EMBLEMS --------------------------------
	public void add(EmblemSymbol emblem) {
		if (!this.emblems.containsKey(emblem)) 
			this.emblems.put(emblem, 1);
		else
			this.emblems.put(emblem, this.emblems.get(emblem) + 1);
	}
	public void remove(EmblemSymbol emblem) {
		this.emblems.put(emblem, this.emblems.get(emblem) - 1);
	}
	public void removeAllEmblems() {
		for (EmblemSymbol key: this.emblems.keySet())
			this.emblems.put(key, 0);
	}
	
	// ------------ SHIELDS --------------------------
	public void addShieldsOfValue(int value) {
		this.shields += value;
	}
	public void removeShieldsOfValue(int value) throws NotEnoughShieldsException {
		if (value > this.shields)
				throw new NotEnoughShieldsException(value);
		this.shields -= value;
	}
	// -------------------------- RING --------------------------
	public void addTheRing() {
		this.ring = Ring.getInstance();
	}
	public void removeTheRing() {
		this.ring = null;
	}
	
	private void initializeHashes() {
		emblems = new HashMap<EmblemSymbol, Integer>();
		// initialize hash to quantify the amount of hobbit cards owned
		Map<ActivityCardColour, Integer> colourCounts;
		colourCounts = new HashMap<ActivityCardColour, Integer>();
		this.hobbitCards = new EnumMap<ActivityCardType, Map<ActivityCardColour, Integer>>(ActivityCardType.class);
		for (ActivityCardType symbol : ActivityCardType.values()) {
			colourCounts = new HashMap<ActivityCardColour, Integer>();
			for (ActivityCardColour colour : ActivityCardColour.values()) {
				colourCounts.put(colour, 0);
			}
			this.hobbitCards.put(symbol, colourCounts);
		} // waste one iteration for laziness
		this.hobbitCards.get(ActivityCardType.BALADER).remove(ActivityCardColour.GREY);
	}

}

