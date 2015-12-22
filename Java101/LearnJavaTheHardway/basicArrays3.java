package JavaLearn;

import java.util.Random;

public class basicArrays3 {

	public static void main(String[] args) {
		thousandArray();
	}
	
	private static void thousandArray() {
		int[] myArray = new int[1000];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = randInt(1, 100);
			System.out.println();
			System.out.print( myArray[i] + "  ");
		}
	}
	
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((100-0 + 1) + 0);
	
		return randNum;
	}

}
