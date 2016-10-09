package game.components;

import commands.LotrCommand;
import game.LotrBoardGame;

public class MinorRegion {
	
	private MinorRegion() {
		// TODO Auto-generated constructor stub
	}
	
	public static LotrCommand[] getSireRegionCommands(LotrBoardGame game){
		for (int i=0; i<game.getNumberOfPlayers(); i++){
				game.distributeHobbitCards(game.getPlayers()[i], 6);
			
		}
		return null;
		
	}
}
