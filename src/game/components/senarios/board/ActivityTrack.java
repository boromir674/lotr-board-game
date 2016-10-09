package game.components.senarios.board;

import enums.ActivitySymbol;
import game.boardGame.components.LotrPointer;

public class ActivityTrack extends Track{
	
	private LotrPointer pointer;
	private ActivitySymbol activity;
	
	public ActivityTrack (ActivityTile[] tiles, ActivitySymbol anActivitySymbol) {
		super(tiles);
		this.activity = anActivitySymbol;
	}
	
	public void movePointer(int steps) {
		pointer.moveForward();
	}

	public ActivitySymbol getType() {
		return this.activity;
	}
}
