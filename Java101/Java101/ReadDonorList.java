import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ReadDonorList {

	public void SortAlphabetically(String file_name) {
		File inputFile = new File(file_name);
		Scanner myScanner = new Scanner(inputFile); //using scanner to read
		try {
	
			while(myScanner.hasNextLine()) {
				String line = myScanner.nextLine();
				String donorArray[]=line.split(",");
				Arrays.sort(donorArray);

				for (int i =0; i<donorArray.length; i++ ) {
					System.out.println(donorArray[i]);
				}
			}
		}
		catch (FileNotFoundException e) {
        	System.out.println("ERROR: " + e);
        } 
		
	}

	public static void main(String[] args) {
		SortAlphabetically("sample-mailing-list.txt");
	}
		
	 	
}








	
 