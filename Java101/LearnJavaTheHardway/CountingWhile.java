package JavaLearn;
import java.util.Scanner;


public class CountingWhile {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("Message: ");
		String message = keyBoard.nextLine();
		
		int n = 0;
		
		while ( n < 5 ) {
			
			System.out.println( (n+1) + "." + message);
			n++;
		}

	}

}
