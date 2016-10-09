package commands;

import game.LotrGame;

public class DistributeHobbitCards implements LotrCommand {
	
	private LotrGame game;
	private int numberOfCards;
	
	public DistributeHobbitCards(LotrGame game, int numberOfCards) {
		this.game = game;
		this.numberOfCards = numberOfCards;
	}

	@Override
	public void execute() {
		LotrCommand cmd;
		for (int i=0; i<game.getState().getNumberOfPlayers(); i++) {
			//TODO getInstance implementation
			cmd = new GiveHobbitCardsToPlayer(game, game.getPlayers()[i], numberOfCards);
			cmd.execute();
		}
	}

}
