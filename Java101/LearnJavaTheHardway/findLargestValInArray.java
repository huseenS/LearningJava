package JavaLearn;

import java.util.Arrays;
import java.util.Random;


public class findLargestValInArray {

	public static void main(String[] args) {
		int [] arrayPointer = fillRandArray();
		String toPrint = Arrays.toString(arrayPointer);
		System.out.println("\n" + toPrint);
		findLargestValue(arrayPointer);
		
	}
	
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((100-0 + 1) + 0);

		return randNum;
	}
	
	private static int[] fillRandArray() {
		int[] rand = new int [10];
		
		for (int i = 0; i < rand.length; i++) {
			rand[i] = randInt(0, 100);
			System.out.println("Slot " + i + " is " + rand[i] + ",");
		}
		
		return rand;
	}
	
	private static int findLargestValue(int[] randArray) {
		int lValue = 0;
		int pos = 0;
		
		for (int i = 0; i < randArray.length; i++) {
			if (randArray[i] > lValue) {
				lValue = randArray[i];
				pos = i;
			}
		}
		System.out.println("Largest value is: " + lValue + " at slot: " + pos);
		return lValue;
	}
	
}
