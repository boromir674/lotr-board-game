package commands;

import game.boardGame.components.EventMark;

public class RevealEventMark implements LotrCommand {
	
	private EventMark mark;
	
	public RevealEventMark(EventMark aMark) {
		mark = aMark;
	}
	
	@Override
	public void execute() {
		mark.reveal();
	}
}
