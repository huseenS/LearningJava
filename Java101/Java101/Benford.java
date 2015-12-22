import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Benford {

		//textbook section "how to" 7.1
	public static String extractCountry(String line) {
			int i = 0;
			while (!Character.isDigit(line.charAt(i))) { i++; }
			String countryName = line.substring(0, i).trim();
			return countryName;
	}
		///textbook section "how to" 7.1
	public static int extractPopulation(String line) {
		int i =0;
		while(!Character.isDigit(line.charAt(i))) { i++; }
		String population = Integer.parseInt(line.substring(i).trim());
		return population;
	}

	public static void benfordTest(String inFileName) {
		try {
			File inputFile = new File(inFileName);
			Scanner myScanner = new Scanner(inputFile);
			int[] leadingArray = new int[10];
			int populationCount = 0;
			while (myScanner.hasNextLine()) {
				String lines = myScanner.next();
				String extractedCountry = extractCountry(lines);
				String extractedPopulation = extractedPopulation(lines);

				int leadingDigit = Integer.parseInt(extractedPopulation.charAt(0) + "");
				leadingArray[leadingDigit]++; 
				populationCount++;
				Double percentage = (leadingArray[leadingDigit]) / populationCount;
			}
			return leadingArray;

		}

		catch (FileNotFoundException e) {
			System.out.println("ERROR " + e);
		}


		}

	

	public static void main(String[] args) {
		benfordTest(populations.txt, benford.txt);
	}
}