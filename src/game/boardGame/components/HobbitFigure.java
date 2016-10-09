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
		// TODO Auto-generated method stub
		
	}

	public void wearRing() {
		// TODO Auto-generated method stub
		
	}

	public void takeOffRing() {
		// TODO Auto-generated method stub
		
	}


	public void move(int steps) {
		// TODO Auto-generated method stub
		
	}
	
}
