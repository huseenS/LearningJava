
import java.util.Arrays;


public class ArrayFix {



	public static int[] fixArray(int[] monthlysalaries) {
		int[] fixed = new int[monthlysalaries.length - 1];
		for (int i=0; i < monthlysalaries.length -1; i++) {
			fixed[i] = monthlysalaries[i+1];
			}
			
			System.out.println(Arrays.toString(fixed));
			return fixed;
	}

	public static void main(String[] args) {
		int[] noobsArray = { 0, 15003, 11623, 13128, 9812, 5634, 18180, 10600, 4588, 7552, 9817, 12987, 2398};

		fixArray(noobsArray);
	}



}