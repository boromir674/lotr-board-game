package game.components.senarios.board;

import game.boardGame.components.LotrPointer;

public class EventTrack extends Track {
	
	private LotrPointer pointer;
	
	public EventTrack(Tile[] tiles) {
		super(tiles);
	}
	
	public void advancePointer() {
		pointer.moveForward();
	}

}
