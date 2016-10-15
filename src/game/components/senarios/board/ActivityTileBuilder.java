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
		// TODO Auto-generated method stub
		
	}

	public ActivityTile getActivityTile(EmblemSymbol emblem) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
