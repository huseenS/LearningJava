import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class BookEncrypt {

    public static char encrypt(char plainChar, int key) {
        return (char)(plainChar + key);
    }

    public static void encryptText(String inputFilename, String outputFilename, int key) {
        try {
            File inputFile = new File(inputFilename);
            Scanner myScanner = new Scanner(inputFile);
            PrintWriter myPW = new PrintWriter(outputFilename);
            
            // Set to scan each character
            myScanner.useDelimiter("");

            while (myScanner.hasNext()) {
                String current = myScanner.next();
                char currentChar = current.charAt(0);
                char encryptedChar = encrypt(currentChar, key);
                myPW.write(encryptedChar);
            }

            myPW.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e);
        }

    }


    public static void main(String[] args) {
        encryptText(args[0], args[1], Integer.parseInt(args[2]));
    }

}

