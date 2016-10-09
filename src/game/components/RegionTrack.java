package game.components;

import game.boardGame.components.LotrPointer;

public final class RegionTrack {
	
	private static LotrPointer pointer;
	
	public static void advancePointer() {
		pointer.moveForward();
	}

}
