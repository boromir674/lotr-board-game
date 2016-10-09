package game.boardGame.components;

import java.util.HashMap;
import java.util.Random;

import commands.DoNothing;
import commands.LotrCommand;
import commands.MoveCharacter;
import game.LotrGame;

public class LotrDice {

	private static enum LotrDiceSide {
		BLANK {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new DoNothing();
			}

		}, ONE_BLACK_DOT {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager().getActivePlayer().getFigure(), 1);
			}
		}, TWO_BLACK_DOTS {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager().getActivePlayer().getFigure(), 2);
			}
		}, THREE_BLACK_DOTS {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager().getActivePlayer().getFigure(), 3);
			}
		}, EYE_OF_SAURON {
			public LotrCommand getLotrCommand(LotrGame game) {
				return new MoveCharacter(game.getLotrGameManager().getSauron(), -1);
			}
		}, TWO_CARDS {
			public LotrCommand getLotrCommand(LotrGame game) {
				//TODO implement object
				return null;
			}
		};
		
		public abstract LotrCommand getLotrCommand(LotrGame aLotrGame);
	}
	private static HashMap<LotrDiceSide, LotrCommand> symbolToCommandMapping;
	
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

	private Random random;

	private LotrGame game;

	public LotrDice (LotrGame aLotrGame) {
		game = aLotrGame;
	}
	
	private LotrCommand produceCommand(LotrDiceSide result) {
		return result.getLotrCommand(game);
	}

	public LotrCommand throwMe() {
		return this.produceCommand(r.random(this.game.getRandom()));
	}
}
