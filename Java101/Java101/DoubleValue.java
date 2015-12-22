//
//
public class DoubleValue {

	public static int doubleIt(int singleValue) { //return datetype, name, (input parameter list) //defined function can now use it in other methods
		int doubleValue = 2 * singleValue;
		return doubleValue; //final output
}

public static void main(String[] args) {
	
	int result = doubleIt(11); //evaluates to the return value. Result can ve used elsewhere 
	int result2 = doubleIt(73);

	System.out.println(result);
	System.out.println(result2);
}

}