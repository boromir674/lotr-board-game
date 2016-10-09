package commands;

import game.boardGame.components.LotrFigure;

public class MoveCharacter implements LotrCommand{
	
	private LotrFigure figure;
	private int steps;
	
	public MoveCharacter(LotrFigure figure, int steps) {
		this.figure = figure;
		this.steps = steps;
	}
	
	@Override
	public void execute() {
		this.figure.move(steps);
	}

}
