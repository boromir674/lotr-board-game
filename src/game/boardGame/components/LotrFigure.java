package game.boardGame.components;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class LotrFigure {
	
	private byte position;
	
	public LotrFigure(byte initialPosition) {
		position = initialPosition;
	}
	
	public void move(int steps) {
		System.out.println("moved");
		//TODO implement rest logic
	}
	
	
}
