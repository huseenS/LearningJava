package JavaLearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;

public class gradesInAnArray {

	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			
			System.out.println("Name(first and last): ");
			String userName = reader.readLine();
			System.out.println("enter File name");
			String toName = reader.readLine();
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
					(new FileOutputStream(toName), "utf-8"));
			System.out.println("Awesome, your fileName is: " + toName);
			System.out.println("Here are your randomly selected grades:");
			System.out.println();
			writer.write(userName);
			writer.newLine();
			int[] copyArray = gradeArray();
			String toPrint = Arrays.toString(copyArray);
			writer.write(toPrint);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace(); //print the stackTrace
		} 		
	}
	
	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((100-0 + 1) + 0);

		return randNum;
	}
	
	private static int[] gradeArray() {
		int[] grades = new int [10];
		
		for (int i = 0; i < grades.length; i++) {
			grades[i] = randInt(0, 100);
			//System.out.println("Grade: " + i + " " + grades[i] + ",");
		}
		
		
		return grades;
	}
	
	

}
