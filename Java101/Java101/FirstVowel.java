

public class FirstVowel {

	public static void main(String[] args) {

		String input = "crfufafasdfvbcdsnch";
		
		Boolean foundVowel = false;
		int currentIndex = 0;
		while (! foundVowel) {
			char c = input.charAt(currentIndex);
			
			if (((c) == 'a')
			|| ((c) == 'e' )
			|| ((c) == 'i' )
			|| ((c) == 'o' )
			|| ((c) == 'u' )) {

				foundVowel = true;
			} //end if

			else {
				currentIndex++;
			}
		} //endwhile

		System.out.println("First Vowel index is " + currentIndex);
			
		
	}// end main
} // end class