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
		case SAURON:
			// TODO Decide for having a Sauron property or not
		return null;
		}
		return null;
	}

	private static HobbitProperty getFattyBolgerProperty() {
		// TODO Design
		return null;
	}

	private static HobbitProperty getMerryProperty() {
		// TODO Design
		return null;
	}

	private static HobbitProperty getPippinProperty() {
		// TODO Design
		return null;
	}

	private static HobbitProperty getSamProperty() {
		return null;
		// TODO Design
		
	}
	private static HobbitProperty getFrodoProperty() {
		return null;
		// TODO Design
		
	}

}
