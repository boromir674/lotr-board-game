package game.components.senarios.board;

import commands.LotrCommand;

public class EmptyTile implements Tile {

	@Override
	public LotrCommand getCommand() {
		return null;
	}

}
