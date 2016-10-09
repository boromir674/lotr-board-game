package game.components.senarios.board;

import commands.LotrCommand;

public abstract class TileDecorator implements Tile {
	
	protected EmptyTile tile;
	
	public TileDecorator(EmptyTile anEmptyTile) {
		this.tile = anEmptyTile;
	}
	@Override
	public LotrCommand getCommand() {
		return tile.getCommand();
	}

}
