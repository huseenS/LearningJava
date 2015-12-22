package JavaLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class summingThreeNumbersFromAFile {

	public static void main(String[] args)  {
		try(BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			System.out.println("Which file would you like to read from?");
			String fileName = reader.readLine();
			sumThree(fileName);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	private static int  sumThree(String file) {
		File myFile = new File(file);
		int sum = 0;
		try (Scanner scanner = new Scanner(new FileReader(myFile))) {
			String line = scanner.next();
				String[] myArray = line.split(",");
						//System.out.println(scanner.nextLine());
						for (int i = 0; i < myArray.length; i++) {
							sum+=Integer.parseInt(myArray[i]);
							System.out.print(myArray[i] + " ");		
						} 
				System.out.print("\n" + "Total is: " + sum);
		}catch ( NumberFormatException e) {
				System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		return sum;
	}
}
