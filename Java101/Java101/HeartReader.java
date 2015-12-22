import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class HeartReader {
	public static double getAverageHR(String filename) {
		try {
			File myFile = new File(filename);
			Scanner myScanner = new Scanner(myFile);

			int sumHRs = 0;
			int numLines = 0;

			while (myScanner.hasNextInt()) {
				int seconds = myScanner.nextInt();
				int heartRate = myScanner.nextInt();
				sumHRs += heartRate;
				numLines++;
			}

		return ((double)sumHRs) / numLines;
		}
		catch(FileNotFoundException e) {
			System.out.println("ERROR " + e);
			return 0;
		}
	}	


		public static void main(String[] args) {
			double average = getAverageHR("heartrates.txt");
			System.out.println("Average HR " + average );
		}
}