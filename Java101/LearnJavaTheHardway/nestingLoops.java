package JavaLearn;

public class nestingLoops {
	
	public static void main( String[] args ) {
		// this is #1 - I'll call it "CN"
		for ( int c=1; c <= 3; c++ ) {
			for ( char n ='A'; n <= 'E'; n++ ) {
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.println( a + "-" + b + " " );
			}
			System.out.println(a);
		}

		System.out.println("\n");

	}
}