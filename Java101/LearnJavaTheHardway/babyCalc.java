package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class babyCalc {

	public static void main(String[] args) {
		inputParser();
	}
	
	private static void inputParser() {
	boolean isInputZero = false;
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader
			(System.in, StandardCharsets.UTF_8) )) {
			double a,b,c = 0;
			String op;
			System.out.println("Welcome to Baby Calc!");
			while (!isInputZero) {
				System.out.println("Input");
				String input = reader.readLine();
				String[] inputArray = input.split("");
				int length = inputArray.length;
				if (length != 3) {
					System.out.println("Error.");
					continue;
				}
				
				a = Double.parseDouble(inputArray[0]);
				b = Double.parseDouble(inputArray[2]);
				op = inputArray[1];
				
				if (op.equals("+")) {
					c = a + b;
				} else if (op.equals("-")) {
					c = a - b;
				} else if (op.equals("/")) {
					c = a / b;
				} else if (op.equals("*")) {
						c = a * b;
				} else if (op.equals("^")) {
					c = Math.pow(a, b);
				} else {
					System.out.println("Undefined operator: " + op + ".");
				}
				System.out.println(c);
					
			}
			
		} catch (IOException | NumberFormatException e) {
			System.err.println(e);
		}
	}
	

}
