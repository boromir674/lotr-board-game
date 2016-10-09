package commands;

import game.components.senarios.board.ActivityTrack;

public class AdvanceActivityTrackPointer implements LotrCommand {
	
	private ActivityTrack track;
	private int steps;
	
	public AdvanceActivityTrackPointer(ActivityTrack aTrack, int steps) {
		track = aTrack;
		this.steps = steps;
	}
	
	@Override
	public void execute() {
		track.movePointer(steps);
	}
}
