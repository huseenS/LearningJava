package Lab;
import java.util.Scanner;

public class Donor implements Comparable<Donor> {
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
	public int compareTo(Donor donor) {
		if(donor.getFirstName().equalsIgnoreCase(this.firstName)) {
		    if(donor.getLastName().equalsIgnoreCase(this.lastName)) {
		       return 0;  
		    }
		    //now check to see if the second name is matching....
		}
		
		return 1;
		
	}
	
	public String getFirstName(){
	    return this.firstName;
	}
	public String getLastName() {
	    return this.lastName;
	}
	
	public static void main(String[] args) {
		
	}
}

