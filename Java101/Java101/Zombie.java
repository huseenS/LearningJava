





public class Zombie {

	//instance variables

	private String name;
	private int brainsConsumed;


	//methods

	//constructor - always public, name match to class, (incoming input)
	public Zombie(String _name) {
		name = _name;
		brainsConsumed = 0; 
	}

	public void groan() { //no static = need zombie object, Static = no object/instance variables
		System.out.println(name + " says Grrrr");
	}
}