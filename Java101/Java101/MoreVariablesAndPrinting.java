public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Huseen M. Sufi";
		myAge = 20; //true
		myHeight = 72; //inches
		myWeight = 155;
		myTeeth = "White";
		myHair = "Brown";
		myEyes = "Black";
	    double myHeightInCm = myHeight*2.54;
		double myWeightInKg = myWeight*2.204;



		System.out.println("Lets talk about " + myName + ".");
		System.out.println("I am " + myHeight + " inches tall " + "(or " + myHeightInCm + "cm)" + " tall" );
		System.out.println("I am " + myWeight + " pounds heavy " + "(or " + myWeightInKg + "kg)" + "heavy)"); 
		System.out.println("Not to heavy.");
		System.out.println("I've got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("Teeth are usually " +myTeeth + "Depending on brushing habits.");

		System.out.println("if I add " + myAge + "," + myHeight + ", and " + myWeight 
			+ " I get " + (myAge + myHeight + myWeight) + ".");
		
	}
}