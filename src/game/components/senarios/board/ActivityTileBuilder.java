package game.components.senarios.board;

import game.LotrGame;
import game.components.player.LotrPlayer;
import game.components.senarios.EmblemSymbol;

public class ActivityTileBuilder implements TileBuilder{
	
	private LotrGame game;
	private Tile tile;
	
	public ActivityTileBuilder(LotrGame aLotrGame) {
		this.game = aLotrGame;
	}
	
	public ActivityTile getActivityTile() {
		return null;
	}

	@Override
	public void renderTile() {
		this.tile = new EmptyTile();
	}

	public ActivityTile getActivityTile(EmblemSymbol emblem) {
		//TODO Decide to keep or not the whole builder pattern
		return null;
	}
	
}
