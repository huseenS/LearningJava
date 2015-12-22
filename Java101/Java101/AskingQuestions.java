import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
			Scanner keyBoard = new Scanner(System.in);

			int age;
			String height;
			double weight;

			System.out.println("How old are you?");
			age = keyBoard.nextInt();

			System.out.println("How tall are you?");
			height = keyBoard.next();

			System.out.println("How much do you weigh?");
			weight = keyBoard.nextDouble();

			System.out.println("so you are " + age + " years old" + height + "  tall and " + weight + " pounds heavy");

		}	
}