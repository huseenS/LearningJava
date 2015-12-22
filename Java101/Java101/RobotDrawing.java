// Include the libraries necessary for graphics
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;


class RobotDrawing extends JComponent {

    // This special method is automatically called when the scene needs to be drawn.
    public void paintComponent(Graphics g) {
       
        // Clear the background to white
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);

        // Draw a robot
        //g.setColor(Color.GRAY);  


        for (int i = 0; i < 50000; i++) {
            int anchorX = (int)(Math.random() * 800);
            int anchorY = (int)(Math.random() * 600);
            int headSize = (int)(Math.random() * 20);
            //RandomColor
            int red = (int)(Math.random() * 100);
            int green = (int)(Math.random() * 255);
            int blue = (int)(Math.random() * 255);

            g.setColor(new Color(red, green, blue));  

            // Draw head
            g.fillRect(anchorX, anchorY, headSize, headSize);

            g.fillRect(anchorX - headSize, anchorY + headSize, 3 * headSize, 5 * headSize);
        }



    }
	

    public static void main(String[] args) {

        RobotDrawing myRobot = new RobotDrawing();
        JFrame frame = new JFrame();

        // Set the size of the window
        frame.add(myRobot);

        // Set the title of the window
        frame.setTitle("My Robot");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

