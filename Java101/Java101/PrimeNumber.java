// prime code

import java.util.Scanner;

public class PrimeNumber { 

	public static void main(String[] args) {

		

		//get user input
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();

		// 25 % 5
		// loop to check possible divisors
		// going from 2 to sqrt(n) + 1
		
		for (int i = 2; i <Math.sqrt(n) +1; i++ ) {
			if (n % i == 0) {
				System.out.println(i + " is a divisor of " + n);
				System.out.println(n/i + " is a divisor of " + n);
			}
			
		}


		// check for divisor using if and modulos

		//stop when we find a divisior

	}
}

