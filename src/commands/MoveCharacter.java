package commands;

import enums.LotrCharacter;
import game.LotrGameManager;

public class MoveCharacter implements LotrCommand{
	
	private LotrGameManager manager;
	private LotrCharacter character;
	private int steps;
	
	public MoveCharacter(LotrGameManager aLotrGameManager, LotrCharacter aLotrCharacter, int steps) {
		this.manager = aLotrGameManager;
		this.character = aLotrCharacter;
		this.steps = steps;
	}
	
	@Override
	public void execute() {
		this.manager.moveFigure(this.character, steps);
	}

}
