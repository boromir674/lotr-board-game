package game.boardGame.components;

import game.components.senarios.EmblemSymbol;

public class Emblem {
	
	private EmblemSymbol emblemType;
	
	public Emblem(EmblemSymbol anEmblem) {
		emblemType = anEmblem;
	}

	public EmblemSymbol getType() {
		return emblemType;
	}
	
}
