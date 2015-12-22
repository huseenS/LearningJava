import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Benford {


	public void runBenford(String filename) {
		File inputFile = new File(filename);
		Scanner myScanner = new Scanenr(inputFile);

		//leading digit counts as an array
		int[] digitCounts = new int[];
		int cityCount = 0;

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

		public static void main(String[] args) {
			
		}
	}
}
