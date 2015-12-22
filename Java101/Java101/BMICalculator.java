import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);

		double heightInInches,heightInM, weightInPounds, heightSquared, bmi, weightInKG, heightSquaredInM;

		System.out.println("What is your height in inches?");
		heightInInches = keyBoard.nextDouble();
		heightInM = heightInInches * .0254;

		heightSquared = heightInInches * heightInInches;
		heightSquaredInM = heightInM * heightInM;

		System.out.println(heightSquaredInM);

		System.out.println("What is your weight in lbs?");
		weightInPounds = keyBoard.nextDouble();
		weightInKG = weightInPounds * .45;

		bmi = ((weightInKG) / (heightSquaredInM));


		System.out.println("\n" + "your height in inches: " + heightInInches);
		System.out.println("Your weight in pounds: " + weightInPounds);
		System.out.println("Your BMI is " + bmi);






	}
}