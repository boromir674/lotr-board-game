package commands;

import game.components.player.LotrPlayer;

public class GiveShieldToPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private int shieldValue;
	
	public GiveShieldToPlayer(LotrPlayer aPlayer, int shieldValue) {
		this.shieldValue = shieldValue;
	}
	@Override
	public void execute() {
		player.getPossesions().addShieldsOfValue(shieldValue);
	}

}
