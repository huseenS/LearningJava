// AnalyzeText for word count, vowel count, and average word length!

import java.util.Scanner;
import java.io.*;
public class AnalyzeText {

	public static void main(String[] args) {

		//get user input first
		Scanner myScanner = new Scanner(System.in);
		System.out.println(" Please Enter text to Analyze! ");
		String userInput = myScanner.nextLine();
		userInput = userInput.toLowerCase(); //converts user input to lower case

		//Declaring starting counter's for each vowel
		int counterA = 0; 
		int counterE = 0; 
		int counterI = 0; 
		int counterO = 0; 
		int counterU = 0; 
		int counterY = 0;
		//Declaring vowels/space character
		char space = ' ';
		char vowelA = 'a';
		char vowelE = 'e';
		char vowelI = 'i';
		char vowelO = 'o';
		char vowelU = 'u';
		char vowelY = 'y';
		//.split method found on Java docs
		String [] wordSplit = userInput.split(" ");
		int numberOfWords = wordSplit.length;
		int totalCharacters = 0;
		int numberOfVowels = 0;

		for (int x = 0; x < userInput.length(); x++) {
			char c = userInput.charAt(x);

				// First Loop to check for occurences of total vowels
			if ((c == vowelA) || (c == vowelE) || (c == vowelI) || (c == vowelO) || (c == vowelU) || (c == vowelY)) {
					numberOfVowels++;
			} // end of If loop

				// 2nd loop to update character count
			if ( c != space) {
					totalCharacters++;
			}
		
			// Third Loop to check for each individual vowel Count
			if ((c == vowelA )) {
				counterA++;
			} 
			else if ((c == vowelE)) {
				counterE++;
			}
			else if ((c == vowelI)) {
				counterI++;
				
			}
			else if ((c == vowelO)) {
				counterO++;
			}
			else if ((c == vowelU)) {
				counterU++;
			}
			else if ((c == vowelY)) {
				counterY++;
			}

		} // end of For loop

			// Fourth Loop to check for most frequent vowel
		if ((counterA > counterE) && (counterA > counterO) && (counterA > counterI) && (counterA > counterU) && (counterA > counterY)) {
				char maxVowel = vowelA;
				System.out.println(" ");
				System.out.println( " The most reocurring vowel was " + maxVowel);
		}
		else if ((counterE > counterA) && (counterE > counterO) && (counterE > counterI) && (counterE > counterU) && (counterE > counterY)) {
				char maxVowel = vowelE;
				System.out.println(" ");
				System.out.println( " The most reocurring vowel was " + maxVowel);	
		} 
		else if ((counterI > counterA) && (counterI > counterO) && (counterI > counterE) && (counterI > counterU) && (counterI > counterY)) {
				char maxVowel = vowelI;
				System.out.println(" ");
				System.out.println( " The most reocurring vowel was " + maxVowel);	
		}
		else if ((counterO > counterA) && (counterO > counterI) && (counterO > counterE) && (counterO > counterU) && (counterO > counterY)) {
				char maxVowel = vowelO;
				System.out.println(" ");
				System.out.println( " The most reocurring vowel was " + maxVowel);	
		}
		else if ((counterU > counterA) && (counterU > counterI) && (counterU > counterE) && (counterU > counterO) && (counterU > counterY)) {
				char maxVowel = vowelU;
				System.out.println(" ");
				System.out.println( " The most reocurring vowel was " + maxVowel);	
		}
		else if ((counterY > counterA) && (counterY > counterI) && (counterY > counterE) && (counterY > counterO) && (counterY > counterU)) {
				char maxVowel = vowelY;
				System.out.println(" ");
				System.out.println( " The most reocurring vowel was " + maxVowel);	
		}

		double averageCount = ((double)(totalCharacters) / (numberOfWords)); // declares average

		System.out.println(" There were: " + numberOfWords + " word(s) in your string");
		System.out.println(" Average word length was " + averageCount + " characters " + " per word");
		System.out.println(" There were " + numberOfVowels + " vowels in your String");

	} // end of method

} // end of Class