import java.util.Scanner;

public class HowOldAreYou2 {

	public static void main(String[] args) {

		String name;

		int age;

		Scanner keyBoard = new Scanner(System.in);
		
		System.out.print("Hey, what's your name? " );
		name = keyBoard.next();

		System.out.print("Ok, " + name + " how old are you? ");
		age = keyBoard.nextInt();

		if (age < 16) {
			
			System.out.println("You can't Drive " + name);
		}

		else if (age >=16 && age <=17 ) {
			System.out.println("You can't drive but not vote " + name);
		}

		if (age >=18 && age<=24) {
			System.out.println("You can vote but not rent a car " + name);
		}
		else {
			System.out.println("You can do pretty much anything");
		}


	}
}