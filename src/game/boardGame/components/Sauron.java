package game.boardGame.components;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sauron extends LotrFigure{
	
	private final static Set<Byte> SAURON_VALID_STARTING_POINTS = new HashSet<Byte>(Arrays.asList(new Byte[]{10, 12, 15}));
	
	private Sauron(byte startingPosition) {
		super(startingPosition);
	}
	
	public static Sauron getSauron(byte startingPoint){
		assert (SAURON_VALID_STARTING_POINTS.contains(startingPoint));
		return new Sauron(startingPoint);
	}
	
}
