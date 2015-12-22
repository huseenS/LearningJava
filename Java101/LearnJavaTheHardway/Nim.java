package JavaLearn;

import java.util.Scanner;

public class Nim {
	
	static int pileA = 3;
	static int pileB = 4;
	static int pileC = 5;
	static int toRemove = 0;
	static Scanner keyboard;
	static String p1;
	static String p2;
	
	public static void main(String[] args) {	
		boolean gameover = false;	
		keyboard = new Scanner(System.in);	
		System.out.println("Player 1, enter your name: ");
		p1= keyboard.next();
		System.out.println("Player 2 enter your name: ");
		p2 = keyboard.next();
		
		while (!gameover) {
			if (p1Turn()) {
				break;
			}
			if (p2Turn()) {
				break;
			}
		}
		keyboard.close();
	}
	
	public static void verifyCorrect(String pilePicked, String player)  {
		int pile = 0;
		pilePicked = pilePicked.toUpperCase();
		switch (pilePicked) {
		case "A":
			pile = pileA;
			break;
		case "B":
			pile = pileB;
			break;
		case "C":
			pile = pileC;
		default:
			break;
		}
		
		System.out.println("How many to remove from pile " + pilePicked + ":");
		System.out.println("\nA: " + pileA + "\tB: " + pileB + "\tC: " + pileC);					
		boolean isNumberValid = false;
		while (!isNumberValid) {
			toRemove = keyboard.nextInt();
			if (toRemove <= 0) {
				System.out.println("You must choose atleast 1 How many:");
				System.out.println("\nA: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
			} else if (toRemove > pile) {
				System.out.println("Pile " + pilePicked + " Doesn't have that many. Try again");
				System.out.println("\nA: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
			} else {
				isNumberValid = true;
			}
		}
		if (isNumberValid) {
			
		}
		decrementPile(pilePicked, toRemove);
	}
	
	public static void decrementPile(String pilePicked, int toRemove) {
		if (pilePicked.equals("A")) {
			pileA -= toRemove;
		} else if (pilePicked.equals("B")) {
			pileB -= toRemove; 
		} else if(pilePicked.equals("C")) {
			pileC -= toRemove;
		}
	}
	
	public static boolean p1Turn() {
		System.out.print("\nA: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
		System.out.println("\n" + p1 + " Choose a pile: ");
		String p1PileChoice = keyboard.next();
		
		verifyCorrect(p1PileChoice, p1);
		return loseCondition(p2);
	}
	
	public static boolean p2Turn() {
		System.out.print("\nA: " + pileA + "\tB: " + pileB + "\t C: " + pileC);
		System.out.println("\n" + p2 + " Choose a pile: ");
		String p2PileChoice = keyboard.next();
		
		verifyCorrect(p2PileChoice, p2);
		return loseCondition(p1);
	}
	
	
	public static boolean loseCondition(String player) {
			boolean lost = false;
			if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
				
				System.out.println("There are no counters left "  + player +  " wins" );
				lost = true;
			}
			return lost;
		}
		
}
