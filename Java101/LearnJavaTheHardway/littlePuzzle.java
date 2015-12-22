package JavaLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class littlePuzzle {

		public static void main(String[] args)  {
			
			try(BufferedReader reader = new BufferedReader
					(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
				System.out.println("Which file would you like to read from?");
				String fileName = reader.readLine();
				readPuzzle(fileName);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		
		private static void readPuzzle(String file) {
			File myFile = new File(file);
			try(Scanner scr = new Scanner(new FileReader(myFile))) {
				while (scr.hasNext()) {
					String line = scr.nextLine();
					char[] myChar = line.toCharArray();
					for (int i = 2; i < myChar.length; i+=3) {
						System.out.print(myChar[i]);
					}
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
}
