package JavaLearn;

import java.util.Arrays;

public class giveArrayValues {

	public static void main(String[] args) {
		initalizeArray(1,"alpha", "bravo", "charlie", "delta", "echo");
	
	}
	public static void initalizeArray(int arrayCount,String val1, String val2, String val3, String val4, String val5) {
		String[] arr1 = { val1, val2, val3, val4, val5 };
		int[] arr2 = {11,22,33,44,55};
		String toPrint = Arrays.toString(arr2);
		System.out.print("The " + arrayCount + "st array is filled with the following values:\n");
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print( arr1[i] + " " );
			System.out.println();
		}
		System.out.println("The second array is filled with the following values \n " + toPrint);
	}
}
