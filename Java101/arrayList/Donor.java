package arrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class Donor {
	static File inputFile;
	static Scanner myScanner;
	static Scanner input;
    static int columns = 8;
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zipCode;
	int contriubution;
	String date;
		
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("What is the file path? ");
		String filePath = input.nextLine();
		try {
			inputFile = new File(filePath); //C:/Users/HuseenSufi/Desktop/java/Lab1/src/arrayList/sample-mailing-list.txt
			myScanner = new Scanner(inputFile); //using scanner to read
			ArrayList<Donor> donorArray = new ArrayList<Donor>();
			readInDonors(donorArray);
			//sortDonors(donorArray);
			//topTenDonors(donorArray);
			//addDonor(donorArray);
			removeDonor(donorArray);
			donorsByContribution(donorArray);
			donorsByZipCode(donorArray);
		}
		catch (FileNotFoundException e) {
        	System.out.println("ERROR: " + e);
        } 
		
	}
	
	public Donor(String firstName, String lastName, 
		String address, String city, String state, String zipCode, int contribution, String date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.contriubution = contribution;
		this.date = date;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public int getContribution() {
		return this.contriubution;
	}
	public String getZipCode() {
		return this.zipCode;
	}
	
	/*
	 * @input 
	 * 	ArrayList<Donor> donorArray - The array of donors to fill
	 */
	public static void readInDonors(ArrayList<Donor> donorArray) {
		myScanner.nextLine(); //Reads one line into file, past header information
		
		while(myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			String donorInfo[] = line.split(",");
			Donor newDonor = new Donor(donorInfo[0], donorInfo[1], donorInfo[2], donorInfo[3], 
					donorInfo[4], donorInfo[5], Integer.parseInt(donorInfo[6]), donorInfo[7]);
					donorArray.add(newDonor);
		}
	}
	
	public static void sortDonors(ArrayList<Donor> donorArray) {
		Comparator<Donor> compareName = new CompareByName();
		Collections.sort(donorArray, compareName);
	}
	
	public static void topTenDonors(ArrayList<Donor> donorList) {
		if (donorList == null) {
			System.out.println("Donor List is empty!");
			return;
		}
		Comparator<Donor> compareContribution = new CompareByDonation();
		//Comparator<Donor> reverse = Collections.reverseOrder(); 
		Collections.sort(donorList, compareContribution);
		//Collections.sort(donorList, Collections.reverseOrder());
		
		int length = donorList.size() - 1;
		int stop = 10;
		if (length < stop) stop = length;
		System.out.println("Here are up to the top ten contributors!");
		for (int i = 0; i < stop; i++) {
			System.out.println(i+1 + "\n" + donorList.get(i));
		}
	}
	public static void donorsByContribution(ArrayList<Donor> donorArray) {
		ArrayList<Donor> donorsGreaterThanX = new ArrayList<Donor>();
		System.out.println("Enter contribution amount X for all donors with greater than X contribution: "  );
		int X = input.nextInt();
		for(int i = 0; i<donorArray.size(); i++) {
			if(donorArray.get(i).getContribution() > X) {
				donorsGreaterThanX.add(donorArray.get(i));
				sortDonors(donorsGreaterThanX);
				System.out.println(" Donors Greater than $X " + donorsGreaterThanX);
			}
		}
	}
	
	public static void donorsbyFamily(ArrayList<Donor> donorArray) {
		
	}
	
	public static void donorStats(ArrayList<Donor> donorArray) {
	//for each zipcode find all donors that have same zipcode, total there contributions, then using number of donors in that zipcode/total contributions.
		
	}
	
	public static void donorsByZipCode(ArrayList<Donor> donorArray) {
		ArrayList<Donor> donorsInZipCode = new ArrayList<Donor>();
		System.out.println("Enter zipcode XXXXX for all donors in  Zip Code: "  );
		String X = input.next();
		for(int i = 0; i<donorArray.size(); i++) {
			if(donorArray.get(i).getZipCode().equals(X)) {
				donorsInZipCode.add(donorArray.get(i));
				sortDonors(donorsInZipCode);
				System.out.println(" Donors in Zip Code XXXXX " + "/n" + donorsInZipCode);
			}
		}
	}
	
	
	
		public static void addDonor(ArrayList<Donor> newDonorArray) {
	    System.out.println("To add a donor enter info as follows: firstName,lastName,address,city,state,zipcode,contribution, date");
	    String userInput = input.nextLine();
	    String [] inputSplit =  userInput.split(",");
	    Donor addedDonor = new Donor(inputSplit[0],inputSplit[1],inputSplit[2],inputSplit[3],inputSplit[4],inputSplit[5], Integer.parseInt(inputSplit[6]),inputSplit[7]);
	    newDonorArray.add(addedDonor);
	    sortDonors(newDonorArray);
	    System.out.println(newDonorArray);
	}
		public static void removeDonor(ArrayList<Donor> removedDonorArray) {
		    System.out.println("which donor would you like to remove? enter the donor as follows: firstName,lastName");
		    String userInput = input.nextLine();
		    String [] nameSplit = userInput.split(","); 
			int length = removedDonorArray.size();
		    for(int i=0; i< length; i++) {
		    	//check if finds match
		    	//System.out.println("Donor name == readInput " + nameSplit[0].equals(removedDonorArray.get(i).firstName));
		    	if(nameSplit[0].equalsIgnoreCase(removedDonorArray.get(i).firstName) && nameSplit[1].equalsIgnoreCase(removedDonorArray.get(i).lastName)) {
		    			System.out.println("removed " + removedDonorArray.remove(i));
			    		removedDonorArray.remove(i);
			    		sortDonors(removedDonorArray);
			    		System.out.println(removedDonorArray);
		    		break;
		    	}
		    	
		    }
		}
		
	
	@Override
	public String toString() {
		String toReturn = "";
		toReturn += "Donor: \n";
		if (this.firstName != "") toReturn += "FirstName: " + this.firstName + "\n";
		toReturn += "LastName: " + this.lastName + "\n";
		toReturn += "Address: " + this.address + "\n";
		toReturn += "City: " + this.city + "\n";
		toReturn += "State: " + this.state + "\n";
		toReturn += "ZipCode: " + this.zipCode + "\n";
		toReturn += "Contribution: " + this.contriubution + "\n";
		toReturn += "Date: " + this.date;
		return toReturn + "\n";
	}	
}
