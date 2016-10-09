package commands;

import game.components.player.LotrPlayer;

public class ThrowDice implements LotrCommand {
	
	private LotrPlayer player;
	
	public ThrowDice(LotrPlayer aPlayer) {
		player = aPlayer;
	}

	@Override
	public void execute() {
		player.throwDice();
	}
	
}
