package commands;

import game.components.player.LotrPlayer;
import game.exceptions.NotEnoughShieldsException;

public class TakeShieldFromPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private int shieldValue;
	
	public TakeShieldFromPlayer(LotrPlayer aPlayer, int valueOfShields) {
		player = aPlayer;
		shieldValue = valueOfShields;
	}
	@Override
	public void execute() {
		try {
			player.getPossesions().removeShieldsOfValue(shieldValue);
		} catch (NotEnoughShieldsException e) {
			e.printStackTrace();
		}
		
	}

}
