package commands;

import game.boardGame.components.HobbitFigure;

public class WearRingToHobbit implements LotrCommand {
	
	private HobbitFigure hobbit;
	
	public WearRingToHobbit(HobbitFigure aHobbit) {
		hobbit = aHobbit;
	}
	
	@Override
	public void execute() {
		hobbit.wearRing();
	}
}
