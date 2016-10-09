package game.components.senarios.board;

import commands.GiveEmblemToPlayer;
import commands.LotrCommand;
import game.components.senarios.EmblemSymbol;

public class WithEmblem extends TileDecorator {
	
	private EmblemSymbol emblem;
	
	public WithEmblem(EmptyTile anEmptyTile, EmblemSymbol enmblem) {
		super(anEmptyTile);
		this.emblem = enmblem;
	}

	@Override
	public LotrCommand getCommand() {
		return new GiveEmblemToPlayer(null, emblem);
	}

}
