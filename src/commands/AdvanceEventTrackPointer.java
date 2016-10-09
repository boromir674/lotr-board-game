package commands;

import game.components.senarios.board.EventTrack;

public class AdvanceEventTrackPointer implements LotrCommand {
	
	private EventTrack track;
	
	public AdvanceEventTrackPointer(EventTrack anEventTrack) {
		track = anEventTrack;
	}
	
	@Override
	public void execute() {
		track.advancePointer();
	}
}
