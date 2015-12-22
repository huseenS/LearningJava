package JavaLearn;

public class basicArrays0 {

	public static void main(String[] args) {
		myArray();
	}
	private static void myArray() {
		int[] myArray;
		myArray = new int[10];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = -113;
		}
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("slot" + i + " contains a " + myArray[i]);

		}
	}

}
