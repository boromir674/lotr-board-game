package game;

import java.util.ArrayList;
import java.util.List;

import commands.LotrCommand;
import game.boardGame.components.Sauron;
import game.components.player.LotrPlayer;

public class LotrGameManager {
	
	private List<LotrCommand> history;
	private LotrGame game;

	public LotrGameManager() {
		history = new ArrayList<LotrCommand>();
	}
	
	public LotrGameManager(LotrGame lotrGame) {
		this.game = lotrGame;
	}

	public void storeAndExecute(LotrCommand aCommand) {
		this.history.add(aCommand);
		aCommand.execute();
	}

	public LotrPlayer getActivePlayer() {
		return this.game.getState().getActivePlayer();
	}

	public Sauron getSauron() {
		return this.game.getState().getSauron();
	}
	
	
	
}
