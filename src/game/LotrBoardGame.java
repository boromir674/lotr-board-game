package game;

import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

import enums.ActivityCardType;
import game.boardGame.components.Shield;
import game.components.player.LotrPlayer;

public class LotrBoardGame {

	public final static int NUMBER_OF_BATTLE_HOBBIT_CARDS = 20;
	public final static int NUMBER_OF_TRAVEL_HOBBIT_CARDS = 20;
	public final static int NUMBER_OF_HIDE_HOBBIT_CARDS = 20;
	public final static int NUMBER_OF_FRIENDSHIP_HOBBIT_CARDS = 18;
	public final static int NUMBER_OF_BALADER_HOBBIT_CARDS = 15;
	private final static int TOTAL_NUMBER_OF_HOBBIT_CARDS = NUMBER_OF_BATTLE_HOBBIT_CARDS +	NUMBER_OF_TRAVEL_HOBBIT_CARDS
			+ NUMBER_OF_HIDE_HOBBIT_CARDS + NUMBER_OF_FRIENDSHIP_HOBBIT_CARDS + NUMBER_OF_BALADER_HOBBIT_CARDS;

	private final HashMap<ActivityCardType, Integer> activityCardTypeToAmmountMapping = new HashMap<ActivityCardType, Integer>();
	private final HashMap<Integer, ActivityCardType> indexToActivityCardTypeMapping = new HashMap<Integer, ActivityCardType>();

	private ActivityCardType[] hobbitCards = new ActivityCardType[TOTAL_NUMBER_OF_HOBBIT_CARDS];
	private int hobbitCardsIndex;
	private Random rand;

	public LotrBoardGame(Random aRandom) {
		this.rand = aRandom;
		activityCardTypeToAmmountMapping.put(ActivityCardType.BATTLE, NUMBER_OF_BATTLE_HOBBIT_CARDS);
		activityCardTypeToAmmountMapping.put(ActivityCardType.TRAVEL, NUMBER_OF_TRAVEL_HOBBIT_CARDS);
		activityCardTypeToAmmountMapping.put(ActivityCardType.HIDE, NUMBER_OF_HIDE_HOBBIT_CARDS);
		activityCardTypeToAmmountMapping.put(ActivityCardType.FRIENDSHIP, NUMBER_OF_FRIENDSHIP_HOBBIT_CARDS);
		activityCardTypeToAmmountMapping.put(ActivityCardType.BALADER, NUMBER_OF_BALADER_HOBBIT_CARDS);
		indexToActivityCardTypeMapping.put(0, ActivityCardType.BATTLE);
		indexToActivityCardTypeMapping.put(1, ActivityCardType.TRAVEL);
		indexToActivityCardTypeMapping.put(2, ActivityCardType.HIDE);
		indexToActivityCardTypeMapping.put(3, ActivityCardType.FRIENDSHIP);
		indexToActivityCardTypeMapping.put(4, ActivityCardType.BALADER);
	}
	public LotrPlayer getActivePlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumberOfRemainingShields() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Shield revealShield(int pick) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumberOfPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public LotrPlayer[] getPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void distributeHobbitCards(LotrPlayer aPlayer, int i) {
		// TODO Auto-generated method stub

	}
	// kind of 'bad' method
	// needs to be abstracted / engineer as a stack that allows client code to call pop function
	public void popFromHobbitStack(int numberOfCardToRemoveFromStack) {
		this.hobbitCardsIndex += numberOfCardToRemoveFromStack;
	}
	private void createRandomHobbitCardsStack(){
		int i = 0;
		for (int j=0; j<activityCardTypeToAmmountMapping.size(); j++) {
			for (int y=0; y<activityCardTypeToAmmountMapping.get(indexToActivityCardTypeMapping.get(j)); y++){
				hobbitCards[i] = indexToActivityCardTypeMapping.get(j);
				i ++;
			}
		}
		utils.Util.shuffleArray(hobbitCards, this.rand);
	}

}
