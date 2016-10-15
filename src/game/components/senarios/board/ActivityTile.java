package game.components.senarios.board;

import commands.LotrCommand;

public class ActivityTile {
	
	private ActivityTileType type;
	
	public ActivityTile(ActivityTileType type) {
		this.type = type;
	}

	
	public LotrCommand getCommand() {
		return null;
	}
}
