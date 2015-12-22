package JavaLearn;


public class armStrongNumbers {

	public static void main(String[] args) {
		armStrong();
	}
	private static void armStrong() {
		for (int i = 1; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				for (int k = 0; k < 10; k++) {
					int armstrong = ((i*100)+(j*10)+k);
					if ((Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) == armstrong){
						System.out.println(armstrong);
					}
				}
			}
		}
	}
}
