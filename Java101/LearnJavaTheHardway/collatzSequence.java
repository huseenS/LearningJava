package JavaLearn;
import java.util.Scanner;

public class collatzSequence {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Starting Number: ");
		int number = keyboard.nextInt();
		int largestNumber = 0;
		int steps = 0;
		
		while (number != 1) {
			if (number > largestNumber) {
				largestNumber = number;
			}
			if (number % 2 == 0) {
				number = number/2;
				System.out.print( number + "\t" );
				steps++;
				continue;
			}
			else {
				number = 3 * number + 1;
				System.out.print(number + "\t" );
				steps++;
				continue;
			}
			
		}
		System.out.println("Terminated after " + steps + " steps");	
		System.out.println("The largest value was " + largestNumber);
		keyboard.close();	
	}

}
