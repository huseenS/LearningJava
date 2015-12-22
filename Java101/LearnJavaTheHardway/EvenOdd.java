package JavaLearn;

public class EvenOdd {
	
		public static void main(String[] args) {
			for (int i = 0; i <= 20; i++) {
				System.out.print(i);
				if (isDivisible3(i) && isDivisible2(i)) {
					System.out.print(" =" + " *");
					
				} else if (isDivisible3(i)) {
					System.out.print(" = ");
				} else if (isDivisible2(i)) {
					System.out.print(" * ");
				} else if (isPrimeNum(i)) {
					System.out.print(" & ");
				}
				System.out.println();
			}
		}
		public static boolean isDivisible2(int n) {

			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
		public static boolean isDivisible3(int n) {

			if (n % 3 == 0) {
				return true;
			} else {
				return false;
			}
		}
		public static boolean isPrimeNum(int n) {
			if (n == 0) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0 ) {
					return false;
				}
			}
			return true;
		}
}
