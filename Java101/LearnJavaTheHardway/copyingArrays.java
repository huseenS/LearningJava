package JavaLearn;

import java.util.Random;

public class copyingArrays {

	public static void main(String[] args) {
		firstArray();
	}
	
	private static void firstArray() {
		int[] firstArray = new int[10];
		int[] secondArray = new int[10];
		System.out.print("Array 1: ");
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = randInt(1, 100);
			System.out.print( firstArray[i] + "  ");
			System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);
		}
		System.out.println();
		System.out.print("Array 2: ");
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + "  ");

		}
		
	}
	
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((100-0 + 1) + 0);

		return randNum;
	}
	
	

	

}
