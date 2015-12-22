package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class refresher {

	public static void main(String[] args) {
		refreshLoop();
	}
	
	private static void refreshLoop(){
		try(BufferedReader reader = new BufferedReader
			(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			System.out.println("What is your name?");
			String input = reader.readLine();
			
			for (int i = 0; i <= 9; i++) {
				System.out.println(input);
				if (input.equalsIgnoreCase("Mitchell") && i == 4) {
					break;
				}			
			}
				
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}

}