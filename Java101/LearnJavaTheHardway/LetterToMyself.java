package JavaLearn;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class LetterToMyself {

	public static void main(String[] args) {
		try(BufferedWriter writer = new  BufferedWriter
				(new OutputStreamWriter(new FileOutputStream("LettertoMyself.txt"), "utf-8"))) {
				writer.write("+-------------------------------");
				writer.newLine();
				writer.write("|                           ####");
				writer.newLine();
				writer.write("|                           ####");
				writer.newLine();
				writer.write( "|                           ####");
				writer.newLine();
				writer.write("|                              |");
				writer.newLine();
				writer.write("|                              |");
				writer.newLine();
				writer.write("|                              |");
				writer.newLine();
				writer.write( "|          Bill Gates          |");
				writer.newLine(); 
				writer.write("|          1 MicrosoftWay      |");
				writer.newLine();
				writer.write("|          Redmond, WA  98104  |");
				writer.newLine();
				writer.write("+------------------------------+");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}