package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;


public class howManyTimes {

	public static void main(String[] args) {
		try(BufferedReader reader  = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			int [] arrayPointer = randomArray();
			String toPrint = Arrays.toString(arrayPointer);
			System.out.println(toPrint);
			System.out.println("Value to Find: ");
			String value = reader.readLine();
			int toFind = Integer.parseInt(value);
			findValue(arrayPointer, toFind);
			
		} catch (IOException | NumberFormatException e) {
			System.err.println(e);
		}
	}
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((100-0 + 1) + 0);

		return randNum;
	}
	
	private static int[] randomArray() {
		int[] randArray = new int [10];
		
		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = randInt(0, 50);
		}
		return randArray;
	}
	
	private static boolean findValue(int[] randArray, int toFind) {
		boolean found = false;
		
			for (int i = 0; i < randArray.length; i++) {
				if (randArray[i] == toFind) {
					//count+=1;
					System.out.println("\n" + toFind + " was found at slot " + i);
					found = true;
					continue;
					//+ count + " times");
					//return true;	
				}
			}
			if (!found) {
				System.out.println("\n" + toFind + " was not found: ");//+ count + " times");
			} 
			return false;
	}
}
