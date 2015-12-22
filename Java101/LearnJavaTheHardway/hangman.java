package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;

public class hangman {

	public static void main(String[] args) {
		String toPrint = Arrays.toString(intWordChoiceArray());
		System.out.println(toPrint);
		
		//game();
		
	}
	
	private static String[] intWordChoiceArray() {
		String[] hangManWords = {"adult","advice","arrangement","attempt","august","autumn"
				,"breeze","brick","calm"};
		String whichWord = getRandomword(hangManWords);
		wordChoiceToCharArray(whichWord);
		System.out.println(whichWord);
		return hangManWords;
	}
	
	private static String getRandomword(String[] array) {
		int wordChoice = randInt(0, 8);
		System.out.println(wordChoice);
		return array[wordChoice];
	}
	
	private static char[] wordChoiceToCharArray(String wordChoice) {
		char[] letterArray = wordChoice.toCharArray();
		String toPrintLetters = Arrays.toString(letterArray);
		System.out.println(toPrintLetters);
		return letterArray;
		
	}
	
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((10-0 + 1) + 0);
		return randNum;
	}
	
	private static boolean wincondition() {
		return false;
	}
	
	private static boolean loseCondtion() {
		int turnCount = 0;
		if (turnCount > 10  ) {
			return true;
		}
		return false;
	}
	
	private static void game() {
		try(BufferedReader r = new BufferedReader(new InputStreamReader
				(System.in, StandardCharsets.UTF_8))) {
			while (!wincondition() || loseCondtion()) {
				System.out.println("Welcome to Hangman!");	
			}	
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	
	

}
