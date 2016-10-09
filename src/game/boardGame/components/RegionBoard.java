package game.boardGame.components;

import java.util.HashMap;

import enums.ActivityCardType;
import game.components.senarios.board.ActivityTrack;

public class RegionBoard {
	
	private enum ActivityTrackTypes {
		BATTLE, TRAVEL, HIDE, FRIENDSHIP
	}
	private final String title;
	
	private final ActivityTrack mainActivityTrack;
	private final HashMap<ActivityTrackTypes, ActivityTrack> secondaryActivityTracks;
	
	/**
	 * @param title the title of the RegionBoard
	 * @param tracks an array of instances of the required activity tracks. The assumption is that the first track in the list is the main track
	 */
	
	public RegionBoard(String title, ActivityTrack[] tracks) {
		this.title = title;
		secondaryActivityTracks = new HashMap<ActivityTrackTypes, ActivityTrack>();
		mainActivityTrack = tracks[0];
		//for (int i=1; i<tracks.length; i++)
		//	secondaryActivityTracks.put(tracks[i].getType(), tracks[i]);
	}
	
	public final String getTitle() {
		return title;
	}

	public final ActivityTrack getMainActivityTrack() {
		return mainActivityTrack;
	}
	
	public final ActivityTrack getSecondaryActivityTrack(ActivityCardType activitySymbol) {
		return secondaryActivityTracks.get(activitySymbol);
	}
	
}
