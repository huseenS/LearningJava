package vectors;
public class Vector {

	//instance variables
	private int vectorX;
	private int vectorY;
	
	//methods
	public Vector(double d, double e) {
		vectorX = (int) d;
		vectorY = (int) e;
	}

	public int getX() {
		return vectorX;
	}
	public int getY() {
		return vectorY;
	}

	public int normL1() {
		int vectorXabs = Math.abs(vectorX);
		int vectorYabs = Math.abs(vectorY);
		int vectorAbosolute = vectorXabs + vectorYabs;
		return vectorAbosolute;
	}


	public double norml2() {
		double vectorXSquared = vectorX  * vectorX; 
		double vectorYSquared =  vectorY * vectorY;
		double vectorXYsquaredSum = vectorXSquared + vectorYSquared;
		double vectorMagnitude = Math.sqrt(vectorXYsquaredSum);
		return vectorMagnitude;
	}

	public Vector add(Vector vectorTwo)  {
		int addedX = vectorX + vectorTwo.getX();
		int addedY = vectorY + vectorTwo.getY();
		Vector addedVector = new Vector(addedX, addedY);
		return addedVector;
	}

	public Vector subtract(Vector vectorTwo) {
		int subtractedX = vectorX - vectorTwo.getX();
		int subtractedY = vectorY - vectorTwo.getY();
		Vector subtractedVector = new Vector(subtractedX, subtractedY);
		return subtractedVector;
	}

	public double dotProduct(Vector vectorTwo) {
		int vectorTwoXsquared = vectorX * vectorTwo.getX(); 
		int vectorTwoYsquared = vectorY * vectorTwo.getY();
		int vectorDotProduct = vectorTwoXsquared + vectorTwoYsquared;
		return vectorDotProduct;
	}

	public Vector scalarMultiply(int scalarValue) {
		int vectorXscalar = vectorX * scalarValue;
		int vectorYScalar = vectorY * scalarValue;
		Vector scalarVector = new Vector(vectorXscalar, vectorYScalar);
		return scalarVector;
		
	}
	public Vector getUnitVector() {
		double magnitude = norml2();
		Vector unitVector = new Vector(vectorX/ magnitude, vectorY/ magnitude);
		return unitVector;
	}

	public double angleofVector(Vector vectorTwo) {
		double vectorMagnitudeProduct = norml2() * vectorTwo.norml2();
		double  vectorDotProduct = dotProduct(vectorTwo);
		double angle = vectorDotProduct / vectorMagnitudeProduct;
		return	Math.acos(angle);
	}

	public String toString() {
		return vectorX + " " + vectorY;
	}


}