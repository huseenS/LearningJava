package pokemon101;
//import java.awt.AWTException; //platform config granted
//import java.awt.SecurityException; //robot permision granted
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.lang.Object; // probable useless import 
// import java.awt.IlegalArgumentException; // probable useless import



//not working as of now
public class PokemonMovement {



	Robot trainerRed = new Robot(); //need to override or add explicit constructor



	public void battleToMom() {

	}

	public void momToBattle() { //doing this via for loops //might need breaks!
		//throw exceptions??
		
			for (int r = 0; r <=7; r++) { // right movement
				trainerRed.delay(200); 
				trainerRed.keyPress(KeyEvent.VK_RIGHT); 
				trainerRed.delay(200);
				trainerRed.keyRelease(KeyEvent.VK_RIGHT);
			}

			for (int d = 0; d <=4; d++) { //down movement
				trainerRed.delay(200);
				trainerRed.keyPress(KeyEvent.VK_DOWN); 
				trainerRed.delay(200);
				trainerRed.keyRelease(KeyEvent.VK_DOWN);
			}

			for (int rtwo = 0; rtwo <=6; rtwo++) { // second right movement
				trainerRed.delay(200); 
				trainerRed.keyPress(KeyEvent.VK_RIGHT); 
				trainerRed.delay(200);
				trainerRed.keyRelease(KeyEvent.VK_RIGHT);
			}

			for (int u = 0; u <=15; u++) { //up movement
				trainerRed.delay(200); 
				trainerRed.keyPress(KeyEvent.VK_UP); 
				trainerRed.delay(200);
				trainerRed.keyRelease(KeyEvent.VK_UP);
			}

			for (int l = 0; l <=7;  l++) { //left to grass movement
				trainerRed.delay(200); 
				trainerRed.keyPress(KeyEvent.VK_LEFT); 
				trainerRed.delay(200);
				trainerRed.keyRelease(KeyEvent.VK_LEFT);
			}



	}

	public void battleOn() {

	}

	public void battleTwo() {

	}
	



	public static void main(String[] args) {
	//catch awtException
	// catch security Exception - if robot is not granted permission
	}
}


	
