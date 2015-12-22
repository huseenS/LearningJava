package pokemon101;
 
import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
 
public class PokemonCheck {

    public static boolean PixelCheck(int pixelX, int pixelY, int pixelG, int pixelR, int pixelB) { //general method for checking if pixel is correct - returns true or false
          try {
            Thread.sleep(5000);
            Robot robot = new Robot();
            Color checkColor = robot.getPixelColor(pixelX, pixelY);

            System.out.println("Green = " + checkColor.getGreen());
            System.out.println("Red = " + checkColor.getRed());
            System.out.println("Blue = " + checkColor.getBlue());

            boolean isColor;

            if ((checkColor.getRed() == pixelR) && (checkColor.getGreen() == pixelG) && (checkColor.getBlue() == pixelB)) {
                isColor = true;
                return isColor;

            } else {
               isColor = false;
                return isColor;
            }
 
        } catch (AWTException e) {
            e.printStackTrace();
        }

        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("not working");
        return false;
    }

    public static boolean battleFound() {
       return PixelCheck(231,131,251,255,222); //green and red variables must be switched
    }

    public static boolean battleEnd() {
         return PixelCheck(90,165,212,244,208);
    }
    public static boolean battleCheckHealth() {
        return PixelCheck(585,363,174,71,77);
    } 
    public static boolean checkPP() {
        return PixelCheck(56,485,208,193,11);
    }
    public static boolean checkDeath() {
        return PixelCheck(585,383,212,244,208);
    }

    //better to use switch statement here, less code
    public static void main(String[] args) {
        if (battleFound()==true){
            System.out.println("true"); //just return true instead of print
        }
        else {
            System.out.println("keep walking"); //just return false instead of print
        }
         if (battleEnd()==true){
            System.out.println("true");
        }
        else {
            System.out.println("keep walking");
        }
        if (battleCheckHealth()==true){ //if health is red then run heal
            System.out.println("true");
        }
        else {
            System.out.println("keep walking"); //if health is not red then run battle or use return for Jack's to run
        }
        if (checkPP()==true){
            System.out.println("true"); //if pp is yellow then run heal
        }
        else {
            System.out.println("keep walking"); //if pp is not yellow then run battle or use return for jack's program to run battle
        }
        if (checkDeath()==true){
            System.out.println("true");
        }
        else {
            System.out.println("keep walking");
        }


    
    } 
} 


