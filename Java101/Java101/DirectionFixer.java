//
import java.util.Arrays;

public class DirectionFixer {

	public static String[] reverseDirections(String[] streets ) {
		String[] testArray = new String [streets.length];
		for (int i =0; i < streets.length; i++) {
			if (i == streets.length-1) {
			testArray[i] = streets[i];
			}
			else {
				testArray[i] = streets[streets.length-2-i]; 
			}
			if (String.charAt(i) = "R") {
				String.charAt(i) = "L";
			}

	}	
			System.out.println(Arrays.toString(testArray));
					return testArray;
		
		
}
		
	


	public static void main(String[] args) {
		String[] noobOriginal = 
		{"Leave heading R on Wicker Way",
		"L on Gold Street",
 		"L on Duncan Road",
		"L on Turtle Avenue",
 		"R on Platinum Way",
 		"Arrive on the R"};
 		reverseDirections(noobOriginal);
	}
}