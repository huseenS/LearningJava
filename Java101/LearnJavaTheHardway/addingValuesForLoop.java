package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class addingValuesForLoop {
	
	public static void main(String[] args) {
		System.out.println("Enter your number");
		addvalues();

	}
	
	public static int addvalues() {
		int sum  = 0;
		
		try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			String userNumber = keyboard.readLine();
			System.out.println( "\n"+ "Will now sum numbers from 1 to " + userNumber);
			
			int Number = Integer.parseInt(userNumber);
			for (int i = 1; i <= Number; i++) {
				System.out.println(i);
				sum+=i;
				System.out.println("The sum is " + sum);
			}
			
		} catch (NumberFormatException | IOException e) {
			System.out.println("exception " + e );
		} 
		return sum;	
	}

	

	

}
