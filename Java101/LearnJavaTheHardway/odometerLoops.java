package JavaLearn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class odometerLoops {
	static int userNumber;
	public static void main( String[] args ) throws Exception {
		odometer(userNumber);
	}
	
	private static void odometer(int userNumber) {
		try(BufferedReader reader = new BufferedReader
				(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			System.out.println("Which Base: ");
			userNumber = Integer.parseInt(reader.readLine());
		 
			for ( int thous=0; thous<userNumber; thous++ ) {
			 
				for ( int hund=0; hund<userNumber; hund++ ) {
            	
					for ( int tens=0; tens<userNumber; tens++ ) {
                	
						for ( int ones=0; ones<userNumber; ones++ ) {
							System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
							Thread.sleep(10);
                        }
					}
				}
			}
			
		} catch (IOException | InterruptedException e) {
			System.err.println(e);
		}
	}
}
