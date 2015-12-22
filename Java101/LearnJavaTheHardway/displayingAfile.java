package JavaLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class displayingAfile {

	public static void main(String[] args) {
		System.out.println("Which file would you like to open?");
		try(BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			String fileName = br.readLine();
			displayFile(fileName);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	//use 2 backslashes to read input path
	private static void displayFile(String file) {
		File myFile = new File(file);
		try(Scanner scr = new Scanner(new FileReader(myFile))) {
			while (scr.hasNext()) {
				System.out.println(scr.nextLine());
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
