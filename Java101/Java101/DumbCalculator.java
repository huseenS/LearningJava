import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);

		double firstNumber, secondNumber, thirdNumber, newNumber;

		System.out.println("What is your first number?");
		firstNumber = keyBoard.nextDouble();

		System.out.println("What is your second number?");
		secondNumber = keyBoard.nextDouble();

		System.out.println("What is your third number?");
		thirdNumber = keyBoard.nextDouble();

		newNumber = ((firstNumber + secondNumber + thirdNumber) / 2 ); 

		System.out.println(firstNumber + secondNumber + thirdNumber + " / 2 is... " + newNumber);




	}
}


