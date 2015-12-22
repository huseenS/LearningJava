package JavaLearn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BabyBlackJack {
	static String player;
	static String dealer = "dealer";
	static int dealerTotal = 0;
	static int total = 0;

	public static void main(String[] args) {
		
		System.out.println("Baby BlackJack!");
		System.out.println("player Enter your Name: ");
		try(BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			player = keyboard.readLine();
			boolean gameOver = false;
			while (!gameOver) {
				userTurn();
				dealerTurn();
				if (isGameOver()) {
					gameOver = true;
				}
			}
		} catch (IOException e) {
			System.out.println("Error " + e);
		}	
	}
	
	public static int getRandomNumber() {
		int randomNumber = (int)(Math.random() * 10 + 1 );
		return randomNumber;
	}
	
	public static void userTurn() {
			int card1 = getRandomNumber();
			int card2 = getRandomNumber();
			System.out.println("You Drew " + card1 + " and " + card2);
			total = card1 + card2; 
			System.out.println("\n" + player + "'s " + "total is: " + total + "\n");
	}
	
	public static void  dealerTurn() {
		int dealerCard1 = getRandomNumber();
		int dealerCard2 = getRandomNumber();
		System.out.println("Dealer Drew " + dealerCard1 + " and " + dealerCard2);
		dealerTotal = dealerCard1 + dealerCard2;
		System.out.println("\n" + dealer + "'s " + "total is: " + dealerTotal);
		
	}
	
	public static boolean isGameOver() {
		boolean lose = false;
		if (dealerTotal < total ) {
			System.out.println("\n" + player + " Wins" );
			lose = true;
		}  else {
			System.out.println("\n" + dealer + " Wins" );
			lose = true;
		}
		
		return lose;
	}

}