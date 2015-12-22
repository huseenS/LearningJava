import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Redaction {

	public static void nameReplace(String infile, String outputFile, String nameReplace ) {
		try {
			File fileName = new File(infile);
			Scanner myScanner = new Scanner(fileName);
			PrintWriter myPW = new PrintWriter(outputFile);

		 	myScanner.useDelimiter(" ");

		 	while (myScanner.hasNext()) {
		 		String current = myScanner.next();
		 		current = " " + current.replaceAll(nameReplace, "an unknown person of unquestionably high moral caliber") + " ";
		 		myPW.write(current);
		 	}
		 	myPW.close();
		}
		catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e);
        }

	}


	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		System.out.println("Input file ");
		String fileName = prompt.next();
		System.out.println("Output file ");
		String outputFileName = prompt.next();
		System.out.println("Name to be removed ");
		String name = prompt.next();

		nameReplace(fileName, outputFileName, name);
	}

}