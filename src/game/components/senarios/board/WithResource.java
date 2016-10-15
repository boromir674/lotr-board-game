package game.components.senarios.board;

import commands.GiveEmblemToPlayer;
import commands.LotrCommand;
import game.boardGame.components.cards.RegionCard;
import game.components.senarios.EmblemSymbol;
@Deprecated
public class WithResource extends TileDecorator {

	private EmblemSymbol emblem;
	
	public WithResource(EmptyTile anEmptyTile) {
		super(anEmptyTile);
	}
	public WithResource(EmptyTile anEmptyTile, EmblemSymbol enmblem) {
		super(anEmptyTile);
		this.emblem = enmblem;
	}
	
	public WithResource(EmptyTile anEmptyTile, RegionCard card) {
		super(anEmptyTile);
	}

	@Override
	public LotrCommand getCommand() {
		return new GiveEmblemToPlayer(null, emblem);
	}

}
