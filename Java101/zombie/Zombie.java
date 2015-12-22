package zombie;


public class Zombie {

	//instance variables

	private String name;
	private int brainsConsumed;


	//methods

	//constructor - always public, name match to class, (incoming input)
	public Zombie(String _name) {
		name = _name;
		this.setBrainsConsumed(0); 
	}

	public void groan() { //no static = need zombie object, Static = no object/instance variables
		System.out.println(name + " says Grrrr");
	}

	public String getName() { //getter method allows access to private variable
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getBrainsConsumed() {
		return brainsConsumed;
	}

	public void setBrainsConsumed(int brainsConsumed) {
		this.brainsConsumed = brainsConsumed;
	}
	
}