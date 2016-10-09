package utils;

import java.util.Random;

import enums.ActivityCardType;
import game.boardGame.components.cards.HobbitCard;

public class Util {

	// Implementing Fisher–Yates shuffle
	// https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#The_modern_algorithm
	public static void shuffleArray(int[] array, Random aRandom) {
		int temp;
		for (int i = array.length - 1; i > 0; i--)
		{
			int index = aRandom.nextInt(i + 1);
			// Simple swap
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}
	
	// Implementing Fisher–Yates shuffle
	// https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#The_modern_algorithm
	public static void shuffleArray(ActivityCardType[] array, Random aRandom) {
		ActivityCardType temp;
		for (int i = array.length - 1; i > 0; i--)
		{
			int index = aRandom.nextInt(i + 1);
			// Simple swap
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}
	
}
