package wave;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wave {

	ArrayList<Integer> waveValues;


	public Wave() {
		waveValues = new java.util.ArrayList<Integer>();

	}

	public ArrayList<Integer> getWaveValues() {
		return waveValues;
	}


	public void readWaveData(String filename) {
		File inputFile = new File(filename);
		@SuppressWarnings("resource")
		Scanner myScanenr;
		try {
			myScanenr = new Scanner(inputFile);
			
			while (myScanenr.hasNextInt()) {
				int currentInt = myScanenr.nextInt();
				waveValues.add(currentInt); //auto converts to integer object

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}