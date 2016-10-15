package game;

import java.util.Random;
import java.util.Stack;

import game.boardGame.components.LotrDice;
import game.boardGame.components.cards.HobbitCard;
import game.components.player.LotrPlayer;

public class LotrGame {
	
	private LotrPlayer[] players;
	private int difficulty;
	
	private LotrGameManager manager;
	private Random _random;
	private LotrBoardGame state;
	
	public LotrGame (LotrPlayer[] players, int difficulty) {
		this.players = players;
		this.difficulty = difficulty;
		manager = new LotrGameManager(this);
		_random = new Random();
	}
	
	public void initialize() {
		state = new LotrBoardGame(_random);
	}
	public Random getRandom() {
		return this._random;
	}

	public LotrBoardGame getState() {
		return this.state;
	}
	
	public LotrGameManager getLotrGameManager() {
		return this.manager;
	}

	public Stack<HobbitCard> getHobbitCardsStack() {
		// TODO stack encapsulation of hobbit cards
		return null;
	}

	public LotrPlayer[] getPlayers() {
		return this.players;
	}

	public LotrDice getDice() {
		return this.state.getDice();
	}
	
}
