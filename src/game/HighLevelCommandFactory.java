package game;

import commands.GiveCardToPlayer;
import commands.GiveEmblemToPlayer;
import commands.GiveShieldToPlayer;
import commands.LotrCommand;
import commands.MoveCharacter;
import commands.ThrowDice;
import game.boardGame.components.cards.RegionActivityCard;
import game.components.player.LotrPlayer;
import game.components.senarios.EmblemSymbol;

/**
 * @author Konstantinos
 * This class serves as a factory for creating high level LotrCommands. This commands model all the possible activity track tiles effects in the Lotr game
 * * Symbols
 *  + small shield
 *  + big shield
 *  + dice
 *  + region card
 *  + heal
 *  + emblem
 *  
 *  
 *
 */
public class HighLevelCommandFactory {
	
	private LotrGame game;
	
	public HighLevelCommandFactory(LotrGame aLotrGame) {
		game = aLotrGame;
	}
	
	public LotrCommand giveItemToActivePlayer(EmblemSymbol emblem) {
		return new GiveEmblemToPlayer(game.getState().getActivePlayer(), emblem);
	}
	public LotrCommand giveItemToActivePlayer(RegionActivityCard anAcivityCard) {
		return new GiveCardToPlayer(game.getState().getActivePlayer(), anAcivityCard);
	}
	public LotrCommand activePlayerThrowDice(){
		return new ThrowDice(game.getState().getActivePlayer()); 
	}
	public LotrCommand activePlayerPickHiddenShield() {
		//TODO
		//int pick = game.getRandom().nextInt(game.getState().getNumberOfRemainingShields());
		return null;//new GiveShieldToPlayer(game.getState().getActivePlayer(), game.getState().revealShield(pick)); 
	}
	public LotrCommand GiveAShieldToActivePlayer() {
		return new GiveShieldToPlayer(game.getState().getActivePlayer(), 1);
	}
	public LotrCommand healActivePlayer() {
		return new MoveCharacter(this.game.getState().getActivePlayer().getFigure(), -1);
	}
	public LotrCommand healAPlayer(LotrPlayer aLotrPlayer, int steps) {
		return new MoveCharacter(this.game.getState().getActivePlayer().getFigure(), -steps);
	}
	
}
