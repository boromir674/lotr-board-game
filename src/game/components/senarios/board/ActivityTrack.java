package game.components.senarios.board;

import enums.ActivitySymbol;
import game.boardGame.components.LotrPointer;

public class ActivityTrack extends Track{
	
	public ActivityTrack(EventTile[] tiles2) {
		super(tiles2);
	}

	private LotrPointer pointer;
	private ActivitySymbol activity;
	
	public void movePointer(int steps) {
		pointer.moveForward();
	}

	public ActivitySymbol getType() {
		return this.activity;
	}
}
