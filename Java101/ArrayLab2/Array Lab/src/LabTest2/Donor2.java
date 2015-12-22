package LabTest2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Donor2 implements Comparable<Donor2> {

 private ArrayList<Donor2> donorArrayList = new ArrayList<>();
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
	public Donor2(String _firstName, String _lastName, String _address, String _city, String _state, String _zipCode, int _contribution, String _date) {
		firstName = _firstName;
		lastName = _lastName;
		address = _address;
		city = _city;
		state = _state;
		zipcode = _zipCode;
		contribution = _contribution;
		date = _date;
	}

	public String getFirstName(){
	    return this.firstName;
	}
	public String getLastName() {
	    return this.lastName;
	}

	@Override
	 public String toString() {
	 	String toReturn = "";
	 	toReturn += "Donor: \n";
	 	toReturn += "FirstName: " + firstName + "\n";
	 	toReturn += "LastName: " + lastName + "\n";
	 	toReturn += "Address: " + address + "\n";
	 	toReturn += "City: " + city + "\n";
	 	toReturn += "State: " + state + "\n";
	 	toReturn += "zipCode: " + zipcode + "\n";
	 	toReturn += "Contribution: " + contribution + "\n";
	 	toReturn += "Date: " + date;
	 	return toReturn + "\n";
	 }
	 @Override
	public int compareTo(Donor2 donor) {
		if(donor.getFirstName().equalsIgnoreCase(this.firstName)) {
		    if(donor.getLastName().equalsIgnoreCase(this.lastName)) {
		       return 0;  
		    }
		}
		
		return 1;
		
	}

	public static void main(String[] args) {
		
		//Array to fill with donor objects
		ArrayList<Donor2> donorArray = new ArrayList();
		readDonorInfo(donorArray);
		}	
	
	
	public static void readDonorInfo(ArrayList<Donor2> donorArray) {
		try {
			File cvsFile = new File("C:/Users/Huseen Sufi/Desktop/java/Array Lab/src/LabTest2/sample-mailing-list.txt");
			Scanner readCvs = new Scanner(cvsFile); //using scanner to read
			readCvs.nextLine(); // Reads one line into the file, past header info
			
			while(readCvs.hasNextLine()) {
				String line = readCvs.nextLine();
				String donorInfo[] = line.split(",");
				Donor2 newDonor = new Donor2(donorInfo[0], donorInfo[1], donorInfo[2],donorInfo[3], donorInfo[4], donorInfo[5], Integer.parseInt(donorInfo[6]), donorInfo[7]);
				donorArray.add(newDonor);
	
	
			}
			Collections.sort(donorArray);
			System.out.println(donorArray);
		}
		catch (FileNotFoundException e) {
        	System.out.println("ERROR: " + e);
        } 
	}


		public void addDonor() {
	    Scanner addPrompt = new Scanner(System.in);
	    System.out.println("To add a donor enter info as follows:firstName,lastName,address,city,state,zipcode,contribution, date");
	    String userInput = addPrompt.nextLine();
	    String [] inputSplit =  userInput.split(",");
	    Donor2 addedDonor = new Donor2(inputSplit[0],inputSplit[1],inputSplit[2],inputSplit[3],inputSplit[4],inputSplit[5], Integer.parseInt(inputSplit[6]),inputSplit[7]);
	    donorArrayList.add(addedDonor);
	   
	}
		public void removeDonor() {
	    Scanner removePrompt = new Scanner(System.in);
	    System.out.println("which donor would you like to remove? enter the donor as follows: firstName,lastName ");
	    String userInput = removePrompt.nextLine();
	    String [] inputSplit = userInput.split(",");
	    Donor2 removedDonor = new Donor2(inputSplit[0], inputSplit[1], null,null,null,null,0,null);
	    donorArrayList.remove(removedDonor);
	}





}