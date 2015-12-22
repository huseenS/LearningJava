//
public class ZipCode {

	public static String getDigitCode( int digit) {

		if (digit == 0) {
			return "||:::";
		}
		else if (digit == 1) {
			return ":::||:";
		}
		else if (digit == 2) {
			return "::|:|";
		}
		else if (digit == 3) {
			return "::||:";
		}
		else if (digit == 4) {
			return ":|::|";
		}
		else if (digit == 5) {
			return ":|:|:";
		}
		else if (digit == 6) {
			return ":||::";
		}
		else if (digit == 7) {
			return "|:::|";
		}
		else if (digit == 8) {
			return "|::|:";
		}
		else if (digit == 9) {
			return "|:|::";
		}
		else {
			//this should never happen!
			return "||||";
		}
	}

	public static String getBarCode(int zipcode) {
	
		String zipcodeString = zipcode + ""; //quick way to convert int to string, adding empty string
		String barCodeString = "";
		for (int i =0; i < zipcodeString.length(); i++) {
			char currentDigit = zipcodeString.charAt(i);
			String digitCode = getDigitCode(Integer.parseInt(currentDigit + ""));
			barCodeString += digitCode + " ";
		}

		return barCodeString;
	}

	public static void main(String[] args) {
		int zipcode = 8090340;
		String barcode = getBarCode(zipcode);
		System.out.println(barcode);

	}

}