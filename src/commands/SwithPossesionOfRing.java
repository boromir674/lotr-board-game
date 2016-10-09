package commands;

import game.components.player.LotrPlayer;

public class SwithPossesionOfRing implements LotrCommand {
	
	private LotrPlayer fromPlayer;
	private LotrPlayer toPlayer;
	
	public SwithPossesionOfRing(LotrPlayer fromPlayer, LotrPlayer toPlayer) {
		this.fromPlayer = fromPlayer;
		this.toPlayer = toPlayer;
	}
	
	@Override
	public void execute() {
		fromPlayer.getPossesions().removeTheRing();
		toPlayer.getPossesions().addTheRing();
	}
}
