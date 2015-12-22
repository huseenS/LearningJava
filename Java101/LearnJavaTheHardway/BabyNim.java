package JavaLearn;

import java.util.Scanner;

public class BabyNim {
	static int toRemove= 0;
	static int pileA = 3;
	static int pileB = 3;
	static int pileC = 3;
	static Scanner keyboard;
	static boolean isGameOver = false;
	
	public static void main(String[] args) {
		while ( !isGameOver ) {
			System.out.print("\nA: " + pileA + "\tB: " + pileB + "\t C: " + pileC);
			System.out.println("\nChoose a pile: ");
			keyboard = new Scanner(System.in);
			String pileChoice = keyboard.next();
			decrementPile(pileChoice,toRemove);
			
			if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
				System.out.println("All piles are empty good job!");
				isGameOver = true;
			}
		}
		keyboard.close();
	}
	
	public static void decrementPile(String pilePicked, int NumbertoRemove) {	
		System.out.println("How many to remove from pile " + pilePicked);
		toRemove = keyboard.nextInt();
		System.out.println("\nA: " + pileA + "\tB: " + pileB + "\t C: " + pileC);
		if (pilePicked.equals("A")) {
			pileA-= toRemove;
		} else if (pilePicked.equals("B")) {
			pileB-= toRemove;
		} else if (pilePicked.equals("C")) {
			pileC-= toRemove;
		}
	}
}	
