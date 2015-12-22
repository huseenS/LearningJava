package JavaLearn;

import java.util.Scanner;

public class countingMachineRevisted {
	
	
	public static void Loop(int countFrom, int countTo, double countBy) {
		for( double i = countFrom ; i<=countTo; i+=countBy ) {
			System.out.println(countBy);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		int countFrom;
		int countTo;
		double countBy;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Count From: ");
		countFrom = keyboard.nextInt();
		System.out.println("Count To: ");
		countTo = keyboard.nextInt();
		System.out.println("Count By half numbers or decimals ");
		countBy = keyboard.nextDouble();
		
		Loop(countFrom, countTo, countBy);

		keyboard.close();
	}
	
}
