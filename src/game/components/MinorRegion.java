package game.components;

import commands.LotrCommand;
import game.LotrBoardGame;

public class MinorRegion {
	
	private MinorRegion() {
	}
	
	public static LotrCommand[] getSireRegionCommands(LotrBoardGame game){
		for (int i=0; i<game.getNumberOfPlayers(); i++){
				game.distributeHobbitCards(game.getPlayers()[i], 6);
				//TODO Implement rest of logic for Sire region script
		}
		return null;
		
	}
	
	public static LotrCommand[] getRivendellRegionCommands(LotrBoardGame game) {
		//TODO Rivendell Region script
		return null;
	}
	public static LotrCommand[] getLothlorienRegionCommands(LotrBoardGame game) {
		//TODO Lothlorien Region script
		return null;
	}
}
