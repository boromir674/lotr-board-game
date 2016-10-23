package commands;

import enums.LotrCharacter;
import game.components.player.LotrPlayer;

public class ThrowDice implements LotrCommand {
	
	private LotrPlayer player;
	
	public ThrowDice(LotrPlayer aPlayer) {
		player = aPlayer;
	}

	public ThrowDice(LotrCharacter activePlayer) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		player.throwDice();
	}
	
}
