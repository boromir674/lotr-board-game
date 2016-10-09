package game.components;

import enums.LotrCharacter;

public class HobbitProperty {

	public static HobbitProperty getHobbitProperty(LotrCharacter aHobbitCharacter) {
		switch (aHobbitCharacter) {
		case FRODO:
			return getFrodoProperty();
		case SAM:
			return getSamProperty();
		case PIPPIN:
			return getPippinProperty();
		case MERRY:
			return getMerryProperty();
		case FATTY_BOLGER:
			return getFattyBolgerProperty();
		}
		return null;
	}

	private static HobbitProperty getFattyBolgerProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	private static HobbitProperty getMerryProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	private static HobbitProperty getPippinProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	private static HobbitProperty getSamProperty() {
		return null;
		// TODO Auto-generated method stub
		
	}

	private static HobbitProperty getFrodoProperty() {
		return null;
		// TODO Auto-generated method stub
		
	}

}
