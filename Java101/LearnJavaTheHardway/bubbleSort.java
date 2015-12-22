package JavaLearn;
/**
 * 
 * @author Huseen Sufi
 * Implementation of bubble sort algorithm
 * includes a counter to check number of total swaps made
 *
 */
public class bubbleSort {
	
		public int [] sort( int[] toBubbleSort ) {
			boolean isSwapped = false; //boolean flag
			int swapCount = 0;
			while (!isSwapped) {
				for (int i = 0; i < toBubbleSort.length -1; i++) {
						if (toBubbleSort[i] > toBubbleSort[i+1]) { //if the current index value is larger than the next value
							swap(toBubbleSort, i, i+1); //swap the two elements 
							isSwapped = true;
							swapCount++; //increment
						}
					}
				}
			System.out.println("\n" + swapCount); //show the swap
			return toBubbleSort;
		}
		
		public static void swap( int[] a , int i, int j ) {
			
			int swap = a[i];
			a[i] = a[j];
			a[j] = swap;
			
		}
}

