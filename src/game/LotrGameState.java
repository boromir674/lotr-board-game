package game;

import java.util.Map;

import enums.ActivitySymbol;

public class LotrGameState {
	
	private byte activePlayerIndex;
	private boolean ringON;
	private byte mainCounter;
	private Map<ActivitySymbol, Byte> secondaryActivityCounter;	
	//private Map<ActivityCardType, Byte> hobbitCardsLeft;
	
	
}
