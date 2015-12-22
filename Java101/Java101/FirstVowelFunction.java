

public class FirstVowelFunction {

	public static int firstVowel(String inputString) {
		
		Boolean foundVowel = false;
		int currentIndex = 0;

		while (! foundVowel) {
			char c = inputString.charAt(currentIndex);
			
			if (((c) == 'a') || ((c) == 'e' ) || ((c) == 'i' ) || ((c) == 'o' ) || ((c) == 'u' )) {

				foundVowel = true;
			} 

			else {
				currentIndex++;
			}
		} //endwhile

		return currentIndex;
			
	}

	public static void main(String[] args) {

		int vowelLocation = firstVowel("crunch");
		System.out.println("First Vowel index is " + vowelLocation);
		
	}// end main
} // end class