import java.util.regex.Matcher;
import java.util.regex.Pattern;

import enums.ActivityCardColour;
import enums.ActivityCardType;
import game.boardGame.components.cards.Card;
import game.boardGame.components.cards.HobbitCard;

public class Main {

	public static void main(String[] args) {
		Card myCard = new HobbitCard(ActivityCardType.BATTLE, ActivityCardColour.WHITE);
		System.out.println(myCard.getClass().toString());
		String mydata = myCard.getClass().toString();
		//String s2 = mydata.
	}

}
