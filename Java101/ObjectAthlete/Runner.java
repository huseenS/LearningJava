package ObjectAthlete;
//
//
public class Runner extends Athlete {
	private String event;

	public Runner(String _name, String _major, String _event) {

		super(_name, _major);
		event = _event;
	}

	//public String toString() {
		//return "Runner of " + event;
	//}
}