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

	public int getNumberOfPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public LotrPlayer getActivePlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sauron getSauron() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
