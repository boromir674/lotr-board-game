package game.components.senarios.board;

import game.LotrGame;
import game.components.player.LotrPlayer;

public interface TileBuilder {

	void setGame(LotrGame aGame);

	void setPlayer(LotrPlayer aPlayer);

	ActivityTile getActivityTile();
}
