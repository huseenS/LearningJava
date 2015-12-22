package pokemon101;




//pokemon tester screen



import java.awt.AWTException; 
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.imageio.ImageIO;
import java.io.*;

import java.io.File;
public class PokeTester{
    public static void main(String args[]){
        Robot robot;
        try {
            Thread.sleep(10000);
        } catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
                try 
        {
            robot=new Robot();
            BufferedImage gameScreen=robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(gameScreen, "jpg", new File("gameScreen.jpg"));
            //above line from http://stackoverflow.com/questions/18171734/using-robot-class-to-take-screenshot-would-like-to-reduce-filesize
            //http://processing.org/discourse/beta/num_1210415528.html this is for the code directly above and in the catch
        }
        catch(AWTException e)
        {e.printStackTrace();}
        catch (IOException e) {
            System.err.println("Something went wrong writing files");
            e.printStackTrace();}


    }
    
}
