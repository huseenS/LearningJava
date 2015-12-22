package JavaLearn;


public class monthName {
	
	public static void main(String[] args) {
		try {
			System.out.println( "Month 1: " + monthOffSet(1) );
			System.out.println( "Month 2: " + monthOffSet(2) );
			System.out.println( "Month 3: " + monthOffSet(3) );
			System.out.println( "Month 4: " + monthOffSet(4) );
			System.out.println( "Month 5: " + monthOffSet(5) );
			System.out.println( "Month 6: " + monthOffSet(6) );
			System.out.println( "Month 7: " + monthOffSet(7) );
			System.out.println( "Month 8: " + monthOffSet(8) );
			System.out.println( "Month 9: " + monthOffSet(9) );
			System.out.println( "Month 10: " + monthOffSet(10) );
			System.out.println( "Month 11: " + monthOffSet(11) );
			System.out.println( "Month 12: " + monthOffSet(12) );
			System.out.println( "Month 43: " + monthOffSet(43) );
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
	}

	public static String monthOffSet(int monthNumber) {
		String[] monthArray = {"1", "4", "4", "0",
				"2", "5", "0", "3", "6",
				"1", "4", "6"};
		return monthArray[monthNumber - 1];
	}
	
	public static String whatMonth(int monthNumber) {
		String[] monthArray = {"januarary", "febuarary", "March", "April",
								"May", "June", "July", "August", "September",
								"October", "November", "December"};
		return monthArray[monthNumber -1];
	}
}
