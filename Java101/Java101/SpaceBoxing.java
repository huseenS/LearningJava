import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {

		int planetChoice;
		double weight;
		double venusW, marsW, jupiterW, saturnW, uranusW, neptuneW;
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter your current earth weight ");
		weight = userInput.nextDouble();

		System.out.println("\nI have information for the following planets");
		System.out.print("\n\n1. Venus   2. Mars   3.Jupiter \n4. Saturn  5. Uranus  6. Neptune \n");

		System.out.print("\nWhich planet are you visiting? \n\n");

		//Scanner keyBoard = new Scanner(System.in);

		planetChoice = userInput.nextInt();
		if (planetChoice == 1) {
			venusW = weight * .78;
			System.out.println("\nYour weight would be " + venusW + " on that planet");
		}
		else if (planetChoice == 2) {
			marsW = weight * .39;
			System.out.println("\nYour weight would be " + marsW + " on that planet");
		}
		else if (planetChoice == 3) {
			jupiterW = weight * 2.65;
			System.out.println("\nYour weight would be " + jupiterW + " on that planet");
		}
		else if (planetChoice == 4) {
			saturnW = weight * 1.17;
			System.out.println("\nYour weight would be " + saturnW + " on that planet");
		}
		else if (planetChoice == 5) {
			uranusW = weight * 1.05;
			System.out.println("\nYour weight would be " + uranusW + " on that planet");
		}
		else if (planetChoice == 6) {
			neptuneW = weight * 1.23;
			System.out.print("\nYour weight would be " + neptuneW + " on that planet");
		}




	}
}