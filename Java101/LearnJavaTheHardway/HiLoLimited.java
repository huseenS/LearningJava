package JavaLearn;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {

	public static void main(String[] args) {
		Random r = new Random();
		
		int x = + r.nextInt(100);
		int guesses = 0;
		int maxGuesses = 7;
		
		System.out.println("I'm thinking of a nubmber between 1-100. You have 7 guesses.");
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("First Guess: ");
		int userEntry = keyboard.nextInt();
		
		while (guesses < maxGuesses && userEntry != x ) {
			if( guesses != 0 ) {
				userEntry = keyboard.nextInt();
			}
						guesses++;
			if ( userEntry < x) {
				System.out.println("\nSorry, you are too low.");
			}
			else if  (userEntry > x ) {
				System.out.println("\nSorry, that guess is too high");
				
			}
			
			System.out.println("Guess Number " + guesses + " " + userEntry);

			if ( userEntry == x) {
				System.out.println("\n You guessed it! What are the odds?!?");
				break;
			}
			else if ( guesses == maxGuesses ) {
				System.out.println("\nSorry, you didn't guess it in 7 tries. You lose");
			}
		}
		
		
		keyboard.close();
	}

}
