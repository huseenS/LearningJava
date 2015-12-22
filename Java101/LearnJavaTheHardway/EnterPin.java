package JavaLearn;

import java.util.Scanner;

public class EnterPin {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("Welcome to the Bank of Huseen");
		System.out.print("Enter your pin ");
		int entry = keyBoard.nextInt();
		
		while ( entry != pin ) {
			
			System.out.println("\nIncorrect Pin. Try again.");
			System.out.print("Enter your pin");
			
			entry = keyBoard.nextInt();
		}
		
		System.out.println("\nPin accepted. You now have access to your account.");
		
		keyBoard.close();
	}

}
