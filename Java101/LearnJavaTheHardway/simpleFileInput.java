package JavaLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class simpleFileInput {

	public static void main(String[] args) {
		File name = new File("name.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(name))) {
			System.out.println("Using my psychic powers (aided by reading data from the file),"
					+ " I have determined that your name is " + br.readLine());
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}

}
