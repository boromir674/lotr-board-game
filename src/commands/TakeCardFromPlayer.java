package commands;

import game.boardGame.components.cards.Card;
import game.components.player.LotrPlayer;

public class TakeCardFromPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private Card card;
	
	public TakeCardFromPlayer(LotrPlayer aPlayer, Card aCard) {
		player = aPlayer;
		card = aCard;
	}
	@Override
	public void execute() {
		player.getPossesions().remove(card);
	}

}
