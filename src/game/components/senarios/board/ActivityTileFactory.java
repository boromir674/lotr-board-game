package game.components.senarios.board;

import game.LotrGame;
import game.components.senarios.EmblemSymbol;

public class ActivityTileFactory {

	private ActivityTileBuilder builder;
	private LotrGame game;

	public ActivityTileFactory(LotrGame aLotrGame) {
		this.game = aLotrGame;
		this.builder = new ActivityTileBuilder(this.game);
	}

	public ActivityTile constructTile(EmblemSymbol emblem) {
		return builder.getActivityTile(emblem);
	}
	public ActivityTile constructEmblemTile() {
		return builder.getActivityTile();
	}
	public ActivityTile constructShieldTile() {
		return builder.getActivityTile();
	}

}
