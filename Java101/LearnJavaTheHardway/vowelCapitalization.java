package JavaLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class vowelCapitalization {

	public static void main(String[] args) throws FileNotFoundException {
		try(BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			
			System.out.println("Which file would you like to read from?");
			String fileName = reader.readLine();
			capitalize(fileName);
			
		} catch (IOException e) {
			System.err.println(e);
		}

	}
	private static void capitalize(String file) {
		File myFile = new File(file);
		try(Scanner scr = new Scanner(new FileReader(myFile))) {
			while (scr.hasNext()) {
				String line = scr.next();

				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (isLowerCaseVowel(c)) {
						System.out.print(Character.toUpperCase(c));
						
					} else {
						System.out.print(c);
					}
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	private static boolean  isLowerCaseVowel(char c) {
		boolean vowel;
		if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) { 
			vowel = true;
		}
		else {
			vowel = false;
		}
		return vowel;
	}
	
	

}
