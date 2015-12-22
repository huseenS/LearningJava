package JavaLearn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class areaCalculator {
	
	
	public static void main(String[] args) {
		
		System.out.println("Shape Area Calculator");
		System.out.println(" 1) Triangle" + "\n 2) Rectangle" +  "\n 3) Square"
						  + "\n 4) Circle" + "\n 5) Quit ");
		System.out.println("Which Shape ?");
		try(BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			String shapeChoice = keyboard.readLine();
			
			if (shapeChoice.equals("1")) {
				areaTriangle(keyboard);
			}
			else if (shapeChoice.equals("2")) {
				areaRectangle(keyboard);
			} else if (shapeChoice.equals("3")) {
				areaSquare(keyboard);
			} else if (shapeChoice.equals("4")) {
				areaCirlcle(keyboard);
			} else {
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("error" + e);
			System.exit(1);
		}
	}
	
	
	public static double areaCirlcle(BufferedReader keyboard ) {
		double area = 0;
		try {
			double radius;
			System.out.println("Enter radius");
			radius = Double.parseDouble(keyboard.readLine());
			area = Math.PI * Math.pow(radius, 2);
		} catch (IOException e) {
			System.out.println("error " + e);
		}	
		System.out.println("The area is " + area);
		return area;
	}
	
	public static int areaRectangle(BufferedReader input) {
		int length;
		int width; 
		int area = 0;
		
		try {
			System.out.println("Enter length:");
			length = Integer.parseInt(input.readLine());
			System.out.println("Enter width");
			width = Integer.parseInt(input.readLine());
			area = length * width;
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		System.out.println("The area is " + area);
		return area;
	}
	
	public static int areaSquare( BufferedReader input ) {
		int side;
		int area = 0;
		
		try {
			System.out.println("Enter Side:");
			side = Integer.parseInt(input.readLine());
			area = side * side;
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("The area is " + area);
		return area;
	}
	
	public static double areaTriangle(BufferedReader input ) {
		int base = 0;
		int height = 0;
		double area = 0;
		
		try {
			System.out.println("Enter height:");
			height = Integer.parseInt(input.readLine());
			System.out.println("Enter base: ");
			base = input.read();
			area = base * height / 2;
			
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("The area is S" + area);
		return area;
	}
	
}
