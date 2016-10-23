package commands;

import enums.LotrCharacter;
import game.components.player.LotrPlayer;

public class GiveShieldToPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private int shieldValue;
	
	public GiveShieldToPlayer(LotrPlayer aPlayer, int shieldValue) {
		this.shieldValue = shieldValue;
	}
	public GiveShieldToPlayer(LotrCharacter activePlayer, int shieldValue2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() {
		player.getPossesions().addShieldsOfValue(shieldValue);
	}

}
