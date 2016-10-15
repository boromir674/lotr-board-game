package game.boardGame.components;

public class Ring {
	
	private static Ring instance;
	
	private Ring() {
	}
	
	public static Ring getInstance() {
		if (instance == null)
			return new Ring();
		else
			return instance;
	}
	
	// TODO implement Ring class

}
