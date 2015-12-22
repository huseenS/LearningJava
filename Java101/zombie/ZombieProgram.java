package zombie;


public class ZombieProgram {

	public static void main(String[] args) {
		Zombie zom1 = new Zombie("Dave");
		Zombie zom2 = new Zombie("Phil");
		Zombie zom3 = new Zombie("Hannah");
		Zombie zom4 = new Zombie("Cindi");

		zom2.setName("Fil");
		zom2.groan();
		zom4.groan();
		zom3.groan();
		String zom1name = zom1.getName();



	}
}