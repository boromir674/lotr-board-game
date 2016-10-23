package game.boardGame.components;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import enums.LotrCharacter;

public class LotrFigure {
	
	public final static Set<Byte> SAURON_VALID_STARTING_POINTS = new HashSet<Byte>(Arrays.asList(new Byte[]{10, 12, 15}));
	protected final LotrCharacter character;
	
	protected LotrFigure(LotrCharacter aLotrCharacter) {
		this.character = aLotrCharacter;
	}
	
	public HobbitFigure getFrodo(){
		return new HobbitFigure(LotrCharacter.FRODO);
	}
	public HobbitFigure getSam(){
		return new HobbitFigure(LotrCharacter.SAM);
	}
	public HobbitFigure getPippin(){
		return new HobbitFigure(LotrCharacter.PIPPIN);
	}
	public HobbitFigure getMerry(){
		return new HobbitFigure(LotrCharacter.MERRY);
	}
	public HobbitFigure getFatty(){
		return new HobbitFigure(LotrCharacter.FATTY_BOLGER);
	}
	public LotrFigure getSauron() {
		return new LotrFigure(LotrCharacter.SAURON);
	}	
}
