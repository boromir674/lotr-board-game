package highLevelModels;

public class Croupier {
	
	private BoardGame bg;
	private Table table;

	public Croupier() {
	}
	
	public void associateWithTable(Table aTable) {
		this.table = aTable;
	}
	
	public void layTable(BoardGame aBoardGame) {
		this.bg = aBoardGame;
		this.table.setChairConstraints(this.bg.getMinPlayers(), this.bg.getMaxPlayers());
	}
	
}
