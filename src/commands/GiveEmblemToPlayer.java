package commands;

import game.components.player.LotrPlayer;
import game.components.senarios.EmblemSymbol;

public class GiveEmblemToPlayer implements LotrCommand {
	
	private LotrPlayer player;
	//private Emblem emblem;
	private EmblemSymbol emblem;
	
	public GiveEmblemToPlayer(LotrPlayer aPlayer, EmblemSymbol anEmblem) {
		player = aPlayer;
		emblem = anEmblem;
	}
	
	@Override
	public void execute() {
		player.getPossesions().add(emblem);
	}

}
