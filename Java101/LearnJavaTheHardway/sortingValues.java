package JavaLearn;

import java.util.Arrays;

public class sortingValues {

	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ ) {
			System.out.print( arr[i] + " " );
			System.out.println();
		}
		
		//swaps elements
		for ( int i = 0; i < arr.length ; i++ ) {
			for (int j = 0; j < arr.length ; j++ ) {
				int temp;
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		// Display the values again, now (hopefully) sorted.
		String array = Arrays.toString(arr);
		System.out.print("after : ");
			System.out.print(array);
		
	}
}

