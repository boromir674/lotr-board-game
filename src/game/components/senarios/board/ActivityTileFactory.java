package game.components.senarios.board;

import game.LotrGame;

public class ActivityTileFactory {

	private ActivityTileBuilder builder;
	private LotrGame game;

	public ActivityTileFactory(LotrGame aLotrGame, ActivityTileBuilder builder) {
		this.game = aLotrGame;
		this.builder = builder;
	}

	public ActivityTile constructCardTile() {
		builder.setGame(game);
		builder.setPlayer(game.getState().getActivePlayer());
		return builder.getActivityTile();
	}
	public ActivityTile constructEmblemTile() {
		builder.setGame(game);
		builder.setPlayer(game.getState().getActivePlayer());
		return builder.getActivityTile();
	}
	public ActivityTile constructShieldTile() {
		builder.setGame(game);
		builder.setPlayer(game.getState().getActivePlayer());
		return builder.getActivityTile();
	}

}
