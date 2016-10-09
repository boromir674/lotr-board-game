package game.components.player;

import game.LotrGame;
import game.boardGame.components.HobbitFigure;

public class LotrPlayer {
	
	private Belongings possesions;
	private LotrGame game;
	private HobbitFigure figure;
	
	public final Belongings getPossesions() {
		return possesions;
	}
	
	public LotrPlayer(LotrGame aLotrGame, HobbitFigure aHobbitCharacter) {
		this.game = aLotrGame;
		this.figure = aHobbitCharacter;
	}
	
	public final HobbitFigure getFigure() {
		return figure;
	}

	public void throwDice() {
		this.game.getDice().throwMe();
	}
}
