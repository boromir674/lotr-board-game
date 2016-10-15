package game.boardGame.components;

import enums.LotrCharacter;

public class HobbitFigure extends LotrFigure{
	
	public final static byte HOBBITS_STARTING_POSITIONS = 0;
	
	private LotrCharacter hobbit;
	//private HobbitProperty property;
	
	public HobbitFigure(LotrCharacter aHobbitCharacter) {
		super(HOBBITS_STARTING_POSITIONS);
		this.hobbit = aHobbitCharacter;
		//this.property = HobbitProperty.getHobbitProperty(aHobbitCharacter);
	}
	
	
	public void die() {
		// TODO die method
		
	}

	public void wearRing() {
		// TODO wearRing
		
	}

	public void takeOffRing() {
		// TODO takeOffRIng
		
	}


	public void move(int steps) {
		// TODO move
		
	}
	
}
