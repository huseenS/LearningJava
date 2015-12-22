

public class Reverse2 {

	public static String getStreeName(String[] directions, int index) {

		String currentDirection = directions[index];
		if (index == 0) {
			return currentDirection.substring(19);
		}
		else {
			return currentDirection.substring(5);

		}

	}

	public static char getTurn(String[] directions, int index) {
		String currentDirection = directions[index];
		if (index == 0 || index == directions.length -1) {
			return currentDirection.charAt(14);
		}
		else {
			return currentDirection.charAt(0);
			
		}

	}

	public static char flipTurn(char input) {
		if (input == 'L') {
			return 'R';
		}
		else {
			return 'L';
		}
	}

	public static String[] reverseDirections(String [] noobsDirections) {
		String[] correctDirections = new String[noobsDirections.length]; 

		// working on first step
		char correctTurn =flipTurn(getTurn(noobsDirections, noobsDirections.length - 1));
		String streetName = getStreeName(noobsDirections, noobsDirections.length -2);
		correctDirections[0] = "Leave heading " + correctDirections + " on " + streetName;
		
		//working on middlle steps
		for (int i = 1; i < noobsDirections.length - 1 - i; i++) {
			 correctTurn = flipTurn(getTurn(noobsDirections, noobsDirections.length - 1));
			 streetName = getStreeName(noobsDirections, noobsDirections.length -2 -i);
			 correctDirections[i] =  correctTurn + " on " + streetName;
		}

		//working on last step
		 correctTurn = flipTurn(getTurn(noobsDirections, noobsDirections.length - 1));
		 correctDirections[noobsDirections.length - 1] = "Arrive on the " + correctTurn;

		 return correctDirections;




	}


	public static void main(String[] args) {
		String[] noobsDirections = {"Leave heading R on Wicker Way",
		"L on Gold Street",
 		"L on Duncan Road",
		"L on Turtle Avenue",
 		"R on Platinum Way",
 		"Arrive on the R"};

 		String[] correctDirections = reverseDirections(noobsDirections);
 			for (int i =0; i<correctDirections.length; i++) {
 				System.out.println(correctDirections[i]);
 				
 			}
		
	}



}