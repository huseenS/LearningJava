package JavaLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LittleQuiz {

	public static void main(String[] args) {
		int score = 0;
		int answer;
		int answer1;
		int answer2;

		System.out.print("Are you ready for a quiz?");
		
		List<String> myList = new ArrayList<>();
		Scanner userInput = new Scanner(System.in);

		String yes_Or_No;

		yes_Or_No = userInput.next();

		if (yes_Or_No.equalsIgnoreCase("Y")) {
			System.out.println("Okay, here it comes!");
		}
		else {
			System.out.println("Okay, here it comes!");
		}

		System.out.print("\n Q1) What is the capital of Alaska? \n\t 1) Melbourne \n\t 2) Anchorage \n\t 3) Juneau \n\n");
	
		answer = userInput.nextInt();

		if (answer == 3) {
			score++;
			System.out.print("That's Right!");
		}
		else {
			System.out.println("Sorry, the Capital is Juneau");
		}

		System.out.println("\n Q2) Can you store the value \"cat\" in a variable of type int? \n\t 1) yes \n\t 2) no");
		answer1 = userInput.nextInt();

		if (answer1 == 2) {
			System.out.println("That's Right!");
			score++;
		}
		else {
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");
		}

		System.out.println("Q3 What is the result of 9+6/3? \n\t 1) 5 \n\t 2) 11 \n\t 3) 15/3");
		answer2 = userInput.nextInt();
		if (answer2 == 1) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry 5 is the correct answer \n\n");
		}

		System.out.println("\nOverall, you got " + score + " out of 3 correct");
		System.out.println("\nThanks for playing!");
		
		userInput.close();
	}
		
}