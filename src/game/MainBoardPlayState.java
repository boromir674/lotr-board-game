package game;

import java.util.Map;

import enums.ActivitySymbol;

public class MainBoardPlayState implements LotrGameState {
	
	private byte activePlayer;
	private boolean ringOn;
	private byte mainActivityIndex;
	private Map<ActivitySymbol, Byte> secondaryActivityCounter;	
	//private Map<ActivityCardType, Byte> hobbitCardsLeft;
	
	
	public MainBoardPlayState() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void doAction(LotrGame game) {
				
	}

}
