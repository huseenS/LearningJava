package JavaLearn;

import java.util.Scanner;

public class rightTriangleChecker {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int side1, side2, side3;
		boolean ascending = false;
		
		while ( !ascending) {
			System.out.println("Enter Three Integers:");
			System.out.println("Side 1: ");
			side1 = keyboard.nextInt();
			System.out.println("Side 2: ");
			side2 = keyboard.nextInt();
			if ( side1 > side2) {
				System.out.println(side1 + " is smaller than " + side2  + " try again.");
				continue;
			}
			System.out.println("Side 3: ");
			side3 = keyboard.nextInt();
			if ( side2 > side3) {
				System.out.println(side3 + " is smaller than " + side2  + " try again.");
				continue;
			}
			
			if ( side1*side1 + side2*side2 == side3*side3) {
				System.out.println("Your three sides are: " + side1 + "" + side2 + "" + side3);
				System.out.println("These sides *do* make a right triangle!");
			}
			else {
				System.out.println("Your three sides are: " + side1 + "" + side2 + "" + side3);
				System.out.println("NO! These sides do not make a right traingle!");
			}
			keyboard.close();
			ascending = true;
		}
		
	
		
	}
}