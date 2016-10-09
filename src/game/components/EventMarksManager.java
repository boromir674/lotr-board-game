package game.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import game.boardGame.components.EventMark;

public class EventMarksManager {
	
	private List<EventMark> hiddenStack;
	private List<EventMark> revealedStack;
	
	public EventMarksManager(EventMark[] lotrMarksSet) {
		hiddenStack = Arrays.asList(lotrMarksSet);
		revealedStack = new ArrayList<EventMark>();
	}
	
	public void initialize() {
		hiddenStack.addAll(revealedStack);
		Collections.shuffle(hiddenStack);
		revealedStack.clear();
	}
	
}
