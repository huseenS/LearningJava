package ObjectAthlete;
//
//
public class Athlete {

	 String name;
	 String major;
	 int hoursPracticed;
	 double shoeSize;

	public Athlete(String _name, String _major) {
	
		name =  _name;
		major = _major; 

	}
	public void setShoeSize(double newSize) {
		newSize = shoeSize;
	}
	public double getShoeSize() {
		return shoeSize;
	}

	public String toString() {
		return name + " " + major;
	} //overriding this function 



}