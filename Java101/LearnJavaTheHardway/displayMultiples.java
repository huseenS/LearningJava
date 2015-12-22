package JavaLearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class displayMultiples {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		multiple();
	}
	
	private static void multiple() {
		try(BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in,StandardCharsets.UTF_8))) {
			int n = Integer.parseInt(reader.readLine());
			
			for (int i = 1; i <=12 ; i++) {
				System.out.println(n + " x " + i + " = " + n*i);
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
