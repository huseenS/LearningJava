package JavaLearn;

public class XandY {

	public static void main(String[] args) {
		System.out.println("x Values: " + "/t" +  "Y values: ");
		System.out.println("------------------");
		XandYLoop();
	}
	
	public static void XandYLoop() {
		for (double x = -10; x <= 10; x+=0.5) {
				double y = x*x;
				System.out.println("\n" + x + "\t" + y);
			
		}
	}
	
}
