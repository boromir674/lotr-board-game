package game.components.senarios.board;

public abstract class Track {
	
	private int length;
	private Tile[] tiles;
	
	public Track (Tile[] tiles) {
		this.tiles = tiles;
		this.length = this.tiles.length;
	}

	public Track(EventTile[] tiles2) {
		// TODO Auto-generated constructor stub
	}
	
}
