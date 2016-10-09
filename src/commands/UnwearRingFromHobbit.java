package commands;

import game.boardGame.components.HobbitFigure;

public class UnwearRingFromHobbit implements LotrCommand {
	
	private HobbitFigure hobbit;
	
	public UnwearRingFromHobbit(HobbitFigure aHobbit) {
		hobbit = aHobbit;
	}
	
	@Override
	public void execute() {
		hobbit.takeOffRing();
	}
}
