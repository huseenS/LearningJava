package JavaLearn;


import java.util.Scanner;

public class AddingValuesInALoop {

	public static void main(String[] args) {
		
		int total = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");
		int userEntry;

		while ( (userEntry = keyboard.nextInt()) != 0 ) {
			System.out.println("Number: " + userEntry );
			total += userEntry;
			System.out.println("The total so far is " + total );

			
		}
		
		System.out.println("The total is " + total );
		keyboard.close();
	}
		
}
