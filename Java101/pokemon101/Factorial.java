package pokemon101;

public class Factorial {
	
	public static long fact(int n) {
		//BASE CASE
		if (n == 1) {
			return 1;
		}
		else {
			return n * fact(n -1);
		}


	}

	public static void main(String[] args) {
		System.out.println(fact(10));
	}


}