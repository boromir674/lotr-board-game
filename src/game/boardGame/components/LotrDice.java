package game.boardGame.components;

import java.util.Random;

import commands.DoNothing;
import commands.LotrCommand;
import commands.MoveCharacter;
import enums.LotrCharacter;
import game.LotrGame;

public class LotrDice {

	private enum LotrDiceSide {
		BLANK {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new DoNothing();
			}

		}, ONE_BLACK_DOT {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager(), game.getActivePlayer(), 1);
			}
		}, TWO_BLACK_DOTS {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager(), game.getActivePlayer(), 2);
			}
		}, THREE_BLACK_DOTS {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager(), game.getActivePlayer(), 3);
			}
		}, EYE_OF_SAURON {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager(), LotrCharacter.SAURON, -1);
			}
		}, TWO_CARDS {
			public LotrCommand getLotrCommand(LotrGame game) {
				//TODO design logic for "discard 2 cards" dice result
				return null;
			}
		};
		
		public abstract LotrCommand getLotrCommand(LotrGame aLotrGame);
	}
	
	private static final RandomEnum<LotrDiceSide> r = new RandomEnum<LotrDiceSide>(LotrDiceSide.class);
	private static class RandomEnum<E extends Enum<LotrDiceSide>> {
		private final E[] values;
		public RandomEnum(Class<E> token) {
			values = token.getEnumConstants();
		}
		public E random(Random rand) {
			return values[rand.nextInt(values.length)];
		}
	}
	
	private static LotrDice instance;
	private LotrGame game;
	
	private LotrDice () {
	}
	
	public static LotrDice getInstance() {
		if (instance == null) {
			instance = new LotrDice();
		}
		return instance;
	}
	
	public void setGame(LotrGame game) {
		this.game = game;
	}
	
	public LotrCommand throwMe() {
		return this.produceCommand(r.random(this.game.getRandom()));
	}
	
	private LotrCommand produceCommand(LotrDiceSide result) {
		// please do not remove, needed for future understanding 
		return result.getLotrCommand(game);
	}

}
