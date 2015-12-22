package JavaLearn;

import java.util.Scanner;

public class safeSquareRoot {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("SQUARE ROOT");
		double squaredNumber;
		int userEntry;
		boolean cont = true;
		
		while ( cont ) {
			System.out.println("Enter a number ");
			if ( (userEntry = keyboard.nextInt()) < 0 ) {
				System.out.println("you can't take the square root of a negative number silly!");
				System.out.print("\n try again silly! ");
				
			}
			else {
				System.out.print("Enter a number: ");
				squaredNumber = Math.sqrt(userEntry);
				System.out.println("The Square root is " + squaredNumber );
				cont = false;
			}
			
		}
		keyboard.close();
	}

}
