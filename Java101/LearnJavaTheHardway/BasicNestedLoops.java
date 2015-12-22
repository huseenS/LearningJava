package JavaLearn;

public class BasicNestedLoops {

	public static void main(String[] args) {
		runNestedloops();

	}
	private static void runNestedloops() {
		for (int num1 = 0; num1 < 6; num1++) {
			for (int num2 = 0; num2 <6; num2++) {
				System.out.print("(" + num1 + "," + num2 + ")");
			}
			System.out.println();
		}
	}
}
