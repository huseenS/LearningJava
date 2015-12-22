package Lab;
import Lab.Donor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DonorList {
	static Scanner myScanner;
   
   private ArrayList<Donor> donorArrayList = new ArrayList<>();
    
    	public static void readDonorInfo(ArrayList<Donor> donorArray) {
    		try {
    			File inputFile = new File("C:/Users/Huseen Sufi/Desktop/java/sample-mailing-list.txt");
    			Scanner myScanner = new Scanner(inputFile); //using scanner to read
    			myScanner.nextLine(); // Reads one line into the file, past header info
		
		while(myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			String donorInfo[] = line.split(",");
			Donor nextDonor = new Donor(donorInfo[0], donorInfo[1], donorInfo[2],donorInfo[3], donorInfo[4], donorInfo[5], Integer.parseInt(donorInfo[6]), donorInfo[7]);
			donorArray.add(nextDonor);
			
		
		}
		Collections.sort(donorArray);
    		}
    		catch (FileNotFoundException e) {
            	System.out.println("ERROR: " + e);
            } 		
    		
	}
    		
	
		
	public static void main(String[] args) {
		
		//Array to fill with Donor objects
		ArrayList<Donor> donorArray = new ArrayList();
		readDonorInfo(donorArray);
		System.out.println(donorArray);
		}	
	
	
	public void addDonor() {
	    Scanner myScanner = new Scanner(System.in);
	    System.out.println("To add a donor enter info as follows:firstName,lastName,address,city,state,zipcode,contribution, date");
	    String userInput = myScanner.nextLine();
	    String [] inputSplit =  userInput.split(",");
	    Donor addedDonor = new Donor(inputSplit[0],inputSplit[1],inputSplit[2],inputSplit[3],inputSplit[4],inputSplit[5], Integer.parseInt(inputSplit[6]),inputSplit[7]);
	    donorArrayList.add(addedDonor);
	   
	}
	public void removeDonor() {
	    Scanner myScanner = new Scanner(System.in);
	    System.out.println("which donor would you like to remove? enter the donor as follows: firstName,lastName ");
	    String userInput = myScanner.nextLine();
	    String [] inputSplit = userInput.split(",");
	    Donor removedDonor = new Donor(inputSplit[0], inputSplit[1], null,null,null,null,0,null);
	    donorArrayList.remove(removedDonor);
	}
	
	public void FindIndividualByContributionAmount() {
	    
	}
	
	public void printTopTenIndividuals() {
	    
	}
	
}