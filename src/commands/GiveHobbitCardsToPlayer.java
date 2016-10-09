package commands;

import game.LotrGame;
import game.components.player.LotrPlayer;

public class GiveHobbitCardsToPlayer implements LotrCommand{
	
	private LotrGame game;
	private LotrPlayer player;
	private int numberOfCards;
	
	public GiveHobbitCardsToPlayer(LotrGame aLotrGame, LotrPlayer aPlayer, int numberOfCards) {
		game = aLotrGame;
		player = aPlayer;
		this.numberOfCards = numberOfCards;
	}

	@Override
	public void execute() {
		LotrCommand cmd;
		for (int i=0; i<numberOfCards; i++){
			cmd = new GiveCardToPlayer(player, game.getHobbitCardsStack().pop());
			cmd.execute();
		}
	}

}
