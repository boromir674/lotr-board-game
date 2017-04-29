package highLevelModels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import commands.LotrCommand;
import enums.LotrCharacter;
import game.LotrGame;
import game.boardGame.components.HobbitFigure;
import game.components.player.LotrPlayer;
import game.exceptions.LotrCharacterAlreadyExistsException;

public class LotrEngine {
	
	private HashMap<LotrCharacter, Integer> characterToIndexMapping;
	private boolean[] characters = new boolean[5];
	
	private List<LotrCommand> history = new ArrayList<LotrCommand>();
	private LotrGame game;
	
	public LotrEngine() {
		characterToIndexMapping = new HashMap<>();
		characterToIndexMapping.put(LotrCharacter.FRODO, 0);
		characterToIndexMapping.put(LotrCharacter.SAM, 1);
		characterToIndexMapping.put(LotrCharacter.PIPPIN, 2);
		characterToIndexMapping.put(LotrCharacter.MERRY, 3);
		characterToIndexMapping.put(LotrCharacter.FRODO, 4);
	}
	
	public LotrPlayer createPlayer(Character aLotrCharacter) throws LotrCharacterAlreadyExistsException{
		if (characters[characterToIndexMapping.get(aLotrCharacter)])
			throw new LotrCharacterAlreadyExistsException();
		HobbitFigure figure = null;
		LotrPlayer player = new LotrPlayer(this.game, figure);
		//player.associateWithFigure(aLotrCharacter);
		characters[characterToIndexMapping.get(aLotrCharacter)] = true;
		return player;
	}
	
	public LotrGame createGame(LotrPlayer[] players, int difficulty){
		return new LotrGame(players, difficulty);
	}
	public LotrGame createGame(LotrPlayer[] players){
		return new LotrGame(players, 12);
	}
	
	public void storeAndExecute(LotrCommand cmd) {
		this.history.add(cmd);
		cmd.execute();
	}

	
}
