// Include the libraries necessary for graphics
import java.awt.*;
import javax.swing.*;



// Create a subclass of JComponent
// This will allow us to draw graphics
class Mondrian extends JComponent {
    String signature = "Huseen Sufi";

    // This special method is automatically called when the scene needs to be drawn.
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0, 800,600);

        // PUT YOUR CODE TO PAINT MONDRIAN-STYLE IN HERE!!!!!!!!!!!!!!!!!!!!!!
        // You need to use the Graphics object called "g" to do the painting.

        // Here's an example of a line
            for (int i =0; i<=800; i+=50) {
              int  xValue =(int)(Math.random() * 800);
              int  yValue = (int)(Math.random() * 600);
              int rectangleX = (int) (Math.random() * 100);
              int rectangleY = (int) (Math.random() * 200);
            
                Color myColor = new Color(150, 15, 13);
                g.setColor(myColor);
                g.fillRect(0, yValue, 800, 5);
                g.setColor(Color.blue);
                g.fillRect(xValue, yValue, rectangleX, rectangleY);
            }
    }
    public static void main(String[] args) {
        Mondrian my_mondrian = new Mondrian();
        JFrame frame = new JFrame();

        // Set the size of the window
        frame.add(my_mondrian);

        // Set the title of the window
        frame.setTitle("Mondrian Art!");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}