import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Donor {
	int columns = 8;
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zipcode;
	int contribution;
	String date;
   static Scanner myScanner;

	
	//donor object 
	public Donor(String _firstName, String _lastName, String _address, String _city, String _state, String _zipCode, int _contribution, String _date) {
		firstName = _firstName;
		lastName = _lastName;
		address = _address;
		city = _city;
		state = _state;
		zipcode = _zipCode;
		contribution = _contribution;
		date = _date;
	}

	public static void main(String[] args) {
		try {
		File inputFile = new File("sample-mailing-list.txt");
		myScanner = new Scanner(inputFile); //using scanner to read


		//Array to fill with donor objects
		ArrayList<Donor> donorArray = new ArrayList();
		readDonorInfo(donorArray);

		}
		
		catch (FileNotFoundException e) {
        	System.out.println("ERROR: " + e);
        } 
		
	}

	//public static int countLines; {
		//int count = 0;
		//while(myScanner.hasNextLine()) {
			//count++;
		//}

	//return count;

	public static void readDonorInfo(ArrayList<Donor> donorArray) {
		myScanner.nextLine; // Reads one line into the file, past header info
		
		while(myscanner.hasNextLine()) {
			String line = myScanner.nextline();
			String donorInfo[] = line.split(",");
			Donor newDonor = new Donor(donorInfo[0], donorInfo[1], donorInfo[2],donorInfo[3], donorInfo[4], donorInfo[5], Integer.parseInt(donorInfo[6], donorInfo[7]));
			donorArray.add(newDonor);


		}
	}
}