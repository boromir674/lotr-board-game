package commands;

import game.boardGame.components.cards.Card;
import game.components.player.LotrPlayer;

public class GiveCardToPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private Card card;
	
	public GiveCardToPlayer(LotrPlayer aPlayer, Card aCard) {
		player = aPlayer;
		card = aCard;
	}
	
	@Override
	public void execute() {
		player.getPossesions().add(card);
	}

}
