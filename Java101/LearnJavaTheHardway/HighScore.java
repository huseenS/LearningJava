package JavaLearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class HighScore {

	public static void main(String[] args) {
		writeHighScore();

	}
	private static void writeHighScore() {
		System.out.println("You got a highScore!");
		try(BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			System.out.println("Please enter your name ");
			String userName = reader.readLine();
			System.out.println("Please enter your score: ");
			String userScore = reader.readLine();
			System.out.println("Data stored into score.txt");
			
			try(BufferedWriter bw = new BufferedWriter
					(new OutputStreamWriter(new FileOutputStream("score.txt")))) {
				bw.write(userName);
				bw.newLine();
				bw.write(userScore);
			} catch (IOException e) {
				System.err.println(e);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}


}
