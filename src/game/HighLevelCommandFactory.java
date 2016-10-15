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
import game.components.senarios.board.ActivityTileType;

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
	
	private static LotrGame game;
	
	public HighLevelCommandFactory(LotrGame aLotrGame) {
		game = aLotrGame;
	}
	
	public static LotrCommand giveItemToActivePlayer(EmblemSymbol emblem) {
		return new GiveEmblemToPlayer(game.getState().getActivePlayer(), emblem);
	}
	public static LotrCommand giveItemToActivePlayer(RegionActivityCard anAcivityCard) {
		return new GiveCardToPlayer(game.getState().getActivePlayer(), anAcivityCard);
	}
	public static LotrCommand activePlayerThrowDice(){
		return new ThrowDice(game.getState().getActivePlayer()); 
	}
	public static LotrCommand activePlayerPickHiddenShield() {
		//TODO Implement the method to return a "active player pick face-down shield command"
		//int pick = game.getRandom().nextInt(game.getState().getNumberOfRemainingShields());
		return null;//new GiveShieldToPlayer(game.getState().getActivePlayer(), game.getState().revealShield(pick)); 
	}
	public static LotrCommand GiveAShieldToActivePlayer() {
		return new GiveShieldToPlayer(game.getState().getActivePlayer(), 1);
	}
	public static LotrCommand healActivePlayer() {
		return new MoveCharacter(game.getState().getActivePlayer().getFigure(), -1);
	}
	public static LotrCommand healPlayer(LotrPlayer aLotrPlayer, int steps) {
		return new MoveCharacter(game.getState().getActivePlayer().getFigure(), -steps);
	}
	
	public static LotrCommand getTileCommand(ActivityTileType type) {
		switch (type) {
		case SMALL_SHIELD:
			return new GiveShieldToPlayer(game.getState().getActivePlayer(), 1);
		case BIG_SHIELD:
			return null; //TODO Implement first selectBigShieldCommand and instantiate here afterwards
		case DICE:
			return new ThrowDice(game.getState().getActivePlayer());
		case RING:
			return new GiveEmblemToPlayer(game.getState().getActivePlayer(), EmblemSymbol.RING);
		case HEART:
			return new GiveEmblemToPlayer(game.getState().getActivePlayer(), EmblemSymbol.HEART);
		case SUN:
			return new GiveEmblemToPlayer(game.getState().getActivePlayer(), EmblemSymbol.SUN);
		case CARD:
			break; //TODO Implement data model, respective LotrCommand and then instatiate here
		case HEAL:
			return new MoveCharacter(game.getState().getActivePlayer().getFigure(), -1);
		}
		return null;
	}
	
}
