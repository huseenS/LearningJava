package JavaLearn;

import java.util.Random;

public class flickerPhrase {
	
	public static void main( String[] args ){
		Random rng = new Random();
		int r;
		for ( int i=0; i<100000; i++ ) {
			r = 1 + rng.nextInt(5);
			try {
				switch (r) {
				case 1:
					first();
					Thread.sleep(500);
					break;
				case 2:
					second();
					Thread.sleep(500);
					break;
				case 3:
					third();
					Thread.sleep(500);
					break;
				case 4:
					fourth();
					Thread.sleep(500);
					break;
				case 5:
					fifth();
					break;
				}
				System.out.println("I pledge allegiance to the flag.");
			} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage()); }
		}
		
	}

	public static void first() {
		System.out.print("I                               \r");
	}

	public static void second() {
		System.out.print("  pledge                        \r");
	}

	public static void third() {
		System.out.print("         allegiance             \r");
	}

	public static void fourth() {
		System.out.print("                    to the      \r");
	}

	public static void fifth() {
		System.out.print("                           flag.\r");
	}
}