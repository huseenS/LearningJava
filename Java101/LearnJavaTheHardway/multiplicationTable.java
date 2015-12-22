package JavaLearn;

public class multiplicationTable {

	public static void main(String[] args) {
		System.out.println ("========================================");
		table();

	}
	private static void table() {
		int i =0;
		for ( i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.print(i*j + "  ");
			}
			System.out.println("\n");
		}
	}

}
