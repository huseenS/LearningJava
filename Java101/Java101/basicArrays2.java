

public class basicArrays2 {

	public static void main(String[] args) {
		randomArray();
	}
	
	private static void randomArray() {
		
		int[] myArray = new int[10];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() *100);
			System.out.println ("slot" + i + " contains a " + myArray[i]); 
		}
	}

}
