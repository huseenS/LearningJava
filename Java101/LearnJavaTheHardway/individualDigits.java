package JavaLearn;

public class individualDigits {

	public static void main(String[] args) {
		getDigits();
	}
	private static void getDigits() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int sum = i + j;
				System.out.print(i + "" + j + ", " + i + "+" + j + " = " + sum + "\n");
			}
		}
	}
}
