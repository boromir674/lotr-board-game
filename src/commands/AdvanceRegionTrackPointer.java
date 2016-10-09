package commands;

import game.components.RegionTrack;

public class AdvanceRegionTrackPointer implements LotrCommand {
	
	public AdvanceRegionTrackPointer() {
	}
	
	@Override
	public void execute() {
		RegionTrack.advancePointer();
	}
}
