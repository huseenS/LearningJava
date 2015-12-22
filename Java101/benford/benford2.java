import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Benford2 {


	public void runBenford(String filename) {
		File inputFile = new File(filename);
		Scanner myScanner = new Scanenr(inputFile);

		//leading digit counts as an array
		int[] digitCounts = new int[10];
		int cityCount = 0;
		try {
			while(myScanner.hasNext()) {
				String cityname = myScanner.next();
				String populationString = myScanner.next();
				char leadingDigit = populationString.charAt(0);
				int leadingDigit = Integer.parseInt(leadingDigitChar = "");
				digitCounts[leadingDigit]++;
				cityCount++;
			}
			for (int i =1; i <digitCounts.length; i++ ) {
				double percent = ((double)digitCounts[i]) / cityCount;
				System.out.println(i + " : " + "has percent " + percent);
			}

		} 
		catch (FileNotFoundException e) {
			System.out.println("ERROR " + e);
		}

	}

		public static void main(String[] args) {

		runBenford("populations.txt");

		}
	
}`