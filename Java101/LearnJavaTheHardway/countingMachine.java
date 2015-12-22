package JavaLearn;
import java.util.Scanner;

public class countingMachine {

	public static void main(String[] args) {
		int userInput;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Count to: " );
		userInput = keyboard.nextInt();
		
		for(int i = 0; i<=userInput; i++ ) {
			System.out.println(i);
		}
		keyboard.close();
	}
}
