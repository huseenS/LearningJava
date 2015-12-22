public class PiEstimator {

	public static final int NUMBER_THROWS = 100000;

		public static void main(String[] args) {

			int hits = 0;
			for (int i = 0; i < NUMBER_THROWS; i++) {
				double x = -1 + 2 * Math.random();
				double y = -1 + 2 * Math.random();

				if ( x * x + y * y <= 1) {
					hits++;
					//end if
				}
				System.out.println("PIE " + 4.0*hits /(i+1));

					
			}
		}	
}