


import java.util.Scanner;

public class SpaceCounter {

	public static void main(String[] args) {
		//get user input
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter new text");
		String input = myScanner.nextLine();

		int spaceCounter = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				spaceCounter++;
			}
			
		}

		System.out.println("there were " + spaceCounter + " spaces in your text");
	
	}
}