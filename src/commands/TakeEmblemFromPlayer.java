package commands;

import game.components.player.LotrPlayer;
import game.components.senarios.EmblemSymbol;

public class TakeEmblemFromPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private EmblemSymbol emblem;
	
	public TakeEmblemFromPlayer(LotrPlayer aPlayer, EmblemSymbol anEmblem) {
		player = aPlayer;
		emblem = anEmblem;
		
	}
	@Override
	public void execute() {
		player.getPossesions().remove(emblem);
	}
}
