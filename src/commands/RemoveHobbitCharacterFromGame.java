package commands;

import game.boardGame.components.HobbitFigure;

public class RemoveHobbitCharacterFromGame implements LotrCommand {
	
	private HobbitFigure hobbit;
	
	public RemoveHobbitCharacterFromGame(HobbitFigure aHobbit) {
		hobbit = aHobbit;
	}
	
	@Override
	public void execute() {
		hobbit.die();
	}
}
