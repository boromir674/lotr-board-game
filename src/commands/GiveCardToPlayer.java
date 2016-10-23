package commands;

import enums.LotrCharacter;
import game.boardGame.components.cards.Card;
import game.boardGame.components.cards.RegionActivityCard;
import game.components.player.LotrPlayer;

public class GiveCardToPlayer implements LotrCommand {
	
	private LotrPlayer player;
	private Card card;
	
	public GiveCardToPlayer(LotrPlayer aPlayer, Card aCard) {
		player = aPlayer;
		card = aCard;
	}
	
	public GiveCardToPlayer(LotrCharacter activePlayer, RegionActivityCard anAcivityCard) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		player.getPossesions().add(card);
	}

}
