package game.components.senarios.board;

import game.LotrGame;
import game.components.player.LotrPlayer;
import game.components.senarios.EmblemSymbol;

public class ActivityTileBuilder implements TileBuilder{
	
	private LotrGame game;
	private LotrPlayer setPlayer;
	
	public ActivityTileBuilder() {
	}
	
	@Override
	public void setGame(LotrGame aGame) {
		this.game = aGame;
	}

	@Override
	public void setPlayer(LotrPlayer aPlayer) {
		this.setPlayer = aPlayer;
	}

	@Override
	public ActivityTile getActivityTile() {
		return null;
	}
	
}
