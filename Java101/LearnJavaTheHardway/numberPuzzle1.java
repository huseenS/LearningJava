package JavaLearn;


public class numberPuzzle1 {

	public static void main(String[] args) {
		numberPairs();
	}
	
	private static void numberPairs() {
		int sum = 60;
		int diff = 14;
		for (int i = 10; i < 99; i++) {
			for (int j = 10; j < 99; j++) {
				if ((i + j) == sum && (i-j) == diff) {
					System.out.print(i + "  " + j);
				}
			}
		}
	}

}