package JavaLearn;

public class NoticingEvenNumbers {

	public static void main(String[] args) {
		MarkEvenNumbers();
	}
	
	public static void MarkEvenNumbers() {
		for ( int i = 1; i <=20; i++ ) {
			if ( i % 2 == 0 ) {
				System.out.print("*");
			}
			else {
				System.out.print("#");
			}
			System.out.println(i);
		}
	}
}
